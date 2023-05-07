public class Time {
    private int hora;
    private int min;
    private int seg;

    public Time(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    boolean isAm() {
        return ((this.hora < 12) && (this.min < 0)) ? true : false;
    }

    int cron(Time outraHora) {
        int totalSegundos = 0;
        if (outraHora.hora < hora && outraHora.min < min && outraHora.seg < seg) {
            totalSegundos = (86400 - ((outraHora.hora * 3600) + (outraHora.min * 60) + outraHora.seg))
                    + ((hora * 3600) + (min * 60) + seg);
        } else {
            totalSegundos = (hora * 3600) + (min * 60) + seg;

            return totalSegundos - ((outraHora.hora * 3600) + (outraHora.min * 60) + outraHora.seg);
        }
        return 0;
    }

    void addSeconds(int secs) {
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