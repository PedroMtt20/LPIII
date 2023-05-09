public class Main {
    public static void main(String[] args) {
        // Criando dois pontos
        Ponto2D ponto1 = new Ponto2D(1, 2);
        Ponto2D ponto2 = new Ponto2D(-3, 4);

        // Imprimindo os pontos
        System.out.print("Ponto 1: ");
        ponto1.imprimirPonto();
        System.out.print("Ponto 2: ");
        ponto2.imprimirPonto();

        // Verificando se os pontos estão nos eixos ou no centro
        System.out.println("Ponto 1 esta no eixo x? " + ponto1.isEixoX());
        System.out.println("Ponto 1 esta no eixo y? " + ponto1.isEixoY());
        System.out.println("Ponto 1 esta nos eixos? " + ponto1.isEixos());
        System.out.println("Ponto 2 esta no eixo x? " + ponto2.isEixoX());
        System.out.println("Ponto 2 esta no eixo y? " + ponto2.isEixoY());
        System.out.println("Ponto 2 esta nos eixos? " + ponto2.isEixos());

        // Verificando em qual quadrante os pontos estão
        System.out.println("Ponto 1 esta no quadrante: " + ponto1.quadrante());
        System.out.println("Ponto 2 esta no quadrante: " + ponto2.quadrante());

        // Calculando a distância entre os pontos
        System.out.println("Distancia entre os pontos: " + ponto1.distancia(ponto2));
    }
}
