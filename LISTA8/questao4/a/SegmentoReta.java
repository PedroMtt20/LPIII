public class SegmentoReta {
    private Ponto2D pontoInicial;
    private Ponto2D pontoFinal;
    private double dimensao;

    SegmentoReta(Ponto2D p1, Ponto2D p2) {
        pontoInicial = new Ponto2D(p1.getX(), p1.getY());
        pontoFinal = new Ponto2D(p2.getX(), p2.getY());
        dimensao = calculaDimensao();
    }

    public double getDimensao() {
        return dimensao;
    }

    public Ponto2D getPontoFinal() {
        return pontoFinal;
    }

    public Ponto2D getPontoInicial() {
        return pontoInicial;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void setPontoFinal(Ponto2D pontoFinal) {
        this.pontoFinal = pontoFinal;
    }

    public void setPontoInicial(Ponto2D pontoInicial) {
        this.pontoInicial = pontoInicial;
    }

    public void imprimeSegmentoReta() {
        System.out.println("O segmento de reta inicia no ponto (" + pontoFinal.getX() + "," + pontoInicial.getY()
                + ") e finaliza no ponto" +
                "(" + pontoFinal.getX() + "," + pontoFinal.getY() + ")");
    }

    public double calculaDimensao(){
        return Math.sqrt(Math.pow(pontoFinal.getX() - pontoInicial.getX(), 2) + Math.pow(pontoFinal.getY() - pontoInicial.getY(), 2));
    }    

}
