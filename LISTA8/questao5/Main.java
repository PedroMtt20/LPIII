public class Main {
    public static void main(String[] args) {
        // Triângulo isósceles
        Ponto2D ponto1 = new Ponto2D(0, 0);
        Ponto2D ponto2 = new Ponto2D(4, 0);
        Ponto2D ponto3 = new Ponto2D(2, 3);

        Triangulo trianguloIsosceles = new Triangulo(ponto1, ponto2, ponto3);

        System.out.println("Triângulo Isósceles:");
        System.out.println("Retângulo? " + trianguloIsosceles.isTrianguloRetangulo());
        System.out.println("Isósceles? " + trianguloIsosceles.isTrianguloIsosceles());
        System.out.println("Equilátero? " + trianguloIsosceles.isTrianguloEquilatero());
        System.out.println();

        // Triângulo retângulo
        ponto1 = new Ponto2D(0, 0);
        ponto2 = new Ponto2D(3, 0);
        ponto3 = new Ponto2D(0, 4);

        Triangulo trianguloRetangulo = new Triangulo(ponto1, ponto2, ponto3);

        System.out.println("Triângulo Retângulo:");
        System.out.println("Retângulo? " + trianguloRetangulo.isTrianguloRetangulo());
        System.out.println("Isósceles? " + trianguloRetangulo.isTrianguloIsosceles());
        System.out.println("Equilátero? " + trianguloRetangulo.isTrianguloEquilatero());
        System.out.println();

        // Triângulo equilátero
        ponto1 = new Ponto2D(0, 0);
        ponto2 = new Ponto2D(3, 0);
        ponto3 = new Ponto2D(1.5, Math.sqrt(3) / 2); // Altura do triângulo equilátero

        Triangulo trianguloEquilatero = new Triangulo(ponto1, ponto2, ponto3);

        System.out.println("Triângulo Equilátero:");
        System.out.println("Retângulo? " + trianguloEquilatero.isTrianguloRetangulo());
        System.out.println("Isósceles? " + trianguloEquilatero.isTrianguloIsosceles());
        System.out.println("Equilátero? " + trianguloEquilatero.isTrianguloEquilatero());
    }
}
