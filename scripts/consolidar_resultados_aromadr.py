import json
import os
from datetime import datetime


def extrair_dados_json(caminho_arquivo, propriedade_alvo):
    try:
        with open(caminho_arquivo, 'r', encoding='utf-8') as f:
            dados = json.load(f)

        total_tamanho = 0
        test_file_valor = None

        def buscar_recursivo(obj):
            nonlocal total_tamanho, test_file_valor
            if isinstance(obj, dict):
                for chave, valor in obj.items():
                    if chave == propriedade_alvo and isinstance(valor, list):
                        total_tamanho += len(valor)
                    elif chave == "testFile":
                        test_file_valor = valor
                    buscar_recursivo(valor)
            elif isinstance(obj, list):
                for item in obj:
                    buscar_recursivo(item)

        buscar_recursivo(dados)
        return total_tamanho, test_file_valor
    except Exception as e:
        print(f"Erro ao ler {caminho_arquivo}: {e}")
        return 0, None


def limpar_nome_arquivo(caminho_completo):
    if not caminho_completo:
        return "desconhecido"
    # Pega apenas o nome do arquivo (ex: ClasseA.java) e remove a extensão (.java)
    nome_com_ext = os.path.basename(caminho_completo)
    return os.path.splitext(nome_com_ext)[0]


import os
import json

def processar_pastas(pasta_orig, pasta_comp, propriedade_alvo, json_saida):
    arquivos_orig = sorted([f for f in os.listdir(pasta_orig) if f.endswith('.json')])
    arquivos_comp = sorted([f for f in os.listdir(pasta_comp) if f.endswith('.json')])

    lista_resultados = []

    for f_orig, f_comp in zip(arquivos_orig, arquivos_comp):
        caminho_orig = os.path.join(pasta_orig, f_orig)
        caminho_comp = os.path.join(pasta_comp, f_comp)

        soma_orig, tf_orig = extrair_dados_json(caminho_orig, propriedade_alvo)
        soma_comp, tf_comp = extrair_dados_json(caminho_comp, propriedade_alvo)

        # Lógica do consolidado: (Orig - Comp) * -1
        diff = (soma_orig - soma_comp) * -1
        consolidado_str = f"{diff:+d}" if diff != 0 else "0"

        # Monta o objeto e adiciona na lista
        resultado = {
            "testFileOrig": tf_orig,
            "testFileComp": tf_comp,
            "original_total_size": soma_orig,
            "comparativo_total_size": soma_comp,
            "count_result": consolidado_str,
            "propriedade": propriedade_alvo
        }
        lista_resultados.append(resultado)

    # Escreve o array completo no arquivo informado (minificado)
    with open(json_saida, 'w', encoding='utf-8') as f:
        json.dump(lista_resultados, f, separators=(',', ':'))
    print(f"Gerado: {json_saida}")


# --- PARÂMETROS ---
dir_origem = "/resultados_analise_aromadr-01Max"
dir_comparacao = "/resultados_analise_aromadr-ia-01Max"
arquivo_saida = "resultados_consolidados_aromadr-01Max.json"
propriedade = "testSmells"

processar_pastas(dir_origem, dir_comparacao, propriedade, arquivo_saida)
