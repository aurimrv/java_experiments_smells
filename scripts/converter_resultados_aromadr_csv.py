import json
import csv
import os

# ================= CONFIGURAÇÕES =================
PASTA_ORIGEM = "resultados_aromadr-improved/33Identifier"  # Onde estão seus arquivos .json
ARQUIVO_SAIDA = "resultados_aromadr-improved/33Identifier/log_Evo.java_unificado.csv"
PROPRIEDADES_IGNORAR = ["test"]  # Adicione aqui o que deseja pular
CARACTERE_NULO = "-"  # Caractere para preencher espaços vazios
# =================================================

def extrair_valores_por_nome(objeto, dicionario_acumulador, ignorar):
    if isinstance(objeto, dict):
        for chave, valor in objeto.items():
            if chave in ignorar: continue
            if isinstance(valor, (dict, list)):
                extrair_valores_por_nome(valor, dicionario_acumulador, ignorar)
            else:
                if chave not in dicionario_acumulador:
                    dicionario_acumulador[chave] = []
                dicionario_acumulador[chave].append(valor)
    elif isinstance(objeto, list):
        for item in objeto:
            extrair_valores_por_nome(item, dicionario_acumulador, ignorar)


def normalizar_acumulador(dicionario_acumulador, caractere):
    if not dicionario_acumulador: return
    max_len = max(len(v) for v in dicionario_acumulador.values())
    for chave in dicionario_acumulador:
        while len(dicionario_acumulador[chave]) < max_len:
            dicionario_acumulador[chave].append(caractere)


def processar_pasta_completa():
    pasta_abs = os.path.abspath(PASTA_ORIGEM)
    arquivo_saida_abs = os.path.abspath(ARQUIVO_SAIDA)

    if not os.path.isdir(pasta_abs):
        print(f"ERRO: A pasta de origem '{pasta_abs}' não existe.")
        return

    # --- LÓGICA DE CRIAÇÃO DO DIRETÓRIO DE SAÍDA ---
    diretorio_saida = os.path.dirname(arquivo_saida_abs)
    if diretorio_saida and not os.path.exists(diretorio_saida):
        os.makedirs(diretorio_saida)
        print(f"Diretório de saída criado: {diretorio_saida}")

    arquivos = [f for f in os.listdir(pasta_abs) if f.lower().endswith('.json')]
    if not arquivos:
        print(f"Nenhum JSON encontrado.")
        return

    acumulador_geral = {}
    for arquivo in arquivos:
        try:
            with open(os.path.join(pasta_abs, arquivo), 'r', encoding='utf-8') as f:
                extrair_valores_por_nome(json.load(f), acumulador_geral, PROPRIEDADES_IGNORAR)
                normalizar_acumulador(acumulador_geral, CARACTERE_NULO)
                print(f"  [OK] {arquivo}")
        except Exception as e:
            print(f"  [ERRO] {arquivo}: {e}")

    if not acumulador_geral: return

    colunas = sorted(acumulador_geral.keys())
    total_linhas = len(next(iter(acumulador_geral.values())))

    try:
        # O modo 'w' cria o arquivo se ele não existir
        with open(arquivo_saida_abs, 'w', newline='', encoding='utf-8') as f_csv:
            writer = csv.DictWriter(f_csv, fieldnames=colunas)
            writer.writeheader()
            for i in range(total_linhas):
                writer.writerow({col: acumulador_geral[col][i] for col in colunas})

        print("-" * 30)
        print(f"SUCESSO! Gerado em: {arquivo_saida_abs}")
        print("-" * 30)
    except Exception as e:
        print(f"Erro ao gravar CSV: {e}")


if __name__ == "__main__":
    processar_pasta_completa()
