import pandas as pd


def comparar_intervalo_colunas(caminho_orig, caminho_comp, nome_saida, intervalo_str):
    try:
        # Converte a string "6..27" em uma lista de índices [6, 7, ..., 27]
        inicio, fim = map(int, intervalo_str.split('..'))
        # range(inicio, fim + 1) garante que o índice final (27) também seja incluído
        indices_colunas = list(range(inicio, fim + 1))

        df_orig = pd.read_csv(caminho_orig)
        df_comp = pd.read_csv(caminho_comp)
        df_resultado = pd.DataFrame()

        for idx in indices_colunas:
            nome_coluna = df_orig.columns[idx]
            coluna_orig = df_orig.iloc[:, idx]
            coluna_comp = df_comp.iloc[:, idx]

            resultados_coluna = []
            for val_orig, val_comp in zip(coluna_orig, coluna_comp):
                if val_orig == 0 and val_comp == 0:
                    resultados_coluna.append("-")
                else:
                    diferenca = (val_orig - val_comp) * -1
                    resultados_coluna.append(f"{diferenca:+d}" if diferenca != 0 else "0")

            df_resultado[nome_coluna] = resultados_coluna

        df_resultado.to_csv(nome_saida, index=False)
        print(f"Sucesso! Colunas de {inicio} a {fim} processadas em '{nome_saida}'.")

    except Exception as e:
        print(f"Erro ao processar: {e}")


# --- PARÂMETROS ---
arquivo_1 = "/home/user/projetos/ufscar/TSDetect/my-unit-tests/01Max/Output_TestSmellDetection_1775042795835.csv"
arquivo_2 = "/home/user/projetos/ufscar/TSDetect/my-unit-tests/01Max/Output_TestSmellDetection_1775056247550.csv"
arquivo_resultado = "resultado_ts_detect_consolidado-01Max.csv"

# Agora você passa o intervalo como string
meu_intervalo = "6..27"

# Execução
comparar_intervalo_colunas(arquivo_1, arquivo_2, arquivo_resultado, meu_intervalo)
