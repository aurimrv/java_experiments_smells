import os

# ==================== CONFIGURAÇÕES (CONSTANTES) ====================
# Informe o caminho completo do diretório que deseja varrer
DIRETORIO_ALVO = r"/home/user/projetos/ufscar/java_experiments_smells"

# Informe o termo (ou parte do nome) que os arquivos devem conter para serem excluídos
TERMO_PESQUISA = "IATest"


# ====================================================================

def deletar_arquivos_por_nome(diretorio, termo):
    # Valida se o diretório realmente existe antes de começar
    if not os.path.exists(diretorio):
        print(f"Erro: O diretório '{diretorio}' não existe. Verifique o caminho.")
        return

    print(f"Iniciando a busca por arquivos contendo '{termo}' em: {diretorio}\n")
    contador_excluidos = 0

    # os.walk navega por todas as pastas e subpastas
    for pasta_atual, subpastas, arquivos in os.walk(diretorio):
        for arquivo in arquivos:
            # Verifica se o termo pesquisado está no nome do arquivo
            if termo.lower() in arquivo.lower():  # .lower() ignora maiúsculas/minúsculas
                caminho_completo = os.path.join(pasta_atual, arquivo)

                try:
                    # Remove o arquivo
                    os.remove(caminho_completo)
                    print(f"✓ Excluído: {caminho_completo}")
                    contador_excluidos += 1
                except Exception as e:
                    print(f"✕ Erro ao excluir {caminho_completo}: {e}")

    print(f"\n=== Processo concluído! Total de arquivos excluídos: {contador_excluidos} ===")


if __name__ == "__main__":
    # Executa a função
    deletar_arquivos_por_nome(DIRETORIO_ALVO, TERMO_PESQUISA)
