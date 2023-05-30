// import LPIII.LISTA6.questao5.Ponto2D;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias da classe Ponto2D
        Ponto2D ponto1 = new Ponto2D(2, 3);
        Ponto2D ponto2 = new Ponto2D(-4, 5);

        // Calculando a distância entre dois pontos
        float distancia1 = MetodosPonto2D.distance(ponto1, ponto2);
        System.out.println("Distancia entre os pontos: " + distancia1);

        // Calculando a distância de um ponto à origem (0,0)
        float distancia2 = MetodosPonto2D.distance(ponto1);
        System.out.println("Distancia do ponto a origem: " + distancia2);

        // Verificando o quadrante de um ponto
        int quadrante = MetodosPonto2D.quadrante(ponto2);
        System.out.println("Quadrante do ponto: " + quadrante);
    }
}