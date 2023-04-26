public class Main{
    public static void main(String[] args) {
        Data data = new Data();

        data.inicializarData(25, 4, 2023);

        data.imprimirData();

        data.imprimirDataExtenso();

        // Altera o dia para um valor inválido (32)
        data.setDia(32);

        // Altera o mês para um valor inválido (-1)
        data.setMes(-1);

        // Altera o ano
        data.setAno(2024);

        // Tenta inicializar a data com um valor inválido (31/02/2023)
        data.inicializarData(31, 2, 2023);

        // Imprime a data novamente
        data.imprimirData();
    }
}