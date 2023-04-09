# Nome: Pedro Elias Santiago Mattar

# solicita que o jogador informe as coordenadas nas quais os navios serão colocados
def solicitaCoordenadas(jogador, coordenadas):
    entradaValida = False
    coordenadaAnteriorValida = False

    print("PLAYER " + str(jogador) + ", ENTER YOUR SHIPS COORDINATES.")

    for i in range(5):
        entradaValida = False
        coordenadaAnteriorValida = False

        while (not entradaValida or not coordenadaAnteriorValida):
            print("Enter ship " + str((i+1)) + " location: ")

            x, y = map(int, input().split())
            entradaValida = validaCoordenadas(
                x, y)

            if (entradaValida):
                coordenadas.append([x, y])

            if (i > 0):
                coordenadaAnteriorValida = validaCoordenadasAnteriores(
                    x, y, coordenadas, i)
            else:
                coordenadaAnteriorValida = True

# Valida as coordenada informada pelo usuário com as coordenadas informadas previamente
def validaCoordenadasAnteriores(x, y, coordenadas, numNavios):
    for i in range(numNavios):
        if (x == coordenadas[i][0] and y == coordenadas[i][1]):
            print("You already have a ship there. Choose different coordinates.")
            return False

    return True


# função que executa a lógica de um turno de um jogador
def turnoJogador(jogador, mapaJogador, coordenadasJogador):
    entradaValida = False
    localJaAtacado = False
    x = 0
    y = 0

    while (not entradaValida or localJaAtacado):
        print("Player " + str(jogador) + " , enter hit row/column: ")
        x, y = map(int, input().split())
        entradaValida = validaCoordenadas(x, y)

        if (entradaValida):
            localJaAtacado = verificaLocaisAtacados(x, y, mapaJogador)
            if (localJaAtacado):
                print("You already fired on this spot. Choose different coordinates.")
            else:
                marcaLocaisMapa(x, y, mapaJogador, coordenadasJogador,
                                jogador, 2 if jogador == 1 else 1)
                imprimeMapa(mapaJogador)

    return todosNaviosAfundados(mapaJogador) == 5

# Verifica se as coordenadas inforamadas pelo usuário são válidas
def validaCoordenadas(x, y):
    if ((x > 4 or x < 0) or (y > 4 or y < 0)):
        print("Invalid coordinates. Choose different coordinates.")
        return False
    return True


# verifica se as coordenadas correspondentes já foram atacadas
def verificaLocaisAtacados(x, y, mapa):
    if (mapa[x][y] == 'X' or mapa[x][y] == 'O'):
        return True

    return False

# marca locais de ataque (X) ou locais de erro (O) no mapa do jogador que está sendo atacado
def marcaLocaisMapa(x, y, mapa, coordenadas, jogadorAtaque, jogadorDefesa):
    acertou = False

    for i in range(len(coordenadas)):
        if x == coordenadas[i][0] and y == coordenadas[i][1]:
            mapa[x][y] = 'X'
            print("PLAYER " + str(jogadorAtaque) +
                  " HIT PLAYER " + str(jogadorDefesa) + "'s SHIP!")
            acertou = True
            break
    if (not acertou and mapa[x][y] == '-'):
        mapa[x][y] = 'O'
        print("Player " + str(jogadorAtaque) + " MISSED!")

# função que verifica se houve um vencedor
def verificaVencedor(mapaJogador1, mapaJogador2):
    if (todosNaviosAfundados(mapaJogador2) == 5):
        return 1
    if (todosNaviosAfundados(mapaJogador1) == 5):
        return 2
    return 0

# verifica se todos os navios já foram afundados
def todosNaviosAfundados(mapa):
    cont = 0

    for i in range(len(mapa)):
        for j in range(len(mapa[i])):
            if (mapa[i][j] == 'X'):
                cont += 1

    return cont

# marca o local dos navios no mapa
def marcaNaviosMapa(mapa, coordenadas):
    for i in range(len(mapa)):
        x = coordenadas[i][0]
        y = coordenadas[i][1]
        mapa[x][y] = '@'

# verifica se as coordenadas informadas pelo usuário já não foram informadas previamente
def imprimeMapa(mapa):
    print(" 01234")
    for i in range(len(mapa)):
        print(i, end='')
        for j in range(len(mapa[i])):
            print(mapa[i][j], end='')
        print("\n")

# Gera os mapas do jogo
def geraMapas(matriz):
    matriz = []
    for i in range(5):
        linha = ['-'] * 5
        matriz.append(linha)
    return matriz


# Função principal
def main():
    turnoJogador1 = True
    vencedor = 0
    coordenadasJogador1 = []
    coordenadasJogador2 = []
    mapaJogador1 = []
    mapaJogador2 = []

    # gera os mapas de cada jogador
    mapaJogador1 = geraMapas(mapaJogador1)
    mapaJogador2 = geraMapas(mapaJogador2)

    print("Welcome to Battleship!")

    # Solicita e marca as coordenadas dos navios do jogador 1 no mapa
    solicitaCoordenadas(1, coordenadasJogador1)
    marcaNaviosMapa(mapaJogador1, coordenadasJogador1)
    imprimeMapa(mapaJogador1)
    
    # Solicita e marca as coordenadas dos navios do jogador 2 no mapa
    solicitaCoordenadas(2, coordenadasJogador2)
    marcaNaviosMapa(mapaJogador2, coordenadasJogador2)
    imprimeMapa(mapaJogador2)

    # Gera os mapas novamente, para ocultar a posição dos navios dos jogadores
    mapaJogador1 = geraMapas(mapaJogador1)
    mapaJogador2 = geraMapas(mapaJogador2)

    # Loop principal do jogo
    while (vencedor == 0):
        if (turnoJogador1):
            vencedor = 1 if turnoJogador(
                1, mapaJogador2, coordenadasJogador2) else 0
        else:
            vencedor = 2 if turnoJogador(
                2, mapaJogador1, coordenadasJogador1) else 0

        turnoJogador1 = not turnoJogador1

    # Informa o jogador vencedor
    if (vencedor > 0):
        print("PLAYER " + str(vencedor) +
              " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!")
        print("Final boards:")
        print("Jogador 1:")
        imprimeMapa(mapaJogador1)

        print("Jogador 2:")
        imprimeMapa(mapaJogador2)


main()
