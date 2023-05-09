import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int _dia, int _mes, int _ano){
        dia = _dia;
        mes = _mes;
        ano = _ano;
    }

    public boolean isPrevious(Data outraData){
        int dataEmSegundos = (dia * 3600) + (mes * 2629800) + (ano *  31536000);
        int outraDataEmSegundos = (dia * 3600) + (mes * 2629800) + (ano *  31536000);
        if(outraDataEmSegundos < dataEmSegundos){
            return true;
        } else{ 
            return false;
        }
    }

    public int howManyDays(Data outraData) {
        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate dataParametro = LocalDate.of(outraData.ano, outraData.mes, outraData.dia);

        long diferenca = ChronoUnit.DAYS.between(dataAtual, dataParametro);

        return (int) diferenca;
    }

    public String dayOfWeek(){
        final String diasSemanas[] = {"Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
        int k = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano/100) + (ano/400) + 2;
        int diaNumero = k % 7;

        return diasSemanas[diaNumero];
    }

    public void inicializarData(int _dia, int _mes, int _ano) {
        if (verificaData(_dia, _mes, _ano)) {
            this.dia = _dia;
            this.mes = _mes;
            this.ano = _ano;
        } else {
            System.out.println("Data invalida");
        }
    }

    public void setAno(int _ano) {
        this.ano = _ano;
    }

    public void setDia(int _dia) {
        if(_dia >= 1 && _dia <= 31) this.dia = _dia;
        else System.out.println("Dia invalido!");
    }

    public void setMes(int _mes) {
        if(_mes >= 1 && mes <= 12) this.mes = _mes;
        else System.out.println("Mes invalido");
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    private boolean verificaData(int _dia, int _mes, int _ano) {
        if ((_mes >= 1) && (_mes <= 12)) {
            if (_mes == 2) {
                if (_ano % 4 == 0) {
                    if ((_ano % 100 == 0) && (_ano % 400 != 0)) {
                        return (_dia >= 1) && (_dia <= 28);
                    } else {
                        return (_dia >= 1) && (_dia <= 29);
                    }
                } else {
                    return (_dia >= 1) && (_dia <= 28);
                }
            } else {
                if ((_mes == 4) || (_mes == 6) || (_mes == 9) || (_mes == 11)) {
                    return (_dia >= 1) && (_dia <= 30);
                } else {
                    return (_dia >= 1) && (_dia <= 31);
                }
            }
        } else {
            return false;
        }
    }

    public void imprimirData() {
        String diaFormatado = String.format("%02d", dia);
        String mesFormatado = String.format("%02d", mes);
        System.out.println(diaFormatado + "/" + mesFormatado + "/" + ano);
    }

    public void imprimirDataExtenso(){
        final String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        String nomeMes = meses[mes-1];
        String diaFormatado = String.format("%02d", dia);
        System.out.println(diaFormatado + " de " + nomeMes + " de " + ano);

    }
}