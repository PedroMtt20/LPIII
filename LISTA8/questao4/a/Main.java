public class Main {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(3, 4);
        Ponto2D p2 = new Ponto2D(1, 2);

        SegmentoReta seg = new SegmentoReta(p1, p2);
        System.out.println(seg.getDimensao());
        seg.imprimeSegmentoReta();        
    }
}
