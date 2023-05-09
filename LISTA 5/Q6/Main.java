public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe Circulo
        Circulo circulo1 = new Circulo(0, 0, 5);
        Circulo circulo2 = new Circulo(10, 10, 3);

        // Imprimindo informações dos círculos
        System.out.println("Circulo 1:");
        circulo1.imprimirCirculo();
        System.out.println("Area: " + circulo1.area());
        System.out.println("Perimetro: " + circulo1.perimeter());

        System.out.println();

        System.out.println("Circulo 2:");
        circulo2.imprimirCirculo();
        System.out.println("Area: " + circulo2.area());
        System.out.println("Perimetro: " + circulo2.perimeter());

        // Verificando se um ponto está dentro do círculo
        Ponto2D ponto = new Ponto2D(3, 3);
        System.out.println("O ponto (" + ponto.getX() + ", " + ponto.getY() + ") esta dentro do circulo 1? " + circulo1.isInnerPoint(ponto));

        // Verificando qual círculo é maior
        System.out.println("O circulo 1 eh maior que o circulo 2? " + circulo1.isBiggerThan(circulo2));
    }
}
