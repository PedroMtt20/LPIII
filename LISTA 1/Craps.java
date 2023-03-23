import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dado1 = 0, dado2 = 0, somaDados = 0, pontoJogador = 0, numeroJogadas = 0;
        boolean estagio2 = false, entradaValida = false;

        while (!entradaValida) {
            System.out.println("Dado 1:");
            dado1 = scanner.nextInt();

            System.out.println("Dado 2:");
            dado2 = scanner.nextInt();

            pontoJogador = dado1 + dado2;

            entradaValida = validacaoDados(dado1, dado2);
        }

        if (somaDados == 7 || somaDados == 11) {
            System.out.println("Você ganhou :)");
        } else if (somaDados == 2 || somaDados == 3 || somaDados == 12) {
            System.out.println("Você perdeu :(");
        } else {
            estagio2 = true;
            System.out.println("Ponto: " + pontoJogador);
            System.out.println("Entrando no estágio 2!");
        }

        while (estagio2) {
            entradaValida = false;
            while (!entradaValida) {
                System.out.println("Dado 1:");
                dado1 = scanner.nextInt();

                System.out.println("Dado 2:");
                dado2 = scanner.nextInt();

                entradaValida = validacaoDados(dado1, dado2);
            }
            numeroJogadas++;
            somaDados = dado1 + dado2;
            System.out.println("Jogada " + numeroJogadas + ": " + somaDados);

            if (somaDados == pontoJogador) {
                System.out.println("Você ganhou :)");
                estagio2 = false;
            } else if (somaDados == 7) {
                System.out.println("Você perdeu :(");
                estagio2 = false;
            }
        }
    }

    public static boolean validacaoDados(int dado1, int dado2) {
        if ((dado1 > 6 || dado1 < 1) || (dado2 > 6 || dado2 < 1)) {
            System.out.println("Os dados só podem assumir valores de 1 a 6.");
            return false;
        } else {
            return true;
        }
    }
}
