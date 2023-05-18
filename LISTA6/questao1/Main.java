public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(10);
        Time time3 = new Time(8, 30);
        Time time4 = new Time(12, 45, 30);
        Time time5 = new Time(time4);

        System.out.println("Time 1: " + time1.getTime());
        System.out.println("Time 2: " + time2.getTime());
        System.out.println("Time 3: " + time3.getTime());
        System.out.println("Time 4: " + time4.getTime());
        System.out.println("Time 5: " + time5.getTime());

        System.out.println("Time 1 eh AM? " + time1.isAm());

        Time time6 = new Time(9, 30);
        int seconds = time3.cron(time6);
        System.out.println("Tempo 3 ate Tempo 6: " + seconds + " segundos");

        time1.addTime(3600); // Adicionar 1 hora
        System.out.println("Time 1 apos adicionar 1 hora: " + time1.getTime());

        time2.addTime(30, 45); // Adicionar 30 minutos e 45 segundos
        System.out.println("Time 2 apos adicionar 30 minutos e 45 segundos: " + time2.getTime());

        time3.addTime(1, 30, 20); // Adicionar 1 hora, 30 minutos e 20 segundos
        System.out.println("Time 3 apos adicionar 1 hora, 30 minutos e 20 segundos: " + time3.getTime());

        time4.addTime(time6); // Adicionar Tempo 6 ao Tempo 4
        System.out.println("Time 4 apos adicionar Tempo 6: " + time4.getTime());

        time5.setTime(20, 15, 10); // Definir Tempo 5 para 20:15:10
        System.out.println("Time 5 apos definir para 20:15:10: " + time5.getTime());
    }
}
