public class LampadaSupermercado {
    private double preco;
    private int potencia;
    private double voltagem;
    private String corLuz;
    private int vidaUtil;
    private String estadoLampada;
    private float luminosidade;

    public void inicializaLampada(double _preco, int _potencia, double _voltagem, String _corLuz, int _vidaUtil) {
        preco = _preco;
        potencia = _potencia;
        voltagem = _voltagem;
        corLuz = _corLuz;
        vidaUtil = _vidaUtil;
        estadoLampada = "apagada";
        luminosidade = 0;
    }

    public void setPreco(double novoPreco) {
        preco = novoPreco;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setVoltagem(double novaVoltagem) {
        voltagem = novaVoltagem;
    }
    
    public double getVoltagem() {
        return voltagem;
    }
    
    public void setPotencia(int novaPotencia) {
        potencia = novaPotencia;
    }
    
    public int getPotencia() {
        return potencia;
    }
    
    public void setCorLuz(String novaCorLuz) {
        corLuz = novaCorLuz;
    }
    
    public String getCorLuz() {
        return corLuz;
    }

    public void setVidaUtil(int novaVidaUtil) {
        vidaUtil = novaVidaUtil;
    }
    
    public int getVidaUtil() {
        return vidaUtil;
    }

    public float getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(float _luminosidade) {
        luminosidade = _luminosidade;
    }

    public void acende(){
        estadoLampada = "acesa";
    }

    public void apaga(){
        estadoLampada = "apagada";
    }

    public void meiaLuz(){
        estadoLampada = "meia-luz";
    }

    public void estadoLampada(){
        if(estadoLampada == "acesa"){
            System.out.println("A lampada esta acesa.");
        } else if(estadoLampada == "apagada"){
            System.out.println("A lampada esta apagada.");
        } else {
            System.out.println("A lampada esta em meia-luz.");
        }
    }

    public void ajustaLuminosidade(float _luminosidade){
        if(_luminosidade < 0){
            luminosidade = 0;
        } else if(_luminosidade > 100){
            luminosidade = 100;
        } else {
            luminosidade = _luminosidade;
        }
    }

    public boolean estaLigada(){
        if(estadoLampada == "acesa") return true;
        else return false;
    }
}