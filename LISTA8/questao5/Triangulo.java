public class Triangulo {
    private Ponto2D p1;
    private Ponto2D p2;
    private Ponto2D p3;
    private static final float TOLERANCE = (float) 1e-4;

    Triangulo(Ponto2D _p1, Ponto2D _p2, Ponto2D _p3) {
        p1 = _p1;
        p2 = _p2;
        p3 = _p3;
    }

    public boolean isTrianguloRetangulo() {
        float distanciaP1_P2 = p1.distance(p2);
        float distanciaP2_P3 = p2.distance(p3);
        float distanciaP1_P3 = p1.distance(p3);
        float hip = 0, cat1 = 0, cat2 = 0;
        boolean isRetangulo;

        if (Math.abs(distanciaP1_P2 * distanciaP1_P2
                - (distanciaP1_P3 * distanciaP1_P3 + distanciaP2_P3 * distanciaP2_P3)) < TOLERANCE) {
            return true;
        } else if (Math.abs(distanciaP2_P3 * distanciaP2_P3
                - (distanciaP1_P3 * distanciaP1_P3 + distanciaP1_P2 * distanciaP1_P2)) < TOLERANCE) {
            return true;
        } else if (Math.abs(distanciaP1_P3 * distanciaP1_P3
                - (distanciaP1_P2 * distanciaP1_P2 + distanciaP2_P3 * distanciaP2_P3)) < TOLERANCE) {
            return true;
        }

        return false;
    }

    public boolean isTrianguloIsosceles() {
        double distanciaP1P2 = p1.distance(p2);
        double distanciaP1P3 = p1.distance(p3);
        double distanciaP2P3 = p2.distance(p3);

        double tolerancia = 1e-10;

        if (Math.abs(distanciaP1P2 - distanciaP1P3) < tolerancia ||
                Math.abs(distanciaP1P2 - distanciaP2P3) < tolerancia ||
                Math.abs(distanciaP1P3 - distanciaP2P3) < tolerancia) {
            return true;
        }

        return false;
    }

    public boolean isTrianguloEquilatero() {
        double distanciaP1P2 = p1.distance(p2);
        double distanciaP1P3 = p1.distance(p3);
        double distanciaP2P3 = p2.distance(p3);

        double tolerancia = 1e-10;

        if (Math.abs(distanciaP1P2 - distanciaP1P3) < tolerancia &&
                Math.abs(distanciaP1P2 - distanciaP2P3) < tolerancia &&
                Math.abs(distanciaP1P3 - distanciaP2P3) < tolerancia) {
            return true;
        }

        return false;
    }

    private boolean verificaPontoRetangulo(double _hip, double _cat1, double _cat2) {
        if (Math.abs(Math.pow(_hip, 2) - (Math.pow(_cat1, 2) + Math.pow(_cat2, 2))) < TOLERANCE) {
            return true;
        }
        return false;
    }

    public void imprimeTriangulo() {
        p1.imprimirPonto();
        p2.imprimirPonto();
        p3.imprimirPonto();
    }
}
