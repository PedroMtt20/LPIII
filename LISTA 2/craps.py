#valida se os números dos dados estão entre 1  e 6
def validacaoDados(dado1, dado2):
    if ((dado1 > 6 or dado1 < 1) or (dado2 > 6 or dado2 < 1)):
        print("Os dados só podem assumir valores de 1 a 6.")
        return False
    else:
        return True

def main():
    dado1 = 0; dado2 = 0; somaDados = 0; pontoJogador = 0; numeroJogadas = 0;
    estagio2 = False; entradaValida = False
    
    while(not entradaValida):
        dado1 = int(input("Dado 1:"))
        dado2 = int(input("Dado 2:"))
        
        pontoJogador = dado1 + dado2 #Calcula o ponto do jogador com a soma dos dados
        entradaValida = validacaoDados(dado1, dado2) #Verifica se os dados são válidos
        
    if(pontoJogador == 7 or pontoJogador == 11): #se a soma dos dados for 7 ou 11, o jogador ganhou
        print("Voce ganhou :)")
    elif(pontoJogador == 2 or pontoJogador == 3 or pontoJogador == 12): 
        print("Voce perdeu :(")
    else: #se a soma dos dados for diferente de 2, 3, 7, 11 ou 12, entra no estágio 2
        estagio2 = True
        print("Ponto", pontoJogador)
        print("Entrando no estagio 2!")
            
    while(estagio2):
        entradaValida = False
        while(not entradaValida):
            dado1 = int(input("Dado 1:"))
            dado2 = int(input("Dado 2:"))
                
            entradaValida = validacaoDados(dado1, dado2)
            
        numeroJogadas+=1
        somaDados = dado1 + dado2 #Calcula a soma dos dados da jogada atual
        
        print("Jogada", numeroJogadas, ": ", somaDados)
        
        #Verifica se o jogador ganhou ou perdeu na jogada atual
        if (somaDados == pontoJogador):
            print("Você ganhou :)")
            estagio2 = False
        elif (somaDados == 7):
            print("Você perdeu :(")
            estagio2 = False
            
main()