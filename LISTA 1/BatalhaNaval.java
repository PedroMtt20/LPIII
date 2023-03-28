//Nome: Pedro Elias Santiago Mattar

import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] coordenadasJogador1 = new int[5][2], coordenadasJogador2 = new int[5][2];
        int vencedor = 0;
        char[][] mapaJogador1 = new char[5][5], mapaJogador2 = new char[5][5];
        boolean turnoJogador1 = true;

        // gera os mapas de cada jogador
        geraMapas(mapaJogador1);
        geraMapas(mapaJogador2);

        System.out.println("Welcome to Battleship!\n\n");

        // Solicita e marca as coordenadas dos navios do jogador 1 no mapa
        solicitaCoordenadas(1, coordenadasJogador1);
        marcaNaviosNoMapa(mapaJogador1, coordenadasJogador1);
        imprimeMapa(mapaJogador1);

        // Solicita e marca as coordenadas dos navios do jogador 2 no mapa
        solicitaCoordenadas(2, coordenadasJogador2);
        marcaNaviosNoMapa(mapaJogador2, coordenadasJogador2);
        imprimeMapa(mapaJogador2);

        // Gera os mapas novamente, para ocultar a posição dos navios dos jogadores
        geraMapas(mapaJogador1);
        geraMapas(mapaJogador2);

        // Loop principal do jogo
        while (vencedor == 0) {
            if (turnoJogador1) {
                vencedor = turnoJogador(1, mapaJogador2, coordenadasJogador2, scanner) ? 1 : 0;
            } else {
                vencedor = turnoJogador(2, mapaJogador1, coordenadasJogador1, scanner) ? 2 : 0;
            }
            turnoJogador1 = !turnoJogador1;
        }

        if (vencedor > 0) {
            System.out.println("PLAYER " + vencedor + " WINS! YOU SUNK ALL OF YOUR OPPONENT’S SHIPS!");
            System.out.println("Final boards:");
            System.out.println("Jogador 1:");
            imprimeMapa(mapaJogador1);
            System.out.println("Jogador 2:");
            imprimeMapa(mapaJogador2);
        }
    }

    // função que executa a lógica de um turno de um jogador
    public static boolean turnoJogador(int jogador, char[][] mapaJogador, int[][] coordenadasJogador, Scanner scanner) {
        BatalhaNaval jogo = new BatalhaNaval();
        boolean entradaValida = false;
        boolean localJaAtacado = false;
        int x, y;

        while (!entradaValida || localJaAtacado) {
            System.out.printf("Player %d, enter hit row/column: ", jogador);
            x = scanner.nextInt();
            y = scanner.nextInt();
            entradaValida = validaCoordenadas(x, y); // Verifica se as coordenadas são válidas.
            if (entradaValida) {
                localJaAtacado = verificaLocaisAtacados(x, y, mapaJogador); // Verifica se o local já foi atacado.
                if (localJaAtacado) {
                    System.out.println("You already fired on this spot. Choose different coordinates.");
                } else {
                    marcaLocaisMapa(x, y, mapaJogador, coordenadasJogador, jogador, jogador == 1 ? 2 : 1);
                    imprimeMapa(mapaJogador);
                }
            }
        }

        return jogo.todosNaviosAfundados(mapaJogador, jogador) == 5;
    }

    // função que verifica se houve um vencedor
    public static int verificaVencedor(char[][] mapaJogador1, char[][] mapaJogador2) {
        BatalhaNaval jogo = new BatalhaNaval();
        if (jogo.todosNaviosAfundados(mapaJogador2, 1) == 5) {
            return 1;
        }
        if (jogo.todosNaviosAfundados(mapaJogador1, 2) == 5) {
            return 2;
        }
        return 0;
    }

    // solicita que o jogador informe as coordenadas nas quais os navios serão
    // colocados
    private static void solicitaCoordenadas(int jogador, int[][] coordenadas) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida;
        boolean coordenadaAnteriorValida;

        System.out.println("PLAYER " + jogador + ", ENTER YOUR SHIPS COORDINATES.");

        for (int i = 0; i < 5; i++) {
            entradaValida = false;
            coordenadaAnteriorValida = false;

            // Laço para verificar a validade das coordenadas informadas
            while (!entradaValida || !coordenadaAnteriorValida) {

                System.out.println("Enter ship " + (i + 1) + " location:");

                coordenadas[i][0] = scanner.nextInt();
                coordenadas[i][1] = scanner.nextInt();

                // Verifica se as coordenadas informadas são válidas
                entradaValida = validaCoordenadas(
                        coordenadas[i][0],
                        coordenadas[i][1]);

                if (i > 0) {
                    coordenadaAnteriorValida = validaCoordenadasAnteriores(
                            coordenadas[i][0],
                            coordenadas[i][1],
                            coordenadas,
                            i);
                } else {
                    coordenadaAnteriorValida = true;
                }
            }
        }
    }

    // verifica se todos os navios já foram afundados
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

    // verifica se as coordenadas correspondentes já foram atacadas
    public static boolean verificaLocaisAtacados(int x, int y, char[][] mapa) {
        if (mapa[x][y] == 'X' || mapa[x][y] == 'O') {
            return true;
        }

        return false;
    }

    // marca locais de ataque (X) ou locais de erro (O) no mapa do jogador que está
    // sendo atacado
    public static void marcaLocaisMapa(int x, int y, char[][] mapa, int[][] coordenadas, int jogadorAtaque,
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
    }

    // marca o local dos navios no mapa
    public static void marcaNaviosNoMapa(char[][] mapa, int[][] coordenadas) {
        for (int i = 0; i < coordenadas.length; i++) {
            int x = coordenadas[i][0];
            int y = coordenadas[i][1];
            mapa[x][y] = '@';
        }
    }

    // verifica se as coordenadas informadas pelo usuário já não foram informadas
    // previamente
    public static boolean validaCoordenadasAnteriores(int x, int y, int[][] coordenadas, int numNavios) {
        for (int i = 0; i < numNavios; i++) {
            if (x == coordenadas[i][0] && y == coordenadas[i][1]) {
                System.out.println("You already have a ship there. Choose different coordinates.");
                return false;
            }
        }

        return true;
    }

    // imprime o mapa do jogador selecionado
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

    // gera os mapas de cada jogador
    public static void geraMapas(char[][] mapa) {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5; k++) {
                mapa[i][k] = '-';
            }
        }
    }

    // valida as coordenadas informadas pelo usuário
    public static boolean validaCoordenadas(int x, int y) {
        if ((x > 4 || x < 0) || (y > 4 || y < 0)) {
            System.out.println("Invalid coordinates. Choose different coordinates.");
            return false;
        }

        return true;
    }
}
