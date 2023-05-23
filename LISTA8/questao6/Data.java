// package LISTA7.questao3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private static final String diasSemanas[] = { "Segunda-feira", "Terca-feira", "Quarta-feira",
            "Quinta-feira", "Sexta-feira", "Sabado", "Domingo" };
    private static final String meses[] = { "janeiro", "fevereiro", "marco", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };

    public Data(int _dia, int _mes, int _ano) {
        dia = _dia;
        mes = _mes;
        ano = _ano;
    }

    public Data() {
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data(Data data) {
        dia = data.dia;
        mes = data.mes;
        ano = data.ano;
    }

    public void setData(Data novaData) {
        dia = novaData.dia;
        mes = novaData.mes;
        ano = novaData.ano;
    }

    public void setData(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static int howManyDaysUntilEndYear(Data d) {
        LocalDate dataParametro = LocalDate.of(d.ano, d.mes, d.dia);
        LocalDate dataFimAno = LocalDate.of(d.ano, 12, 31);

        long diferenca = ChronoUnit.DAYS.between(dataParametro, dataFimAno);
        return (int) diferenca;
    }

    public static int howManyDaysUntilNextMonth(Data d) {
        LocalDate dataParametro = LocalDate.of(d.ano, d.mes, d.dia);
        long diferenca = 0;
        if(d.mes == 12) {
            LocalDate dataInicioMesSeguinte = LocalDate.of(d.ano, 1, 1); 
            diferenca = ChronoUnit.DAYS.between(dataParametro, dataInicioMesSeguinte);
        }
        else {
            LocalDate dataInicioMesSeguinte = LocalDate.of(d.ano, d.mes + 1, 1); 
            diferenca = ChronoUnit.DAYS.between(dataParametro, dataInicioMesSeguinte);
        }

        return (int) diferenca;
    }

    public static boolean isBisexto(Data d) {
        if ((d.ano % 4 == 0)) {
            if (d.ano % 100 != 0) {
                return true;
            } else {
                if (d.ano % 400 != 0)
                    return false;
                else
                    return true;
            }
        }
        return false;
    }

    public static String dayOfWeek(Data d) {
        LocalDate data = LocalDate.now();
        DayOfWeek numeroDiaSemana = data.getDayOfWeek();

        return diasSemanas[numeroDiaSemana.getValue() - 1];
    }

    public static String dayToPrintShort(Data d) {
        return d.dia + "/" + d.mes + "/" + d.ano;
    }

    public static String dayToPrintLong(Data d) {
        return d.dia + " de " + meses[d.mes - 1] + " de " + d.ano;
    }

    public void setData(int daquiAxDias) {
        dia += daquiAxDias;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia >= 30) {
                int monthsToAdd = dia / 30;
                dia = dia % 30;
                mes += monthsToAdd;
            }
        } else {
            if (dia >= 31) {
                int monthsToAdd = dia / 31;
                dia = dia % 31;
                mes += monthsToAdd;
            }
        }
        if (mes > 12) {
            ano += mes / 12;
            mes = mes % 12;
        }
    }

    public boolean isPrevious(Data outraData) {
        int dataEmSegundos = (dia * 3600) + (mes * 2629800) + (ano * 31536000);
        int outraDataEmSegundos = (dia * 3600) + (mes * 2629800) + (ano * 31536000);
        if (outraDataEmSegundos < dataEmSegundos) {
            return true;
        } else {
            return false;
        }
    }

    public int howManyDays(Data outraData) {
        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate dataParametro = LocalDate.of(outraData.ano, outraData.mes, outraData.dia);

        long diferenca = ChronoUnit.DAYS.between(dataAtual, dataParametro);

        return (int) diferenca;
    }

    public int howManyDays(int day, int month, int year) {
        LocalDate dataAtual = LocalDate.of(ano, mes, dia);
        LocalDate dataParametro = LocalDate.of(day, month, year);

        long diferenca = ChronoUnit.DAYS.between(dataAtual, dataParametro);

        return (int) diferenca;
    }

    public String dayOfWeek() {
        LocalDate dataAtual = LocalDate.now();
        DayOfWeek numeroDiaSemana = dataAtual.getDayOfWeek();
        return diasSemanas[numeroDiaSemana.getValue()];
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
        if (_dia >= 1 && _dia <= 31)
            this.dia = _dia;
        else
            System.out.println("Dia invalido!");
    }

    public void setMes(int _mes) {
        if (_mes >= 1 && mes <= 12)
            this.mes = _mes;
        else
            System.out.println("Mes invalido");
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

    public void imprimirDataExtenso() {
        String nomeMes = meses[mes - 1];
        String diaFormatado = String.format("%02d", dia);
        System.out.println(diaFormatado + " de " + nomeMes + " de " + ano);

    }
}