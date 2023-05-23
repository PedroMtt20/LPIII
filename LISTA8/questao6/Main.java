public class Main {
    public static void main(String[] args) {
        Data data = new Data(31, 10, 2002);
        Time time = new Time(21, 10, 11);
        Contato contato = new Contato("Pedro", "pedro@gmail.com", "88888888" ,"31/10/2002");
        Agendamento agendamento = new Agendamento(data, time, contato);
        agendamento.printAgendamento();

    }
}
