public class Main {
    public static void main(String[] args) {
        LampadaSupermercado lampadaSupermercado = new LampadaSupermercado();

        lampadaSupermercado.inicializaLampada(23, 44, 220, "azul", 4);
        lampadaSupermercado.acende();
        lampadaSupermercado.estadoLampada();
        lampadaSupermercado.apaga();
        lampadaSupermercado.estadoLampada();
        System.out.println(lampadaSupermercado.getPreco());
        lampadaSupermercado.setPreco(99);
        System.out.println(lampadaSupermercado.getPreco());
    }
}
