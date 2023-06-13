public class Cilindro extends FiguraTridimensional {
    public Cilindro(double raio, double altura) {
        super(raio, altura);
    }

    public double calcularVolume() {
        return Math.PI * raio * raio * altura;
    }

    public double calcularAreaSuperficial() {
        return 2 * Math.PI * raio * raio + 2 * Math.PI * raio * altura;
    }

    @Override
    public String toString() {
        return "Cilindro - " + super.toString();
    }
}
