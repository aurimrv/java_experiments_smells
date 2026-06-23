import os

# ==============================================================================
# CONFIGURAÇÃO: Insira o caminho do diretório que você deseja limpar aqui embaixo
# Exemplos:
# Windows: "C:\\Usuarios\\Nome\\MinhaPasta" ou r"C:\Usuarios\Nome\MinhaPasta"
# Linux/Mac: "/home/usuario/minha_pasta"
# ==============================================================================
DIRETORIO_ALVO = r"/home/user/projetos/ufscar/my-results/V-03_CSV"


def excluir_arquivos_json(diretorio):
    # Verifica se o diretório configurado realmente existe
    if not os.path.exists(diretorio):
        print(f"Erro: O diretório '{diretorio}' não foi encontrado.")
        print("Por favor, verifique o caminho configurado na constante 'DIRETORIO_ALVO'.")
        return

    print(f"Iniciando a busca por arquivos .json em: {diretorio}\n")
    contador = 0

    # os.walk navega por todas as pastas e subpastas
    for pasta_atual, subpastas, arquivos in os.walk(diretorio):
        for arquivo in arquivos:
            # Verifica se a extensão do arquivo é .json (ignorando maiúsculas/minúsculas)
            if arquivo.lower().endswith('.json'):
                caminho_completo = os.path.join(pasta_atual, arquivo)

                try:
                    os.remove(caminho_completo)
                    print(f"Deletado: {caminho_completo}")
                    contador += 1
                except Exception as e:
                    print(f"Erro ao deletar {caminho_completo}: {e}")

    print(f"\nBusca finalizada. Total de arquivos .json deletados: {contador}")


if __name__ == "__main__":
    excluir_arquivos_json(DIRETORIO_ALVO)
