from utils.cls import cls
from art import *
from utils.gen_pessoa import gen_pessoa
from utils import config
import requests

minhas_hos = []
hoteis = ["UNIFESSPA_PALACE", "VERDES_MARES_VILLAGE",
          "PARTAGE_VILLAGE", "UFPA_PALACE"]


def init():
    while True:
        cls()
        tprint("Hospedagem    :)", font="doom")
        print("1 - Comprar hospedagem")
        print("2 - Minhas hospedagens")
        print("0 - Voltar")
        user = int(input("> "))
        if user == 0:
            break

        if user == 1:
            comprar_hospedagem()
        elif user == 2:
            minhas_hospedagens()


def comprar_hospedagem():
    cls()
    print("Qual hotel deseja se hospedar?")
    for i in range(len(hoteis)):
        print(f"{i+1} - "+hoteis[i].replace("_", " "))
    hotel = hoteis[int(input("> "))-1]

    data_entrada = parse_date(input("Insira a data de entrada (dd/MM/yyyy): "))
    data_saida = parse_date(input("Insira a data de saida (dd/MM/yyyy): "))
    quartos = [int(input("Insira a quantidade de quartos: "))]
    qtde_pessoas = int(input("Insira a quantidade de pessoas: "))

    body = {
        "hotel": hotel,
        "data_entrada": data_entrada,
        "data_saida": data_saida,
        "quartos": quartos,
        "pessoas": [gen_pessoa(i) for i in range(qtde_pessoas)],
        "pagamento": {
            "numero_cartao": "1234 4567 8901 1234",
            "validade": "03/24",
            "nome_escrito": "unifesspakkkk",
            "cvv": 666,
            "parcelamento": 12
        }
    }

    res = requests.post(config.BASE_PATH+"/hospedagens", json=body)
    if res.status_code == 200:
        minhas_hos.append(res.json()["hospedagens"][0]["id"])
        print("Compra realizada com sucesso!")
    else:
        print("Erro ao comprar hospedagem!")
    input("Pressione qualquer tecla para sair...")



    


def minhas_hospedagens():
    for i in range(len(minhas_hos)):
        cls()
        print(f"Hospedagem {i+1}: {minhas_hos[i]}")
    input("Pressione qualquer tecla para voltar...")


def parse_date(date: str) -> str:
    raw = list(reversed(date.split("/")))
    return '-'.join(raw)
