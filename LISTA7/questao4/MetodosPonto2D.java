public class MetodosPonto2D {

    public static float distance(Ponto2D p1, Ponto2D p2){
        final float distancia = (float) Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY()- p1.getY(), 2));

        return distancia;
    }

    public static float distance(Ponto2D p){
        final float distancia = (float) Math.sqrt(Math.pow(p.getX() - 0, 2) + Math.pow(p.getY()- 0, 0));

        return distancia;
    }

    public static int quadrante(Ponto2D p) {
        if (p.getX() > 0 && p.getY() > 0) {
            return 1;
        } else if (p.getX() < 0 && p.getY()> 0) {
            return 2;
        } else if (p.getX() < 0 && p.getY()< 0) {
            return 3;
        } else if (p.getX() > 0 && p.getY()< 0) {
            return 4;
        } else {
            return 0;
        }
    }
}
