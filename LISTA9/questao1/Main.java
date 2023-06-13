public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D();  // Cria um ponto na origem (0, 0)
        System.out.println("Ponto1: " + ponto1);  // Saída: Ponto1: (0, 0)
        System.out.println("Está no eixo X? " + ponto1.inAxisX());  // Saída: Está no eixo X? true
        System.out.println("Está no eixo Y? " + ponto1.inAxisY());  // Saída: Está no eixo Y? true
        System.out.println("Está sobre os eixos? " + ponto1.inAxis());  // Saída: Está sobre os eixos? true
        System.out.println("Está na origem? " + ponto1.isOrigin());  // Saída: Está na origem? true

        Ponto2D ponto2 = new Ponto2D(3, 4);  // Cria um ponto na posição (3, 4)
        System.out.println("Ponto2: " + ponto2);  // Saída: Ponto2: (3, 4)
        System.out.println("Distância entre Ponto1 e Ponto2: " + ponto1.distance(ponto2));  // Saída: Distância entre Ponto1 e Ponto2: 5.0
    }
}
