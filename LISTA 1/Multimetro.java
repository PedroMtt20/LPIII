import java.util.Scanner;

public class Multimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int tam = 10;
        double[] medicoes = new double[10];
        double desvioPadrao = 0, somaDvp = 0, media = 0;
        int i;

        // Lendo as medições e calculando a média
        for (i = 0; i < tam; i++) {
            System.out.println("Digite o valor da medicao " + (i + 1) + ": ");
            medicoes[i] = scanner.nextFloat();
            media += medicoes[i];
        }

        // calculando a média dos valores informados
        media /= tam;

        // Calculando a soma dos desvios quadrados e o desvio padrão
        for (i = 0; i < tam; i++) {
            somaDvp += Math.pow(medicoes[i] - media, 2);
        }

        // calculando o desvio padrão
        desvioPadrao = Math.sqrt(somaDvp / tam);

        // Imprimindo os resultados e verificando se o multimetro está funcionando corretamente
        System.out.println("A media eh: " + media);
        System.out.println("O desvio padrao eh: " + desvioPadrao);
        if (desvioPadrao > (media * 0.1)) {
            System.out.println("O multimetro esta com problemas e nao pode ser utilizado!");
        } else {
            System.out.println("O multimetro esta em estado normal de funcionamento!");
        }
    }
}
