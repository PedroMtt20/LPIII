public class Main {
    public static void main(String[] args) {
        Data data = new Data(1, 10, 2022);
        Time time = new Time(2, 2, 0);
        DataHora dataHora = new DataHora(data, time);
        DataHora dataHora2 = new DataHora(data, time);

        System.out.println(dataHora.equals(dataHora2));
        System.out.println(dataHora2.isGreather(dataHora));
    }
}
