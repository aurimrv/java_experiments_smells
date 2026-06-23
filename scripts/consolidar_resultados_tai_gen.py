import json


def comparar_jsons_estruturados(caminho_orig, caminho_comp, nome_saida):
    try:
        with open(caminho_orig, 'r', encoding='utf-8') as f:
            dados_orig = json.load(f)

        with open(caminho_comp, 'r', encoding='utf-8') as f:
            dados_comp = json.load(f)

        resultado_final = []

        # Itera sobre os objetos principais de ambos os arquivos
        for obj_orig, obj_comp in zip(dados_orig, dados_comp):

            lista_v_orig = obj_orig.get("valor_extraido", [])
            lista_v_comp = obj_comp.get("valor_extraido", [])

            detalhes_comparados = []

            # Itera sobre os itens das listas 'valor_extraido'
            for v_orig, v_comp in zip(lista_v_orig, lista_v_comp):
                item_comparado = {
                    "practice_code": v_orig.get("practice_code"),
                    "total_methods-orig": v_orig.get("total_methods"),
                    "total_methods-comp": v_comp.get("total_methods"),
                    "compliance_score-orig": v_orig.get("compliance_score"),
                    "compliance_score-comp": v_comp.get("compliance_score")
                }
                detalhes_comparados.append(item_comparado)

            # Monta o objeto principal com a nova lista de resultados
            novo_objeto = {
                "arquivo-orig": obj_orig.get("arquivo"),
                "arquivo-comp": obj_comp.get("arquivo"),
                "resultados_extraidos": detalhes_comparados
            }

            resultado_final.append(novo_objeto)

        with open(nome_saida, 'w', encoding='utf-8') as f:
            json.dump(resultado_final, f, separators=(',', ':'))

        print(f"Sucesso! Arquivo '{nome_saida}' gerado com as listas comparadas.")

    except Exception as e:
        print(f"Erro ao processar: {e}")


# --- PARÂMETROS ---
json_original = "tai_gen_consolidado-01Max.json"
json_comparativo = "tai_gen_consolidado_improved-01Max.json"
arquivo_saida = "resultado_tai_gen_consolidado-01Max.json"

comparar_jsons_estruturados(json_original, json_comparativo, arquivo_saida)
