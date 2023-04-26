import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(1, 3);
        Ponto2D ponto2 = new Ponto2D(0, 0);
    
        ponto1.imprimirPonto(); // imprime (1.0,3.0)
        ponto2.imprimirPonto(); // imprime (4.0,1.0)
    
        System.out.println("Ponto 1 esta no eixo X ? " + ponto1.isEixoX()); // imprime false
        System.out.println("Ponto 2 esta no eixo Y ? " + ponto2.isEixoY()); // imprime true
        System.out.println("Ponto 1 esta na origem ? " + ponto1.isEixos()); // imprime false
        System.out.println("Ponto 2 esta na origem ? " + ponto2.isEixos()); // imprime true
    
        System.out.println("O quadrante do ponto 1 eh " + ponto1.quadrante()); // imprime 1
        System.out.println("O quadrante do ponto 2 eh " + ponto2.quadrante()); // imprime 0
    
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("A distancia entre os pontos eh (aproximadamente): " + df.format(ponto1.distancia(ponto2))); // imprime 3,16  
    }
}
