public class RoboSimples {
    private String nomeDoRobo;
    private int posicaoXAtual, posicaoYAtual;
    private String direcaoAtual;
    private Coordenadas coordinate;
    static private Coordenadas[] coordenadas = new Coordenadas[100];
    static private int tamanhoCoordenadas = 0;

    RoboSimples(String nome, int px, int py, String d) {
        if (validaRobo(nome, d) && !verificaColisao(px, py, d, nome)) {
            nomeDoRobo = nome;
            direcaoAtual = d;
            posicaoXAtual = px;
            posicaoYAtual = py;
            coordinate = new Coordenadas(px, py, d);
            coordenadas[tamanhoCoordenadas] = coordinate;
            tamanhoCoordenadas++;
        }
    }

    RoboSimples(String nome) {
        this(nome, 0, 0, "N");
    }

    RoboSimples() {
        this("Megatron");
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
            if (coordenadas[i] != null
                    && (x + posicaoXAtual) == coordenadas[i].getX()
                    && (y + posicaoYAtual) == coordenadas[i].getY()
                    && direcaoAtual.equals(coordenadas[i].getDirecao())) {
                System.out.println("Nao  foi possivel mover o robo " + nomeDoRobo + ". Ja existe um robo nesta posicao.");
                return true;
            }
        }
        return false;
    }

    public boolean verificaColisao(int x, int y, String direcao, String nome) {
        for (int i = 0; i < tamanhoCoordenadas; i++) {
            if (coordenadas[i] != null && (x + posicaoXAtual) == coordenadas[i].getX()
                    && (y + posicaoYAtual) == coordenadas[i].getY()
                    && direcao.equals(coordenadas[i].getDirecao())) {
                System.out.println("Nao foi possivel instanciar o robo " + nome + ". Ja existe um robo nesta posicao.");
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
                    if (x != posicaoXAtual)
                        System.out.println("Para andar ao norte, o eixo x deve ser constante!");
                    else {
                        posicaoYAtual += y;
                        coordinate.setY(posicaoYAtual);
                    }
                    break;
                case "S":
                    if (x != posicaoXAtual)
                        System.out.println("Para andar ao sul, o eixo x deve ser constante!");
                    else {
                        posicaoYAtual -= y;
                        coordinate.setY(posicaoYAtual);
                    }
                    break;
                case "E":
                    if (y != posicaoYAtual)
                        System.out.println("Para andar ao leste, o eixo y deve ser constante!");
                    else {
                        posicaoXAtual += x;
                        coordinate.setX(posicaoXAtual);
                    }
                    break;
                case "O":
                    if (y != posicaoYAtual)
                        System.out.println("Para andar ao oeste, o eixo y deve ser constante!");
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
                default:
                    System.out.println("Direcao invalida!");
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