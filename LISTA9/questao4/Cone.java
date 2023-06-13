public class Cone extends FiguraTridimensional {
    public Cone(double raio, double altura) {
        super(raio, altura);
    }

    public double calcularVolume() {
        return (Math.PI * raio * raio * altura) / 3.0;
    }

    public double calcularAreaSuperficial() {
        double geratriz = Math.sqrt(raio * raio + altura * altura);
        return Math.PI * raio * (raio + geratriz);
    }

    public String toString() {
        return "Cone - " + super.toString();
    }
}
