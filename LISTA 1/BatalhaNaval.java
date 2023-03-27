import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BatalhaNaval jogo = new BatalhaNaval();
        int[][] coordenadasJogador1 = new int[5][2], coordenadasJogador2 = new int[5][2];
        int i, coordenadaAtaqueX, coordenadaAtaqueY, naviosJogador1 = 5, naviosJogador2 = 5, vencedor = 0;
        char[][] mapaJogador1 = new char[5][5], mapaJogador2 = new char[5][5];
        boolean entradaValida = false, coordenadaAnteriorValida = false, turnoJogador1, turnoJogador2 = false;

        mapaJogador1 = geraMapas(mapaJogador1);
        mapaJogador2 = geraMapas(mapaJogador2);

        System.out.println("Welcome to Battleship!\n\n");
        System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.");
        for (i = 0; i < 5; i++) {
            entradaValida = false;
            coordenadaAnteriorValida = false;

            while (!entradaValida || !coordenadaAnteriorValida) {

                System.out.println("Enter ship " + (i + 1) + " location:");
                coordenadasJogador1[i][0] = scanner.nextInt();
                coordenadasJogador1[i][1] = scanner.nextInt();
                entradaValida = validaCoordenadas(
                        coordenadasJogador1[i][0],
                        coordenadasJogador1[i][1]);

                if (i > 0) {
                    coordenadaAnteriorValida = validaCoordenadasAnteriores(coordenadasJogador1[i][0],
                            coordenadasJogador1[i][1], coordenadasJogador1, i);
                } else {
                    coordenadaAnteriorValida = true;
                }
            }
        }
        mapaJogador1 = marcaNaviosNoMapa(mapaJogador1, coordenadasJogador1);
        imprimeMapa(mapaJogador1);

        System.out.println("PLAYER 2, ENTER YOUR SHIPS COORDINATES.");
        for (i = 0; i < 5; i++) {
            entradaValida = false;
            coordenadaAnteriorValida = false;

            while (!entradaValida || !coordenadaAnteriorValida) {

                System.out.println("Enter ship " + (i + 1) + " location:");
                coordenadasJogador2[i][0] = scanner.nextInt();
                coordenadasJogador2[i][1] = scanner.nextInt();
                entradaValida = validaCoordenadas(
                        coordenadasJogador2[i][0],
                        coordenadasJogador2[i][1]);

                if (i > 0) {
                    coordenadaAnteriorValida = validaCoordenadasAnteriores(coordenadasJogador2[i][0],
                            coordenadasJogador2[i][1], coordenadasJogador2, i);
                } else {
                    coordenadaAnteriorValida = true;
                }
            }
        }

        mapaJogador2 = marcaNaviosNoMapa(mapaJogador2, coordenadasJogador2);
        imprimeMapa(mapaJogador2);

        mapaJogador1 = geraMapas(mapaJogador1);
        mapaJogador2 = geraMapas(mapaJogador2);
        boolean localJaAtacado = false;

        entradaValida = false;
        while (naviosJogador1 > 0 && naviosJogador2 > 0) {
            turnoJogador1 = true;
            entradaValida = false;
            
            while (turnoJogador1 || !entradaValida || !localJaAtacado) {
                System.out.print("Player 1, enter hit row/column:");
                coordenadaAtaqueX = scanner.nextInt();
                coordenadaAtaqueY = scanner.nextInt();
                entradaValida = validaCoordenadas(coordenadaAtaqueX, coordenadaAtaqueY);
                localJaAtacado = false;
                if (entradaValida) {
                    localJaAtacado = verificaLocaisAtacados(coordenadaAtaqueX, coordenadaAtaqueY, mapaJogador1);
                    if (localJaAtacado) {
                        System.out.println("You already fired on this spot. Choose different coordinates.");
                        localJaAtacado = false;
                    } else {
                        mapaJogador2 = marcaLocaisMapa(coordenadaAtaqueX, coordenadaAtaqueY, mapaJogador2,
                                coordenadasJogador2, 1, 2);
                        imprimeMapa(mapaJogador2);
                        localJaAtacado = true;
                    }
                }
                turnoJogador1 = false;
            }

            if (jogo.todosNaviosAfundados(mapaJogador2, 1) == 5) {
                vencedor = 1;
                break;
            }

            turnoJogador2 = true;
            entradaValida = false;
            localJaAtacado = false;
            while (turnoJogador2 || !entradaValida || !localJaAtacado) {
                System.out.print("Player 2, enter hit row/column:");
                coordenadaAtaqueX = scanner.nextInt();
                coordenadaAtaqueY = scanner.nextInt();
                entradaValida = validaCoordenadas(coordenadaAtaqueX, coordenadaAtaqueY);
                localJaAtacado = false;
                if (entradaValida) {
                    localJaAtacado = verificaLocaisAtacados(coordenadaAtaqueX, coordenadaAtaqueY, mapaJogador1);
                    if (localJaAtacado) {
                        System.out.println("You already fired on this spot. Choose different coordinates.");
                        localJaAtacado = false;
                    } else {
                        mapaJogador1 = marcaLocaisMapa(coordenadaAtaqueX, coordenadaAtaqueY, mapaJogador1,
                                coordenadasJogador1, 2, 1);
                        imprimeMapa(mapaJogador1);
                        localJaAtacado = true;
                    }
                }
                turnoJogador2 = false;
            }

            if (jogo.todosNaviosAfundados(mapaJogador1, 2) == 5) {
                vencedor = 2;
                break;
            }
        }

        if (vencedor != 0) {
            System.out.println("PLAYER " + vencedor + " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
        }
    }

    private int todosNaviosAfundados(char[][] mapa, int jogador) {
        int cont = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                if (mapa[i][j] == 'X') {
                    cont++;
                }
            }
        }

        return cont;
    }

    public static boolean verificaLocaisAtacados(int x, int y, char[][] mapa) {
        if (mapa[x][y] == 'X' || mapa[x][y] == 'O') {
            return true;
        }

        return false;
    }

    public static char[][] marcaLocaisMapa(int x, int y, char[][] mapa, int[][] coordenadas, int jogadorAtaque,
            int jogadorDefesa) {
        boolean acertou = false;
        for (int i = 0; i < coordenadas.length; i++) {
            if (x == coordenadas[i][0] && y == coordenadas[i][1]) {
                mapa[x][y] = 'X';
                System.out.println("PLAYER " + jogadorAtaque + " HIT PLAYER " + jogadorDefesa + "'s SHIP!");
                acertou = true;
                break;
            }
        }
        if (!acertou && mapa[x][y] == '-') {
            mapa[x][y] = 'O';
            System.out.println("PLAYER " + jogadorAtaque + " MISSED!");
        }
        return mapa;
    }

    public static char[][] marcaNaviosNoMapa(char[][] mapa, int[][] coordenadas) {
        for (int i = 0; i < coordenadas.length; i++) {
            int x = coordenadas[i][0];
            int y = coordenadas[i][1];
            mapa[x][y] = '@';
        }
        return mapa;
    }

    public static boolean validaCoordenadasAnteriores(int x, int y, int[][] coordenadas, int numNavios) {
        for (int i = 0; i < numNavios; i++) {
            if (x == coordenadas[i][0] && y == coordenadas[i][1]) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                return false;
            }
        }

        return true;
    }

    public static void imprimeMapa(char[][] mapa) {
        System.out.print(" 01234\n");
        for (int i = 0; i < mapa.length; i++) {
            System.out.print(i);
            for (int k = 0; k < 5; k++) {
                System.out.print(mapa[i][k]);
            }
            System.out.print('\n');
        }
    }

    public static char[][] geraMapas(char[][] mapa) {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                mapa[i][k] = '-';
            }
        }
        return mapa;
    }

    public static boolean validaCoordenadas(int x, int y) {
        if ((x > 4 || x < 0) || (y > 4 || y < 0)) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
            return false;
        }

        return true;
    }
}
