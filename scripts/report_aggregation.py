#!/usr/bin/env python3
"""
aggregate_evo.py
----------------
Aggregates multiple EvoSuite seed CSV reports into a single CSV
with per-project/class SUM and AVERAGE across all seed runs.

Usage:
    python3 report_aggregation.py [Evo|EvoIATest][input_dir] [output_file]

Defaults:
    test_set    = test set
    input_dir   = current directory (searches for report-ds_seed*_Evo.csv)
    output_file = report-ds_AVG_Evo.csv
"""

import sys
import glob
import os
import pandas as pd

# ── Configuration ────────────────────────────────────────────────────────────

TEST_SET    = sys.argv[1] if len(sys.argv) > 1 else "Evo"
INPUT_DIR   = sys.argv[2] if len(sys.argv) > 2 else "."
OUTPUT_FILE = sys.argv[3] if len(sys.argv) > 3 else f"report-ds_AVG_{TEST_SET}.csv"

SEPARATOR   = ";"                       # column delimiter in the source CSVs
KEY_COLS    = ["PRJ", "CLASSE"]         # columns that identify each project/class
PCT_COLS    = ["Cobertura", "Escore"]   # columns stored as "NN%" strings
NUM_COLS    = ["Cobertos", "Gerados", "Mortos", "Total"]  # integer columns

# ── Helpers ──────────────────────────────────────────────────────────────────

def pct_to_float(series: pd.Series) -> pd.Series:
    """Convert '75%' → 75.0, handling NaN gracefully."""
    return (
        series.astype(str)
              .str.replace("%", "", regex=False)
              .replace("nan", float("nan"))
              .astype(float)
    )

def float_to_pct(series: pd.Series) -> pd.Series:
    """Convert 75.0 → '75%' (rounded to nearest integer)."""
    return series.round(0).astype("Int64").astype(str) + "%"

# ── Load files ───────────────────────────────────────────────────────────────

pattern = os.path.join(INPUT_DIR, f"report-ds.seed*.{TEST_SET}.csv")
files   = sorted(glob.glob(pattern))

if not files:
    sys.exit(f"[ERROR] No files matching '{pattern}' found.")

print(f"Found {len(files)} seed file(s):")
for f in files:
    print(f"  {os.path.basename(f)}")

frames = []
for f in files:
    df = pd.read_csv(f, sep=SEPARATOR)
    seed = os.path.basename(f)          # keep origin for debugging if needed
    df["_seed"] = seed
    frames.append(df)

combined = pd.concat(frames, ignore_index=True)
print(f"\nTotal rows loaded: {len(combined)}")

# ── Convert percentage columns to numeric ────────────────────────────────────

for col in PCT_COLS:
    combined[col] = pct_to_float(combined[col])

# ── Aggregate ────────────────────────────────────────────────────────────────
# Group by project/class; a class absent in a seed contributes NaN (not 0),
# so we use sum(min_count=1) / count only over present rows.
# If you prefer to treat missing runs as 0, replace skipna=True with fill_value=0.

numeric_cols = NUM_COLS + PCT_COLS
agg_cols     = KEY_COLS + numeric_cols

grouped = combined[agg_cols].groupby(KEY_COLS, sort=False)

df_sum  = grouped[numeric_cols].sum(min_count=1).reset_index()   # NaN if never present
df_mean = grouped[numeric_cols].mean().reset_index()
df_cnt  = grouped[numeric_cols[0]].count().reset_index(name="N_runs")

# ── Build output DataFrame ───────────────────────────────────────────────────

def build_output(df_key: pd.DataFrame, df_vals: pd.DataFrame,
                 label: str) -> pd.DataFrame:
    out = df_key.copy()
    for col in NUM_COLS:
        out[col] = df_vals[col].round(2)
    for col in PCT_COLS:
        out[col] = df_vals[col].round(2)
    return out

# ── Round numeric cols for SUM (they should be integers) ────────────────────

df_sum_out = df_sum.copy()
for col in NUM_COLS:
    df_sum_out[col] = df_sum_out[col].round(0).astype("Int64")
for col in PCT_COLS:
    df_sum_out[col] = df_sum_out[col].round(2)

df_avg_out = df_mean.copy()
for col in NUM_COLS:
    df_avg_out[col] = df_avg_out[col].round(2)
for col in PCT_COLS:
    df_avg_out[col] = df_avg_out[col].round(2)

# ── Restore percentage format ────────────────────────────────────────────────

def apply_pct_format(df: pd.DataFrame) -> pd.DataFrame:
    df = df.copy()
    for col in PCT_COLS:
        df[col] = df[col].apply(
            lambda v: f"{v:.2f}%" if pd.notna(v) else ""
        )
    return df

df_sum_out = apply_pct_format(df_sum_out)
df_avg_out = apply_pct_format(df_avg_out)

# ── Write output ─────────────────────────────────────────────────────────────
# Layout: SUM block, blank separator row, AVG block, blank separator, run count

output_path = os.path.join(INPUT_DIR, OUTPUT_FILE) if INPUT_DIR != "." \
              else OUTPUT_FILE

with open(output_path, "w", newline="", encoding="utf-8") as fout:
    # Header comment
    fout.write(f"# Aggregated from {len(files)} seed runs\n")

    # SUM section
    fout.write("# --- SUM ---\n")
    df_sum_out.to_csv(fout, sep=SEPARATOR, index=False)

    # Blank separator
    fout.write("\n")

    # AVG section
    fout.write("# --- AVERAGE ---\n")
    df_avg_out.to_csv(fout, sep=SEPARATOR, index=False)

    # Blank separator
    fout.write("\n")

    # Run count per class (useful for classes that appeared in fewer runs)
    fout.write("# --- N_RUNS per class ---\n")
    df_cnt.merge(df_sum[KEY_COLS], on=KEY_COLS).to_csv(fout, sep=SEPARATOR, index=False)

print(f"\nOutput written to: {output_path}")
print(f"  Projects/classes: {len(df_sum_out)}")
print(f"  Seed runs merged: {len(files)}")

# ── Quick sanity preview ─────────────────────────────────────────────────────
print("\n── AVG preview (first 5 rows) ──────────────────────────────────────")
print(df_avg_out.head().to_string(index=False))
