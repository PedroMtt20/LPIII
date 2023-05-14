// package LPIII.LISTA6.questao6;

public class RoboSimples {
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private String direcaoAtual;
    private int indiceMapaRobo = 0;
    private Coordenadas coordinate;
    static private Coordenadas[] coordenadas = new Coordenadas[100];
    static private int tamanhoCoordenadas = 0;

    RoboSimples(String nome, int px, int py, String d) {
        if (validaRobo(nome, d)) {
            nomeDoRobo = nome;
            direcaoAtual = d;
            posicaoXAtual = px;
            posicaoYAtual = py;
            coordinate = new Coordenadas(px, py, d); // criar uma nova instância de Coordenadas
            coordenadas[tamanhoCoordenadas] = coordinate;
            tamanhoCoordenadas++;
        }
    }
    

    RoboSimples(String nome) {
        this(nome, 0, 0, "N");
    }

    RoboSimples() {
        this("Mbappé");
    }

    public void lista(){
        for (int i = 0; i < tamanhoCoordenadas; i++) {
            System.out.println("x: " + coordenadas[i].getX() + " y: " + coordenadas[i].getY() + " tam:" + i);
        }
    }

    public boolean validaRobo(String nome, String d) {
        if ((nome == null || nome.trim().isEmpty()) || (d != "N" && d != "S" && d != "E" && d != "O")) {
            return false;
        }
        return true;
    }

    public void move() {
        this.move(1, 0);
    }

    public boolean verificaColisao(int x, int y) {
        for (int i = 0; i < tamanhoCoordenadas; i++) {
           // System.out.println("x: " + coordenadas[i].getX() + " y: " + coordenadas[i].getY() + " tam:" + i);
            if (coordenadas[i] != null && x == coordenadas[i].getX()
                    && y == coordenadas[i].getY() && direcaoAtual.equals(coordenadas[i].getDirecao())) {
                System.out.println("Ja existe um robo nesta posicao");
                return true;
            }
        }
        return false;
    }

    public void move(int x, int y) {
        if (verificaColisao(x, y)) {
            return;
        } else {
            switch (direcaoAtual) {
                case "N":
                    if (x != 0)
                        System.out.println("Para andar ao norte, o eixo x deve ser 0!");
                    else {
                        posicaoYAtual += y;
                        coordinate.setY(posicaoYAtual);
                    }
                    break;
                case "S":
                    if (x != 0)
                        System.out.println("Para andar ao sul, o eixo x deve ser 0!");
                    else {
                        posicaoYAtual -= y;
                        coordinate.setY(posicaoYAtual);
                    }
                    break;
                case "E":
                    if (y != 0)
                        System.out.println("Para andar ao leste, o eixo y deve ser 0!");
                    else {
                        posicaoXAtual += x;
                        coordinate.setX(posicaoXAtual);
                    }
                    break;
                case "O":
                    if (y != 0)
                        System.out.println("Para andar ao oeste, o eixo y deve ser 0!");
                    else {
                        posicaoXAtual -= x;
                        coordinate.setX(posicaoXAtual);
                    }
                    break;
                case "NO":
                    posicaoYAtual += y;
                    posicaoXAtual -= x;
                    coordinate.setX(posicaoXAtual);
                    coordinate.setY(posicaoYAtual);
                    break;
                case "NE":
                    posicaoYAtual += y;
                    posicaoXAtual += x;
                    coordinate.setX(posicaoXAtual);
                    coordinate.setY(posicaoYAtual);
                    break;
                case "SO":
                    posicaoYAtual -= y;
                    posicaoXAtual -= x;
                    coordinate.setX(posicaoXAtual);
                    coordinate.setY(posicaoYAtual);
                    break;
                case "SE":
                    posicaoYAtual -= y;
                    posicaoXAtual += x;
                    coordinate.setX(posicaoXAtual);
                    coordinate.setY(posicaoYAtual);
                    break;
            }
        }
    }

    public void mudaDireção(String novaDirecao) {
        direcaoAtual = novaDirecao;
    }

    public String toString() {
        String str = "\nNome do robo: " + nomeDoRobo + "\n";
        str = str + "Posicao do robo: (" + posicaoXAtual + ", " + posicaoYAtual + ")\n";
        str = str + "Direcao do robo: " + direcaoAtual;

        return str;
    }

}