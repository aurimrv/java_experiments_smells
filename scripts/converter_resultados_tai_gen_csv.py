import pandas as pd
import json
import os

# --- CONFIGURAÇÃO ---
lista_projetos =  "01Max,02MaxMin,03MaxMin,04MaxMin,05Ordenacao,06Fibonacci,07Fibonacci,08MaxMin,09Ordenacao,10AvaliaMultMatrizes,11ListArray,12Lista,13Pilha,14Pilha,15Fila,16Fila,17Ordenacao,18FPHeapMax,19FPHeapMin,20Tabela,21ArvoreBinaria,22TabelaHash,23TabelaHash,24Grafo,25Grafo,26Grafo,27Grafo,28BuscaEmLargura,29Grafo,30Lista,31CasamentoExato,32CasamentoAproximado,33Identifier"
template_entrada = "resultados_tai_gen-improved/<nomeProjeto>/tai_gen_improved_consolidado-<nomeProjeto>.json"
template_saida = "resultados_tai_gen-improved/<nomeProjeto>/tai_gen_improved_consolidado-<nomeProjeto>.csv"


def extrair_todas_propriedades(dados_json, prefixo='', dicionario_linha=None):
    if dicionario_linha is None:
        dicionario_linha = {}

    if isinstance(dados_json, dict):
        for chave, valor in dados_json.items():
            novo_prefixo = f"{prefixo}{chave}_" if prefixo else f"{chave}_"
            extrair_todas_propriedades(valor, novo_prefixo, dicionario_linha)
    elif isinstance(dados_json, list):
        for i, item in enumerate(dados_json):
            novo_prefixo = f"{prefixo}{i}_"
            extrair_todas_propriedades(item, novo_prefixo, dicionario_linha)
    else:
        nome_coluna = prefixo.rstrip('_')
        dicionario_linha[nome_coluna] = dados_json

    return dicionario_linha


def converter_json_para_csv(input_path, output_path):
    try:
        if not os.path.exists(input_path):
            print(f"⚠️ Arquivo não encontrado: {input_path}")
            return

        with open(input_path, 'r', encoding='utf-8') as f:
            conteudo = json.load(f)

        lista_linhas_processadas = []
        for objeto in conteudo:
            linha = extrair_todas_propriedades(objeto)
            lista_linhas_processadas.append(linha)

        df = pd.DataFrame(lista_linhas_processadas)

        # Garante que a pasta de saída existe
        os.makedirs(os.path.dirname(output_path), exist_ok=True)

        df.to_csv(output_path, index=False, encoding='utf-8')

        print(f"✅ Conversão finalizada para: {output_path}")
        print(f"📊 Total de colunas: {len(df.columns)}")

    except Exception as e:
        print(f"❌ Erro ao processar {input_path}: {e}")


if __name__ == "__main__":
    # Transforma a string em lista e itera
    projetos = [p.strip() for p in lista_projetos.split(',')]

    for projeto in projetos:
        arquivo_in = template_entrada.replace("<nomeProjeto>", projeto)
        arquivo_out = template_saida.replace("<nomeProjeto>", projeto)

        print(f"\nProcessando projeto: {projeto}")
        converter_json_para_csv(arquivo_in, arquivo_out)
