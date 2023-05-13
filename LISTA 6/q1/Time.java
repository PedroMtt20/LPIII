public class Time {
    private int hora;
    private int min;
    private int seg;

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
        seg+= obj.seg;

        if(seg >= 60){
            int minToAdd = seg / 60;
            seg = seg % 60;
            min += minToAdd + obj.min;
        }

        if(min >= 60){
            int hourToAdd = min / 60;
            min = min % 60;
            hora = hourToAdd + obj.hora;
        }

        if(hora >= 24){
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