public class Data {
    private int dia;
    private int mes;
    private int ano;

    public void inicializarData(int _dia, int _mes, int _ano) {
        if (verificaData(_dia, _mes, _ano)) {
            this.dia = _dia;
            this.mes = _mes;
            this.ano = _ano;
        } else {
            System.out.println("Data inválida");
        }
    }

    public void setAno(int _ano) {
        this.ano = _ano;
    }

    public void setDia(int _dia) {
        if(_dia >= 1 && _dia <= 31) this.dia = _dia;
        else System.out.println("Dia inválido!");
    }

    public void setMes(int _mes) {
        if(_mes >= 1 && mes <= 12) this.mes = _mes;
        else System.out.println("Mês inválido");
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
        System.out.println(diaFormatado + "/" + mes + "/" + ano);
    }

    public void imprimirDataExtenso(){
        final String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        String nomeMes = meses[mes-1];
        String diaFormatado = String.format("%02d", dia);
        System.out.println(diaFormatado + " de " + nomeMes + " de " + ano);

    }
}