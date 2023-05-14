public class Coordenadas {
    private int x = 0;
    private int y = 0;
    private String direcao = "N";

    Coordenadas(int x, int y, String direcao){
        this.x = x;
        this.y = y;
        this.direcao = direcao;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
}
