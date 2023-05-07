public class Ponto2D {
    private final double x;
    private final double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isEixoX() {
        return y == 0;
    }

    public boolean isEixoY() {
        return x == 0;
    }

    public boolean isEixos() {
        return x == 0 && y == 0;
    }

    public void imprimirPonto() {
        System.out.println("(" + x + "," + y + ")");
    }

    public int quadrante() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public double distancia(Ponto2D ponto) {
        final double distancia = Math.sqrt(Math.pow(ponto.x - x, 2) + Math.pow(ponto.y - y, 2));

        return distancia;
    }
}