public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(2.5);
        Circulo circulo2 = new Circulo(3.0, 4.0);
        Circulo circulo3 = new Circulo(1.0, 2.0, 5.0);

        System.out.println("Circulo 1:");
        circulo1.imprimirCirculo();
        System.out.println("Area do Circulo 1: " + circulo1.area());
        System.out.println("Perimetro do Circulo 1: " + circulo1.perimeter());

        System.out.println();

        System.out.println("Circulo 2:");
        circulo2.imprimirCirculo();
        System.out.println("Area do Circulo 2: " + circulo2.area());
        System.out.println("Perimetro do Circulo 2: " + circulo2.perimeter());

        System.out.println();

        System.out.println("Circulo 3:");
        circulo3.imprimirCirculo();
        System.out.println("Area do Circulo 3: " + circulo3.area());
        System.out.println("Perimetro do Circulo 3: " + circulo3.perimeter());

        System.out.println();

        Ponto2D ponto = new Ponto2D(2.0, 3.0);

        System.out.println("O ponto (" + ponto.getX() + ", " + ponto.getY() + ") esta dentro do Circulo 3? " +
                circulo3.isInnerPoint(ponto));

        System.out.println();

        circulo1.setR(3.5);
        System.out.println("Circulo 1 apos alteracao de raio:");
        circulo1.imprimirCirculo();
        System.out.println("Nova area do Circulo 1: " + circulo1.area());
        System.out.println("Novo perimetro do Circulo 1: " + circulo1.perimeter());

        System.out.println();

        System.out.println("O Circulo 3 e maior do que o Circulo 1? " + circulo3.isBiggerThan(circulo1));
    }
}
