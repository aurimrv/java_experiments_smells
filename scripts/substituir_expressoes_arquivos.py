import os

# ==================== CONFIGURAÇÕES (CONSTANTES) ====================
DIRETORIO_ALVO = r"/home/user/projetos/ufscar/java_experiments_smells/"
ARQUIVO_ALVO = "EvoIATest.java"

# Defina o texto antigo que deseja remover e o novo que vai entrar no lugar
TEXTO_ANTIGO = "public class Evo"
TEXTO_NOVO = "public class EvoIATest"
# ====================================================================

def substituir_texto_no_arquivo(caminho_arquivo, termo_antigo, termo_novo):
    try:
        # 1. Abre o arquivo em modo de leitura com codificação UTF-8
        with open(caminho_arquivo, 'r', encoding='utf-8') as arquivo:
            conteudo = arquivo.read()

        # 2. Verifica se o texto antigo realmente existe no arquivo
        if termo_antigo in conteudo:
            # Faz a substituição na string da memória
            conteudo_atualizado = conteudo.replace(termo_antigo, termo_novo)

            # 3. Abre o arquivo em modo de escrita e sobrescreve com o novo conteúdo
            with open(caminho_arquivo, 'w', encoding='utf-8') as arquivo:
                arquivo.write(conteudo_atualizado)

            print(f"✓ Alterado com sucesso: {caminho_arquivo}")
            return True
        else:
            # O arquivo existe, mas não continha o texto antigo informado
            return False

    except Exception as e:
        print(f"✕ Erro ao processar {caminho_arquivo}: {e}")
        return False


def iniciar_varredura():
    if not os.path.exists(DIRETORIO_ALVO):
        print(f"Erro: O diretório '{DIRETORIO_ALVO}' não existe.")
        return

    print(f"Iniciando busca por '{ARQUIVO_ALVO}' para substituir o texto...\n")
    contador_alterados = 0

    # os.walk percorre pastas e subpastas
    for pasta_atual, _, arquivos in os.walk(DIRETORIO_ALVO):
        if ARQUIVO_ALVO in arquivos:
            caminho_completo = os.path.join(pasta_atual, ARQUIVO_ALVO)

            # Executa a substituição
            foi_alterado = substituir_texto_no_arquivo(caminho_completo, TEXTO_ANTIGO, TEXTO_NOVO)
            if foi_alterado:
                contador_alterados += 1

    print(f"\n=== Processo concluído! Total de arquivos modificados: {contador_alterados} ===")


if __name__ == "__main__":
    iniciar_varredura()
