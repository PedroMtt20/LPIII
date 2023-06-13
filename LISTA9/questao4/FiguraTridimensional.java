import java.text.DecimalFormat;

public class FiguraTridimensional {
    protected double raio;
    protected double altura;

    public FiguraTridimensional(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Raio: " + df.format(raio) + ", Altura: " + df.format(altura);
    }
}

