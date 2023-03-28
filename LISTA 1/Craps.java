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

            pontoJogador = dado1 + dado2;  // Calcula o ponto do jogador com a soma dos dados

            entradaValida = validacaoDados(dado1, dado2); // Verifica se os dados são válidos
        }

        if (somaDados == 7 || somaDados == 11) { // se a soma dos dados for 7 ou 11, o jogador ganhou
            System.out.println("Você ganhou :)");
        } else if (somaDados == 2 || somaDados == 3 || somaDados == 12) { // se a soma dos dados for 2, 3 ou 12, o jogador perdeu
            System.out.println("Você perdeu :(");
        } else { // se a soma dos dados for diferente de 2, 3, 7, 11 ou 12, entra no estágio 2
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

                entradaValida = validacaoDados(dado1, dado2); // Verifica se os dados são válidos
            }
            numeroJogadas++;
            somaDados = dado1 + dado2; // Calcula a soma dos dados da jogada atual
            System.out.println("Jogada " + numeroJogadas + ": " + somaDados);

            // Verifica se o jogador ganhou ou perdeu na jogada atual
            if (somaDados == pontoJogador) {
                System.out.println("Você ganhou :)");
                estagio2 = false;
            } else if (somaDados == 7) {
                System.out.println("Você perdeu :(");
                estagio2 = false;
            }
        }
    }

    // valida se os números dos dados estão entre 1  e 6
    public static boolean validacaoDados(int dado1, int dado2) {
        if ((dado1 > 6 || dado1 < 1) || (dado2 > 6 || dado2 < 1)) {
            System.out.println("Os dados só podem assumir valores de 1 a 6.");
            return false;
        } else {
            return true;
        }
    }
}
