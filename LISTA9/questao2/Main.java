public class Main {
    public static void main(String[] args) {
        // Testando a classe Ponto3DExtds (herança)
        Ponto3DExtds ponto1 = new Ponto3DExtds(2, 3, 4);
        System.out.println("Ponto1: " + ponto1);  // Saída: Ponto1: (2, 3, 4)
        System.out.println("Está no eixo X? " + ponto1.inAxisX());  // Saída: Está no eixo X? false
        System.out.println("Está no eixo Y? " + ponto1.inAxisY());  // Saída: Está no eixo Y? false
        System.out.println("Está no eixo Z? " + ponto1.inAxisZ());  // Saída: Está no eixo Z? false
        System.out.println("Está nos eixos? " + ponto1.inAxis());  // Saída: Está nos eixos? false
        System.out.println();

        // Testando a classe Ponto3DComp (agregação)
        Ponto2D ponto2D = new Ponto2D(1, 2);
        Ponto3DComp ponto2 = new Ponto3DComp(ponto2D, 3);
        System.out.println("Ponto2: " + ponto2);  // Saída: Ponto2: (1, 2, 3)
        System.out.println("Está no eixo X? " + ponto2.inAxisX());  // Saída: Está no eixo X? false
        System.out.println("Está no eixo Y? " + ponto2.inAxisY());  // Saída: Está no eixo Y? false
        System.out.println("Está no eixo Z? " + ponto2.inAxisZ());  // Saída: Está no eixo Z? false
        System.out.println("Está nos eixos? " + ponto2.inAxis());  // Saída: Está nos eixos? false
        System.out.println();

        // Testando a classe Ponto3DAgreg (agregação com Ponto2D criado separadamente)
        Ponto2D ponto3 = new Ponto2D(0, 0);
        Ponto3DAgreg ponto4 = new Ponto3DAgreg(ponto3, 5);
        System.out.println("Ponto4: " + ponto4);  // Saída: Ponto4: (0, 0, 5)
        System.out.println("Está no eixo X? " + ponto4.inAxisX());  // Saída: Está no eixo X? true
        System.out.println("Está no eixo Y? " + ponto4.inAxisY());  // Saída: Está no eixo Y? true
        System.out.println("Está no eixo Z? " + ponto4.inAxisZ());  // Saída: Está no eixo Z? true
        System.out.println("Está nos eixos? " + ponto4.inAxis());  // Saída: Está nos eixos? true
        System.out.println();
    }
}
