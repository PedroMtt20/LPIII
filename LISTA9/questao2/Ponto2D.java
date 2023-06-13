import java.text.DecimalFormat;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(Ponto2D ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "(" + df.format(x) + ", " + df.format(y) + ")";
    }

    public boolean inAxisX() {
        return y == 0;
    }

    public boolean inAxisY() {
        return x == 0;
    }

    public boolean inAxis() {
        return inAxisX() || inAxisY();
    }

    public boolean isOrigin() {
        return x == 0 && y == 0;
    }

    public double distance(double x, double y) {
        double dx = this.x - x;
        double dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(Ponto2D ponto) {
        return distance(ponto.x, ponto.y);
    }
}
