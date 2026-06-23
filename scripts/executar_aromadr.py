import json
import requests
from pathlib import Path
from datetime import datetime

# ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,"
# --- CONFIGURAÇÕES ---
DIRETORIO_TESTES = "/home/user/projetos/ufscar/TAI-EvalGenTCS/improveds/33Identifier/seed9006/Evo/testset_2026-04-27_15-49-14"
PASTA_LOGS = "./resultados_aromadr-improved-old/33Identifier/re-improved"
URL_API = "http://localhost:3000/file-test-smells/detect"

# Filtros de exclusão de arquivos
SUFIXOS_IGNORAR = "IATest.java,scaffolding.java,0.java,1.java,2.java,3.java,4.java,5.java,6.java,7.java"
ARQUIVOS_IGNORAR = "Randoop.java,ErrorTest.java"

# Ex: "smells[].name"
FILTRO_ATRIBUTO = "testSuites[].tests[]"


def extrair_valor_filtrado(obj, caminho):
    partes = caminho.split('.')
    atual = obj
    try:
        for i, parte in enumerate(partes):
            if parte.endswith('[]'):
                chave = parte[:-2]
                lista = atual.get(chave, [])
                resto = ".".join(partes[i + 1:])
                if not resto: return lista
                return [extrair_valor_filtrado(item, resto) for item in lista]
            else:
                atual = atual.get(parte)
                if atual is None: return None
        return atual
    except:
        return None


def analisar_arquivos():
    path_logs = Path(PASTA_LOGS)
    path_logs.mkdir(parents=True, exist_ok=True)

    arquivos_java = list(Path(DIRETORIO_TESTES).rglob('*.java'))

    for arquivo in arquivos_java:
        nome_arq = arquivo.name
        if nome_arq in ARQUIVOS_IGNORAR.split(',') or any(
                nome_arq.endswith(s.strip()) for s in SUFIXOS_IGNORAR.split(',')):
            continue

        print(f"Analisando: {nome_arq}")

        try:
            payload = {
                "language": "java",
                "framework": "junit",
                "testFileContent": arquivo.read_text(encoding='utf-8')
            }

            response = requests.post(URL_API, json=payload, timeout=60)

            if response.status_code == 200:
                dados_originais = response.json()
                filtrado = extrair_valor_filtrado(dados_originais, FILTRO_ATRIBUTO) if FILTRO_ATRIBUTO else None

                # --- LÓGICA DE IDENTIFICAÇÃO DO ARQUIVO ---
                if filtrado is not None:
                    # Se o filtro retornou um dicionário, adiciona a chave nele
                    if isinstance(filtrado, dict):
                        resultado_final = filtrado
                        resultado_final["testFile"] = str(arquivo.resolve())
                    # Se retornou uma lista ou valor simples, envelopa em um novo objeto
                    else:
                        resultado_final = {
                            "testFile": str(arquivo.resolve()),
                            "data": filtrado
                        }
                else:
                    # Caso não aplique filtro, adiciona a propriedade ao JSON original
                    resultado_final = dados_originais
                    resultado_final["testFile"] = str(arquivo.resolve())

                # Salva o arquivo (Minificado)
                nome_log = path_logs / f"log_{nome_arq}_{datetime.now().strftime('%H%M%S%f')}.json"
                with open(nome_log, 'w', encoding='utf-8') as f:
                    json.dump(resultado_final, f, separators=(',', ':'))

        except Exception as e:
            print(f"Erro ao processar {nome_arq}: {e}")

    print(f"\nFinalizado! Verifique a pasta: {PASTA_LOGS}")


analisar_arquivos()
