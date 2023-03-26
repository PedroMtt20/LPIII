import java.util.Scanner;

public class BatalhaNaval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] coordenadasJogador1 = new int[5][2], coordenadasJogador2 = new int[5][2];
        int i, k;
        char[][] mapaJogador1 = new char[5][5], mapaJogador2 = new char[5][5];
        boolean entradaValida, coordenadaAnteriorValida;

        mapaJogador1 = geraMapas(mapaJogador1);
        mapaJogador2 = geraMapas(mapaJogador2);

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
                }
                else {
                    coordenadaAnteriorValida = true;
                }
            }
        }

        mapaJogador1 = marcaNaviosNoMapa(mapaJogador1, coordenadasJogador1);

        imprimeMapa(mapaJogador1);

    }

    public static char[][] marcaNaviosNoMapa(char[][] mapa, int[][] coordenadas) {
        for (int i = 0; i < mapa.length; i++) {
            for (int k = 0; k < mapa.length; k++) {
                if (coordenadas[i][0] == i && coordenadas[i][1] == k) {
                    mapa[i][k] = '@';
                }
            }
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
