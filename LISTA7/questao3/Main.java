// package LISTA7.questao3;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(16, 5, 2023);
        int dias = Data.howManyDaysUntilEndYear(data);
        System.out.println(dias);
        dias = Data.howManyDaysUntilNextMonth(data);
        System.out.println(dias);
        System.out.println(Data.isBisexto(data));
        System.out.println(Data.dayOfWeek(data));
        System.out.println(Data.dayToPrintLong(data));
        System.out.println(Data.dayToPrintShort(data));
    }
}
