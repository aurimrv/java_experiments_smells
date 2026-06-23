import os
import shutil

# ==================== CONFIGURAÇÕES (CONSTANTES) ====================
DIRETORIO_ORIGEM = r"/home/user/projetos/ufscar/my-results/all-improveds-v03"
DIRETORIO_DESTINO = r"/home/user/projetos/ufscar/java_experiments_smells"

ARQUIVO_ALVO = "Evo.java"
SUFIXO_COPIA = "IATest"
# ====================================================================

def extrair_nome_seed(caminho_completo):
    """
    Varre as pastas do caminho (de trás para frente) e retorna o nome
    da primeira pasta que começar com 'seed'. Se não achar, retorna None.
    """
    partes_do_caminho = caminho_completo.split(os.sep)
    for parte in reversed(partes_do_caminho):
        if parte.lower().startswith("seed"):
            return parte
    return None

def mapear_arquivos_projeto(pasta_projeto, nome_arquivo):
    """
    Varre o projeto e retorna um dicionário onde a chave é o nome da pasta 'seed'
    e o valor é o caminho completo do arquivo encontrado nela.
    """
    mapa_seed_arquivos = {}
    for pasta_atual, _, arquivos in os.walk(pasta_projeto):
        if nome_arquivo in arquivos:
            caminho_completo = os.path.join(pasta_atual, nome_arquivo)
            seed = extrair_nome_seed(caminho_completo)
            if seed:
                mapa_seed_arquivos[seed] = caminho_completo
    return mapa_seed_arquivos

def processar_projetos_com_seed():
    if not os.path.exists(DIRETORIO_ORIGEM) or not os.path.exists(DIRETORIO_DESTINO):
        print("Erro: Verifique se os diretórios de ORIGEM e DESTINO existem.")
        return

    # Lista as pastas de projetos na raiz da Origem
    projetos_origem = [f for f in os.listdir(DIRETORIO_ORIGEM) if os.path.isdir(os.path.join(DIRETORIO_ORIGEM, f))]

    print(f"Iniciando o processamento de {len(projetos_origem)} possíveis projetos (Validando correspondência de Seeds)...\n")

    for projeto in projetos_origem:
        caminho_proj_origem = os.path.join(DIRETORIO_ORIGEM, projeto)
        caminho_proj_destino = os.path.join(DIRETORIO_DESTINO, projeto)

        # 1. Verifica se o projeto existe no Destino
        if not os.path.exists(caminho_proj_destino):
            print(f"[-] Ignorando projeto '{projeto}': Sem pasta correspondente no Destino.")
            continue

        print(f"[>] Processando projeto: {projeto}")

        # 2. Mapeia todos os arquivos alvos e seus respectivos 'seeds' na Origem e no Destino
        mapa_origem = mapear_arquivos_projeto(caminho_proj_origem, ARQUIVO_ALVO)
        mapa_destino = mapear_arquivos_projeto(caminho_proj_destino, ARQUIVO_ALVO)

        if not mapa_origem:
            print(f"  └─ Arquivo '{ARQUIVO_ALVO}' não foi encontrado em nenhuma pasta 'seed' na Origem.")
            continue

        # 3. Cruza os dados: para cada seed achado na Origem, procura o mesmo seed no Destino
        for seed, caminho_arquivo_origem in mapa_origem.items():
            if seed not in mapa_destino:
                print(f"  └─ [Aviso] Seed '{seed}' encontrado na Origem, mas não existe no Destino. Pulando este seed.")
                continue

            caminho_arquivo_destino = mapa_destino[seed]

            # 4. Prepara o novo nome com o sufixo preservando a extensão
            pasta_destino_final = os.path.dirname(caminho_arquivo_destino)
            nome_base, extensao = os.path.splitext(ARQUIVO_ALVO)
            novo_nome_arquivo = f"{nome_base}{SUFIXO_COPIA}{extensao}"
            caminho_novo_arquivo = os.path.join(pasta_destino_final, novo_nome_arquivo)

            # 5. Realiza a cópia
            try:
                shutil.copy2(caminho_arquivo_origem, caminho_novo_arquivo)
                print(f"  └─ ✓ Sucesso [{seed}]: Criado em -> {caminho_novo_arquivo}")
            except Exception as e:
                print(f"  └─ ✕ Erro ao copiar no [{seed}]: {e}")

    print("\n=== Processo de sincronização por Seed concluído! ===")

if __name__ == "__main__":
    processar_projetos_com_seed()








