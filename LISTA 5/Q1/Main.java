
public class Main {
    public static void main(String[] args) {
        Time time = new Time(14, 40, 0);
        time.addSeconds(10000000); // 10000000 dá 17:46:40 horas
        System.out.println(time.getTime()); // resultado esperado: 8:26:40 horas
    }
}
