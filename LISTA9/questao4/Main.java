public class Main {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(5.0, 10.0);
        System.out.println(cilindro);
        System.out.println("Volume do cilindro: " + cilindro.calcularVolume());
        System.out.println("Área superficial do cilindro: " + cilindro.calcularAreaSuperficial());

        Cone cone = new Cone(3.0, 7.0);
        System.out.println(cone);
        System.out.println("Volume do cone: " + cone.calcularVolume());
        System.out.println("Área superficial do cone: " + cone.calcularAreaSuperficial());
    }
}
