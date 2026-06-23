import json
import os


def extrair_valor_aninhado(dados, caminho):
    partes = caminho.replace('[', '.').replace(']', '').split('.')
    atual = dados
    for parte in partes:
        if not parte: continue
        try:
            if isinstance(atual, list):
                atual = [(item if item is not None else None) for item in atual]
                atual = atual[int(parte)]
            else:
                atual = atual[parte]
        except (KeyError, IndexError, ValueError, TypeError):
            return None
    return atual


def salvar_no_json_cumulativo(valor, nome_arquivo_origem, caminho_json_saida):
    # Garante que a pasta de destino exista antes de salvar
    os.makedirs(os.path.dirname(caminho_json_saida), exist_ok=True)

    dados_acumulados = []
    if os.path.exists(caminho_json_saida):
        try:
            with open(caminho_json_saida, 'r', encoding='utf-8') as f:
                dados_acumulados = json.load(f)
        except json.JSONDecodeError:
            dados_acumulados = []

    if isinstance(valor, dict):
        novo_item = valor.copy()
        novo_item["arquivo"] = nome_arquivo_origem
    else:
        novo_item = {
            "arquivo": nome_arquivo_origem,
            "valor_extraido": valor
        }

    dados_acumulados.append(novo_item)
    with open(caminho_json_saida, 'w', encoding='utf-8') as f:
        json.dump(dados_acumulados, f, indent=4, ensure_ascii=False)


def processar_pasta(diretorio_base, propriedade, caminho_json_out):
    if not os.path.isdir(diretorio_base):
        print(f"Aviso: O caminho '{diretorio_base}' não foi encontrado ou não é acessível.")
        return

    for raiz, pastas, arquivos in os.walk(diretorio_base):
        for nome_arquivo in arquivos:
            if nome_arquivo.endswith('.json') and nome_arquivo != os.path.basename(caminho_json_out):
                nome_completo_com_extensao = os.path.join(raiz, nome_arquivo)
                try:
                    with open(nome_completo_com_extensao, 'r', encoding='utf-8') as f:
                        dados = json.load(f)

                    valor = extrair_valor_aninhado(dados, propriedade)

                    if valor is not None:
                        salvar_no_json_cumulativo(valor, nome_completo_com_extensao, caminho_json_out)
                        print(f"Processado: {nome_completo_com_extensao}")
                except Exception as e:
                    print(f"Erro no arquivo {nome_arquivo}: {e}")


# --- PARÂMETROS ---
lista_projetos = "01Max,02MaxMin,03MaxMin,04MaxMin,05Ordenacao,06Fibonacci,07Fibonacci,08MaxMin,09Ordenacao,10AvaliaMultMatrizes,11ListArray,12Lista,13Pilha,14Pilha,15Fila,16Fila,17Ordenacao,18FPHeapMax,19FPHeapMin,20Tabela,21ArvoreBinaria,22TabelaHash,23TabelaHash,24Grafo,25Grafo,26Grafo,27Grafo,28BuscaEmLargura,29Grafo,30Lista,31CasamentoExato,32CasamentoAproximado,33Identifier"
pasta_input_template = "/home/user/projetos/ufscar/TAI-EvalGenTCS/improveds/<nomeProjeto>"
prop_alvo = "practices_report"
json_output_template = "resultados_tai_gen-improved/<nomeProjeto>/tai_gen_improved_consolidado-<nomeProjeto>.json"

# --- LÓGICA DE ITERAÇÃO ---
# 1. Transformamos a string em lista e removemos espaços extras
projetos = [p.strip() for p in lista_projetos.split(',')]

for projeto in projetos:
    # 2. Substituímos a substring <nomeProjeto> pelos valores reais
    pasta_atual = pasta_input_template.replace("<nomeProjeto>", projeto)
    json_out_atual = json_output_template.replace("<nomeProjeto>", projeto)

    print(f"\nIniciando processamento do projeto: {projeto}")
    processar_pasta(pasta_atual, prop_alvo, json_out_atual)
