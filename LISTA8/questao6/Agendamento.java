public class Agendamento {
    private Data data;
    private Time hora;
    private Contato contato;

    Agendamento(Data _data, Time _hora, Contato _contato){
        data = _data;
        hora = _hora;
        contato = _contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public Contato getContato() {
        return contato;
    }

    public Data getData() {
        return data;
    }

    public Time getHora() {
        return hora;
    }

    public void printAgendamento(){
        System.out.println("------AGENDAMENTO------");
        System.err.println("Sr(a): " + contato.getNome());
        data.imprimirData();
        hora.prnTime();
        contato.imprimirContato();
    }
}
