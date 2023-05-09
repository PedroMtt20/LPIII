public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(8, 5, 2023);
        Data data2 = new Data(10, 5, 2023);

        System.out.println("Data 1:");
        data1.imprimirData();
        System.out.println("Data 2:");
        data2.imprimirData();

        if (data2.isPrevious(data1)) {
            System.out.println("Data 2 eh anterior a data 1");
        } else {
            System.out.println("Data 1 eh anterior a data 2");
        }

        int diferencaDias = data1.howManyDays(data2);
        System.out.println("Diferenca em dias entre as datas: " + diferencaDias);

        String diaSemanaData1 = data1.dayOfWeek();
        System.out.println("Dia da semana da data 1: " + diaSemanaData1);

        String diaSemanaData2 = data2.dayOfWeek();
        System.out.println("Dia da semana da data 2: " + diaSemanaData2);
    }
}
