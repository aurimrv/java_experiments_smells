import csv
from pathlib import Path

# ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"
# Configurações
NOME_PROJETO = '33Identifier'
DIRETORIO_ALVO = f'/home/user/projetos/ufscar/TAI-EvalGenTCS/improveds/{NOME_PROJETO}'
ARQUIVO_REFERENCIA = f'/home/user/projetos/ufscar/java_experiments_smells/{NOME_PROJETO}/src/main/java/ds/Identifier.java'
ARQUIVO_SAIDA = 'configs-ts-detect-improved/{NOME_PROJETO}/ts-detect-config-ia-{NomePastaArquivoJava}.csv'

NOMES_PARA_IGNORAR = "Randoop.java,ErrorTest.java"
SUFIXOS_PARA_IGNORAR = "IATest.java,scaffolding.java,0.java,1.java,2.java,3.java,4.java,5.java,6.java,7.java"

def mapear_arquivos_java():
    lista_nomes = {n.strip() for n in NOMES_PARA_IGNORAR.split(',')}
    lista_sufixos = [s.strip() for s in SUFIXOS_PARA_IGNORAR.split(',')]

    caminho_base = Path(DIRETORIO_ALVO)
    arquivos = list(caminho_base.rglob('*.java'))

    cont_ignorado = 0
    cont_mapeado = 0

    for arquivo in arquivos:
        nome_arquivo = arquivo.name  # Ex: "MeuArquivo.java"

        # Filtro 1: Nome exato
        if nome_arquivo in lista_nomes:
            cont_ignorado += 1
            continue

        # Filtro 2: Sufixo
        if any(nome_arquivo.endswith(sufixo) for sufixo in lista_sufixos):
            cont_ignorado += 1
            continue

        # Determina o nome da pasta do arquivo .java
        nome_pasta_arquivo_java = arquivo.parent.name

        # Monta o caminho do CSV substituindo os placeholders
        caminho_saida = ARQUIVO_SAIDA.format(
            NOME_PROJETO=NOME_PROJETO,
            NomePastaArquivoJava=nome_pasta_arquivo_java
        )

        # Garante que o diretório de saída existe
        Path(caminho_saida).parent.mkdir(parents=True, exist_ok=True)

        # Escreve o CSV individual para este arquivo .java
        with open(caminho_saida, mode='w', newline='', encoding='utf-8') as f:
            escritor = csv.writer(f)
            escritor.writerow([
                NOME_PROJETO,
                str(arquivo.resolve()),
                ARQUIVO_REFERENCIA
            ])

        cont_mapeado += 1

    print(f"Relatório gerado! Arquivos mapeados: {cont_mapeado}. Ignorados: {cont_ignorado}.")

mapear_arquivos_java()
