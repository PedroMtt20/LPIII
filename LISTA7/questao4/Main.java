// import LPIII.LISTA6.questao5.Ponto2D;

public class Main{
    public static void main(String[] args) {
        Ponto2D ponto = new Ponto2D(3, 4);
        Ponto2D ponto2 = new Ponto2D(5, 6);
        float distancia = MetodosPonto2D.distance(ponto);
        System.out.println(distancia);
        distancia = MetodosPonto2D.distance(ponto, ponto2);
        System.out.println(distancia);
        System.out.println(MetodosPonto2D.quadrante(ponto2));
    }
}