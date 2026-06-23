import os
import subprocess

# ================= CONFIGURAÇÕES =================
CAMINHO_DA_PASTA = "configs-ts-detect-improved/23TabelaHash/re-improved"
CAMINHO_JAR = "/home/user/projetos/ufscar/TSDetect/TestSmellDetector.jar"
PASTA_SAIDA = "resultados_ts_detect-improved/23TabelaHash/re-improved"
# =================================================

def processar_test_smells():
    pasta_origem_abs = os.path.abspath(CAMINHO_DA_PASTA)
    pasta_saida_base = os.path.abspath(PASTA_SAIDA)
    jar_abs = os.path.abspath(CAMINHO_JAR)

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
        # 1. Recupera a última parte do nome (split por '-')
        # Exemplo: "projeto-modulo-analise.csv" -> nome_base = "projeto-modulo-analise"
        nome_base = os.path.splitext(arquivo)[0]
        partes = nome_base.split('-')
        ultima_parte = partes[-1].strip()

        # 2. Define e cria a subpasta de destino específica
        subpasta_destino = os.path.join(pasta_saida_base, ultima_parte)
        if not os.path.exists(subpasta_destino):
            os.makedirs(subpasta_destino)

        caminho_completo_csv = os.path.join(pasta_origem_abs, arquivo)

        # 3. Monta o comando para executar dentro da subpasta específica
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


if __name__ == "__main__":
    processar_test_smells()
