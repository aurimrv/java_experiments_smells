import json
import requests
from pathlib import Path
from datetime import datetime

# --- CONFIGURAÇÕES ---
LISTA_PROJETOS = "01Max,02MaxMin,03MaxMin,04MaxMin,05Ordenacao,06Fibonacci,07Fibonacci,08MaxMin,09Ordenacao,10AvaliaMultMatrizes,11ListArray,12Lista,13Pilha,14Pilha,15Fila,16Fila,17Ordenacao,18FPHeapMax,19FPHeapMin,20Tabela,21ArvoreBinaria,22TabelaHash,23TabelaHash,24Grafo,25Grafo,26Grafo,27Grafo,28BuscaEmLargura,29Grafo,30Lista,31CasamentoExato,32CasamentoAproximado,33Identifier"
DIRETORIO_TESTES = "/home/user/projetos/ufscar/TAI-EvalGenTCS/improveds/<Projeto>"
PASTA_LOGS = "./resultados_aromadr-improved/<Projeto>"
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
                if not resto:
                    return lista
                return [extrair_valor_filtrado(item, resto) for item in lista]
            else:
                atual = atual.get(parte)
                if atual is None:
                    return None
        return atual
    except:
        return None


def analisar_arquivos(projeto):
    diretorio = DIRETORIO_TESTES.replace("<Projeto>", projeto)
    pasta_logs = PASTA_LOGS.replace("<Projeto>", projeto)

    path_logs = Path(pasta_logs)
    path_logs.mkdir(parents=True, exist_ok=True)

    arquivos_java = list(Path(diretorio).rglob('*.java'))

    sufixos = [s.strip() for s in SUFIXOS_IGNORAR.split(',')]
    arquivos_ignorados = [a.strip() for a in ARQUIVOS_IGNORAR.split(',')]

    for arquivo in arquivos_java:
        nome_arq = arquivo.name

        if nome_arq in arquivos_ignorados or any(nome_arq.endswith(s) for s in sufixos):
            continue

        print(f"[{projeto}] Analisando: {nome_arq}")

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

                if filtrado is not None:
                    if isinstance(filtrado, dict):
                        resultado_final = filtrado
                        resultado_final["testFile"] = str(arquivo.resolve())
                    else:
                        resultado_final = {
                            "testFile": str(arquivo.resolve()),
                            "data": filtrado
                        }
                else:
                    resultado_final = dados_originais
                    resultado_final["testFile"] = str(arquivo.resolve())

                nome_log = path_logs / f"log_{nome_arq}_{datetime.now().strftime('%H%M%S%f')}.json"
                with open(nome_log, 'w', encoding='utf-8') as f:
                    json.dump(resultado_final, f, separators=(',', ':'))

        except Exception as e:
            print(f"[{projeto}] Erro ao processar {nome_arq}: {e}")

    print(f"\n[{projeto}] Finalizado! Verifique a pasta: {pasta_logs}")


# --- EXECUÇÃO ---
for projeto in [p.strip() for p in LISTA_PROJETOS.split(',')]:
    analisar_arquivos(projeto)
