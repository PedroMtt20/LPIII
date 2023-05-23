// package LPIII.LISTA7.questao2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Time {
    private int hora;
    private int min;
    private int seg;

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }
    
    public void setSeg(int seg) {
        this.seg = seg;
    }

    public Time() {
        this.hora = 0;
        this.min = 0;
        this.seg = 0;
    }

    public Time(int h) {
        this.hora = h;
        this.hora = 0;
        this.hora = 0;
    }

    public Time(int h, int m) {
        this.hora = h;
        this.min = m;
        this.seg = 0;
    }

    public Time(int h, int m, int s) {
        this.hora = h;
        this.min = m;
        this.seg = s;
    }

    public Time(Time time) {
        this.hora = time.hora;
        this.min = time.min;
        this.seg = time.seg;
    }

    public static Time diffTime(Time t1, Time t2) {
        int t1Seconds = t1.hora * 3600 + t1.min * 60 + t1.seg;
        int t2Seconds = t2.hora * 3600 + t2.min * 60 + t2.seg;

        int diffSeconds = 0;

        if (t2Seconds < t1Seconds) {
            diffSeconds = Math.abs(86400 - t1Seconds) + t2Seconds;
        } else {
            diffSeconds = Math.abs(t2Seconds - t1Seconds);
        }

        int diffHours = diffSeconds / 3600;
        diffSeconds = diffSeconds % 3600;
        int diffMinutes = diffSeconds / 60;
        diffSeconds = diffSeconds % 60;

        return new Time(diffHours, diffMinutes, diffSeconds);
    }

    public static Time diffTime(Time t) {
        Calendar calendar = Calendar.getInstance();

        int horaAtual = calendar.get(Calendar.HOUR_OF_DAY);
        int minAtual = calendar.get(Calendar.MINUTE);
        int segAtual = calendar.get(Calendar.SECOND);

        LocalTime localTimeHoraParametro = LocalTime.of(t.hora, t.min, t.seg);
        LocalTime localTimeHoraAtual = LocalTime.of(horaAtual, minAtual, segAtual);
        
        Duration duracaoDiferenca = Duration.between(localTimeHoraAtual, localTimeHoraParametro);
        Duration duracaoHoraParametro = Duration.between(LocalTime.MIN, localTimeHoraParametro);
        Duration duracaoHoraAtual = Duration.between(LocalTime.MIN, localTimeHoraAtual); 
        
        long segundos = 0;
        if(t.hora < horaAtual){
            segundos =  (86400 - duracaoHoraAtual.getSeconds()) + duracaoHoraParametro.getSeconds();
        } else {
            segundos = duracaoDiferenca.getSeconds();
        }

        long horas = segundos / 3600; //converte segundos para horas
        segundos %= 3600;
        long minutos = segundos / 60; // converte segundos para minutos
        segundos %= 60; // calcula os segundos restantes

        return new Time((int) horas, (int) minutos,  (int) segundos);
    }

    private int toSeconds(Time t){
        return (t.hora * 3600) + (t.min * 60) + (t.seg);
    }

    boolean isAm(Time t) {
        return t.hora > 12 && t.min > 0 && t.seg > 0 ? true : false;
    }

    boolean isPm(Time t) {
        return t.hora < 12 && t.min < 0 && t.seg < 0 ? true : false;
    }

    boolean isAm() {
        return ((this.hora < 12) && (this.min < 0)) ? true : false;
    }

    int cron(Time outraHora) {
        int totalSegundos = 0;
        int segundosOutraHora = (outraHora.hora * 3600) + (outraHora.min * 60) + outraHora.seg;
        int segundosHoraAtual = (hora * 3600) + (min * 60) + seg;

        if (segundosOutraHora <= segundosHoraAtual) {
            totalSegundos = segundosHoraAtual - segundosOutraHora;
        } else {
            totalSegundos = (24 * 3600 - segundosOutraHora) + segundosHoraAtual;
        }

        return totalSegundos;
    }

    void addTime(int secs) {
        seg += secs;

        if (seg >= 60) {
            int minToAdd = seg / 60;
            seg = seg % 60;
            min += minToAdd;
        }

        if (min >= 60) {
            int hourToAdd = min / 60;
            min = min % 60;
            hora += hourToAdd;
        }

        if (hora >= 24) {
            hora = hora % 24;
        }
    }

    void addTime(int m, int s) {
        seg += s;

        if (seg >= 60) {
            int minToAdd = seg / 60;
            seg = seg % 60;
            min += minToAdd + m;
        }

        if (min >= 60) {
            int hourToAdd = min / 60;
            min = min % 60;
            hora += hourToAdd;
        }

        if (hora >= 24) {
            hora = hora % 24;
        }
    }

    void addTime(int h, int m, int s) {
        seg += s;

        if (seg >= 60) {
            int minToAdd = seg / 60;
            seg = seg % 60;
            min += minToAdd + m;
        }

        if (min >= 60) {
            int hourToAdd = min / 60;
            min = min % 60;
            hora += hourToAdd + h;
        }

        if (hora >= 24) {
            hora = hora % 24;
        }
    }

    void addTime(Time obj) {
        seg += obj.seg;

        if (seg >= 60) {
            int minToAdd = seg / 60;
            seg = seg % 60;
            min += minToAdd + obj.min;
        }

        if (min >= 60) {
            int hourToAdd = min / 60;
            min = min % 60;
            hora = hourToAdd + obj.hora;
        }

        if (hora >= 24) {
            hora = hora % 24;
        }
    }

    private boolean validateTime(int hora, int min, int seg) {
        return validateHour(hora) &&
                validateMinOrSec(min) &&
                validateMinOrSec(seg);
    }

    private boolean validateHour(int hora) {
        if ((hora >= 0) && (hora < 25))
            return true;
        else
            return false;
    }

    private boolean validateMinOrSec(int param) {
        if ((param >= 0) && (param < 61))
            return true;
        else
            return false;
    }

    public void setTime(int hora, int min, int seg) {
        if (validateTime(hora, min, seg)) {
            this.hora = hora;
            this.min = min;
            this.seg = seg;
        } else {
            this.hora = 0;
            this.min = 0;
            this.seg = 0;
        }
    }

    public String getTime() {
        String res = this.hora + ":" + this.min + ":" + this.seg;
        return res;
    }

    public void prnTime() {
        System.out.println(getTime());
    }
}