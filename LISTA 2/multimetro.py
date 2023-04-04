import math

def main():
    tam = 10; desvioPadrao = 0; somaDvp = 0; media = 0.0; valor = 0.0
    medicoes = []

    for i in range(tam):
        valor = float(input("Digite o valor da medicao: "))
        media+=valor
        medicoes.append(valor)
        
    media/=tam

    for i in range(tam):
        somaDvp += pow(medicoes[i] - media, 2)

    desvioPadrao = math.sqrt(somaDvp / tam)

    print("A media eh: ", media)
    print("O desvio padrao eh: ", desvioPadrao)

    if (desvioPadrao > (media * 0.1)) :
        print("O multimetro esta com problemas e nao pode ser utilizado!")
    else :
        print("O multimetro esta em estado normal de funcionamento!")    

main()