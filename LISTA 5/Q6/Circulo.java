public class Circulo {
    private double x;
    private double y;
    private double r;

    public Circulo(double _x, double _y, double _r) {
        x = _x;
        y = _y;
        r = _r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void imprimirCirculo(){
        System.out.println("x: " + x + " y: " + y + " r: " + r);
    }

    public boolean isInnerPoint(Ponto2D ponto){
        double distancia = Math.sqrt(Math.pow(ponto.getX() - x, 2) + Math.pow(ponto.getY() - y, 2));
        if(distancia <= r){
            return true;
        } else{
            return false;
        }
    }

    public float area(){
        return (float) (3.14 * Math.pow(r, 2));
    }

    public float perimeter(){
        return (float) (2 * 3.14 * r);
    }

    boolean isBiggerThan(Circulo circulo){
        double areaObjeto = (3.14 * Math.pow(r, 2));
        if(areaObjeto > area()){
            return true;
        } else{
            return false;
        }
    }
}
