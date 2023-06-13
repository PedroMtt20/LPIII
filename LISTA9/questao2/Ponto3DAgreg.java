import java.text.DecimalFormat;

public class Ponto3DAgreg {
    private Ponto2D ponto2D;
    private double z;

    public Ponto3DAgreg(Ponto2D ponto2D, double z) {
        this.ponto2D = ponto2D;
        this.z = z;
    }

    public Ponto2D getPonto2D() {
        return ponto2D;
    }

    public double getX() {
        return ponto2D.getX();
    }

    public double getY() {
        return ponto2D.getY();
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "(" + df.format(getX()) + ", " + df.format(getY()) + ", " + df.format(z) + ")";
    }

    public boolean inAxisX() {
        return ponto2D.inAxisX() && z == 0;
    }

    public boolean inAxisY() {
        return ponto2D.inAxisY() && z == 0;
    }

    public boolean inAxisZ() {
        return ponto2D.isOrigin() && z != 0;
    }

    public boolean inAxis() {
        return inAxisX() || inAxisY() || inAxisZ();
    }

    public boolean isOrigin() {
        return ponto2D.isOrigin() && z == 0;
    }

    public double distance(double x, double y, double z) {
        double dx = ponto2D.getX() - x;
        double dy = ponto2D.getY() - y;
        double dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double distance(Ponto3DAgreg ponto) {
        return distance(ponto.getX(), ponto.getY(), ponto.getZ());
    }
}
