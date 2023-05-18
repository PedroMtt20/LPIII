public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(10, 5, 2023);
        Data data2 = new Data();
        
        System.out.print("Data 1: ");
        data1.imprimirData(); // Deve imprimir "10/05/2023"
        
        System.out.print("Data 2: ");
        data2.imprimirData(); // Deve imprimir "01/01/1970"
        
        data1.setData(15, 9, 2023);
        System.out.print("Data 1 apos definir nova data: ");
        data1.imprimirData(); // Deve imprimir "15/09/2023"
        
        data2.setData(50);
        System.out.print("Data 2 apos adicionar 50 dias: ");
        data2.imprimirData(); // Deve imprimir "20/02/1970"
        
        boolean isPrevious = data1.isPrevious(data2);
        System.out.println("Data 1 eh anterior a Data 2? " + isPrevious); // Deve imprimir "false"
        
        int days = data1.howManyDays(data2);
        System.out.println("Numero de dias entre Data 1 e Data 2: " + days); // Deve imprimir "214"
        
        String dayOfWeek = data1.dayOfWeek();
        System.out.println("Dia da semana da Data 1: " + dayOfWeek); // Deve imprimir o dia da semana correspondente
        
        data2.inicializarData(31, 12, 2022);
        System.out.print("Data 2 apos inicializacao: ");
        data2.imprimirData(); // Deve imprimir "31/12/2022"
    }
}
