import os
import subprocess

# ================= CONFIGURAÇÕES =================
LISTA_PROJETOS = "01Max,02MaxMin,03MaxMin,04MaxMin,05Ordenacao,06Fibonacci,07Fibonacci,08MaxMin,09Ordenacao,10AvaliaMultMatrizes,11ListArray,12Lista,13Pilha,14Pilha,15Fila,16Fila,17Ordenacao,18FPHeapMax,19FPHeapMin,20Tabela,21ArvoreBinaria,22TabelaHash,23TabelaHash,24Grafo,25Grafo,26Grafo,27Grafo,28BuscaEmLargura,29Grafo,30Lista,31CasamentoExato,32CasamentoAproximado,33Identifier"
CAMINHO_DA_PASTA = "configs-ts-detect-improved/<Projeto>"
CAMINHO_JAR = "/home/user/projetos/ufscar/TSDetect/TestSmellDetector.jar"
PASTA_SAIDA = "resultados_ts_detect-improved/<Projeto>"
# =================================================


def processar_test_smells(projeto):
    pasta_origem_abs = os.path.abspath(CAMINHO_DA_PASTA.replace("<Projeto>", projeto))
    pasta_saida_base = os.path.abspath(PASTA_SAIDA.replace("<Projeto>", projeto))
    jar_abs = os.path.abspath(CAMINHO_JAR)

    print(f"\n{'=' * 50}")
    print(f"Processando projeto: {projeto}")
    print(f"{'=' * 50}")

    if not os.path.exists(jar_abs):
        print(f"ERRO: JAR não encontrado em: {jar_abs}")
        return

    if not os.path.isdir(pasta_origem_abs):
        print(f"ERRO: Diretório de origem não existe: {pasta_origem_abs}")
        return

    arquivos_csv = [f for f in os.listdir(pasta_origem_abs)
                    if f.lower().endswith('.csv') and os.path.isfile(os.path.join(pasta_origem_abs, f))]

    if not arquivos_csv:
        print(f"Nenhum CSV encontrado.")
        return

    for arquivo in arquivos_csv:
        nome_base = os.path.splitext(arquivo)[0]
        partes = nome_base.split('-')
        ultima_parte = partes[-1].strip()

        subpasta_destino = os.path.join(pasta_saida_base, ultima_parte)
        if not os.path.exists(subpasta_destino):
            os.makedirs(subpasta_destino)

        caminho_completo_csv = os.path.join(pasta_origem_abs, arquivo)

        comando = f'cd "{subpasta_destino}" && java -Xmx2048m -jar "{jar_abs}" "{caminho_completo_csv}"'

        print("-" * 50)
        print(f"ARQUIVO: {arquivo}")
        print(f"SUBPASTA: {ultima_parte}")
        print(f"COMANDO:\n{comando}")
        print("-" * 50)

        try:
            subprocess.run(comando, shell=True, check=True)
            print(f"OK: Processado com sucesso.\n")
        except subprocess.CalledProcessError as e:
            print(f"ERRO ao processar {arquivo}: {e}\n")


# --- EXECUÇÃO ---
if __name__ == "__main__":
    for projeto in [p.strip() for p in LISTA_PROJETOS.split(',')]:
        processar_test_smells(projeto)
