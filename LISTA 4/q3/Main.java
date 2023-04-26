public class Main {
    public static void main(String[] args) {
        LampadaSupermercado lampadaSupermercado = new LampadaSupermercado();

        lampadaSupermercado.inicializaLampada(55.50, 60, 220.0, "AZUL", 3000);

        System.out.println("Preco: R$ " + lampadaSupermercado.getPreco() + " reais");
        System.out.println("Potencia: " + lampadaSupermercado.getPotencia() + "W");
        System.out.println("Voltagem: " + lampadaSupermercado.getVoltagem() + "V");
        System.out.println("Cor da luz: " + lampadaSupermercado.getCorLuz());
        System.out.println("Vida util: " + lampadaSupermercado.getVidaUtil() + "h");

        System.out.println("Luminosidade atual: " + lampadaSupermercado.getLuminosidade() + "%");
        lampadaSupermercado.ajustaLuminosidade(68);
        System.out.println("Luminosidade ajustada para: " + lampadaSupermercado.getLuminosidade() + "%");

        lampadaSupermercado.acende();
        System.out.println("Estado da lampada: ");
        lampadaSupermercado.estadoLampada();
        System.out.println("A lampada esta ligada? " + lampadaSupermercado.estaLigada());

        lampadaSupermercado.meiaLuz();
        System.out.println("Estado da lampada: ");
        lampadaSupermercado.estadoLampada();

        lampadaSupermercado.apaga();
        System.out.println("Estado da lampada: ");
        lampadaSupermercado.estadoLampada();
        System.out.println("A lampada esta ligada? " + lampadaSupermercado.estaLigada());
    }
}
