import java.text.DecimalFormat;

public class Ponto3DExtds extends Ponto2D {
    private double z;

    public Ponto3DExtds() {
        super();
        this.z = 0;
    }

    public Ponto3DExtds(double x, double y, double z) {
        super(x, y);
        this.z = z;
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
        return super.inAxisX() && z == 0;
    }

    public boolean inAxisY() {
        return super.inAxisY() && z == 0;
    }

    public boolean inAxisZ() {
        return super.isOrigin() && z != 0;
    }

    public boolean inAxis() {
        return inAxisX() || inAxisY() || inAxisZ();
    }

    public boolean isOrigin() {
        return super.isOrigin() && z == 0;
    }

    public double distance(double x, double y, double z) {
        double dx = getX() - x;
        double dy = getY() - y;
        double dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double distance(Ponto3DExtds ponto) {
        return distance(ponto.getX(), ponto.getY(), ponto.getZ());
    }
}
