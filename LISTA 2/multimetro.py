#Nome: Pedro Elias Santiago Mattar

import math

def main():
    tam = 10; desvioPadrao = 0; somaDvp = 0; media = 0.0; valor = 0.0
    medicoes = []
    
    #Lendo as medições e calculando a média
    for i in range(tam):
        valor = float(input("Digite o valor da medicao {}: ".format(i+1)))
        media+=valor
        medicoes.append(valor)
        
    #calculando a média dos valores informados
    media/=tam

    #Calculando a soma dos desvios quadrados e o desvio padrão
    for i in range(tam):
        somaDvp += pow(medicoes[i] - media, 2)

    #calculando o desvio padrão
    desvioPadrao = math.sqrt(somaDvp / tam)

    print("A media eh: ", media)
    print("O desvio padrao eh: ", desvioPadrao)

    #Imprimindo os resultados e verificando se o multimetro está funcionando corretamente
    if (desvioPadrao > (media * 0.1)) :
        print("O multimetro esta com problemas e nao pode ser utilizado!")
    else :
        print("O multimetro esta em estado normal de funcionamento!")    

main()