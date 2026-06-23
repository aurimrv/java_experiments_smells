import os
import glob
import csv

# =============================================================================
# CONFIGURAÇÕES
# =============================================================================
LISTA_PROJETOS = "01Max,02MaxMin,03MaxMin,04MaxMin,05Ordenacao,06Fibonacci,07Fibonacci,08MaxMin,09Ordenacao,10AvaliaMultMatrizes,11ListArray,12Lista,13Pilha,14Pilha,15Fila,16Fila,17Ordenacao,18FPHeapMax,19FPHeapMin,20Tabela,21ArvoreBinaria,22TabelaHash,23TabelaHash,24Grafo,25Grafo,26Grafo,27Grafo,28BuscaEmLargura,29Grafo,30Lista,31CasamentoExato,32CasamentoAproximado,33Identifier"

INPUT_DIR   = "./resultados_ts_detect-improved/<Projeto>"
OUTPUT_FILE = "./resultados_ts_detect-improved/<Projeto>/Output_TestSmellDetection.csv"
# =============================================================================


def find_csv_files(directory: str, output_path: str) -> list[str]:
    """Busca recursivamente todos os arquivos .csv dentro do diretório."""
    pattern = os.path.join(directory, "**", "*.csv")
    files = glob.glob(pattern, recursive=True)
    # Garante que o arquivo de saída não seja incluído caso esteja no mesmo diretório
    files = [f for f in files if os.path.abspath(f) != os.path.abspath(output_path)]
    return sorted(files)


def merge_csv_files(csv_files: list[str], output_path: str) -> None:
    """Junta todos os CSVs em um único arquivo, mantendo o cabeçalho apenas uma vez."""
    if not csv_files:
        print("  Nenhum arquivo .csv encontrado.")
        return

    header_written = False
    total_rows = 0

    with open(output_path, mode="w", newline="", encoding="utf-8") as outfile:
        writer = None

        for filepath in csv_files:
            print(f"  Processando: {filepath}")
            try:
                with open(filepath, mode="r", newline="", encoding="utf-8") as infile:
                    reader = csv.DictReader(infile)

                    if not header_written:
                        writer = csv.DictWriter(outfile, fieldnames=reader.fieldnames)
                        writer.writeheader()
                        header_written = True

                    rows = list(reader)
                    writer.writerows(rows)
                    total_rows += len(rows)

            except Exception as e:
                print(f"  [ERRO] Não foi possível processar '{filepath}': {e}")

    print(f"  ✅ Concluído! {total_rows} linhas de {len(csv_files)} arquivo(s) gravadas em '{output_path}'.")


def main(projeto: str) -> None:
    input_dir   = INPUT_DIR.replace("<Projeto>", projeto)
    output_file = OUTPUT_FILE.replace("<Projeto>", projeto)

    print(f"\n{'='*60}")
    print(f"📁 Projeto: {projeto}")
    print(f"{'='*60}")

    if not os.path.isdir(input_dir):
        print(f"  [ERRO] Diretório não encontrado: '{input_dir}'")
        return

    print(f"  🔍 Buscando arquivos .csv em: {os.path.abspath(input_dir)}")
    csv_files = find_csv_files(input_dir, output_file)

    if not csv_files:
        print("  Nenhum arquivo .csv encontrado no diretório informado.")
        return

    print(f"  📄 {len(csv_files)} arquivo(s) encontrado(s).")
    merge_csv_files(csv_files, output_file)


if __name__ == "__main__":
    projetos = [p.strip() for p in LISTA_PROJETOS.split(",") if p.strip()]
    print(f"🚀 Iniciando processamento de {len(projetos)} projeto(s)...")

    for projeto in projetos:
        main(projeto)

    print(f"\n🏁 Todos os projetos foram processados.")