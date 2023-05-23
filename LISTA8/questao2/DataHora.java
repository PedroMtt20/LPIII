public class DataHora {
    private Data data;
    private Time hora;

    DataHora(Data _data, Time _time){
        data = _data;
        hora = _time;
    }

    public String toString(){
        return data.toString() + " Hora: " + hora.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        DataHora other = (DataHora) obj;
        return data.getDia() == other.data.getDia() &&
               data.getMes() == other.data.getMes() &&
               data.getAno() == other.data.getAno() &&
               hora.getHora() == other.hora.getHora() &&
               hora.getMin() == other.hora.getMin() &&
               hora.getSeg() == other.hora.getSeg();
    }
    
    public boolean isGreather(DataHora outroObjeto) {
        if (data.getAno() > outroObjeto.data.getAno()) {
            return true;
        } else if (data.getAno() == outroObjeto.data.getAno()) {
            if (data.getMes() > outroObjeto.data.getMes()) {
                return true;
            } else if (data.getMes() == outroObjeto.data.getMes()) {
                if (data.getDia() > outroObjeto.data.getDia()) {
                    return true;
                } else if (data.getDia() == outroObjeto.data.getDia()) {
                    if (hora.getHora() > outroObjeto.hora.getHora()) {
                        return true;
                    } else if (hora.getHora() == outroObjeto.hora.getHora()) {
                        if (hora.getMin() > outroObjeto.hora.getMin()) {
                            return true;
                        } else if (hora.getMin() == outroObjeto.hora.getMin()) {
                            return hora.getSeg() > outroObjeto.hora.getSeg();
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean isLower(DataHora outroObjeto) {
        if (data.getAno() < outroObjeto.data.getAno()) {
            return true;
        } else if (data.getAno() == outroObjeto.data.getAno()) {
            if (data.getMes() < outroObjeto.data.getMes()) {
                return true;
            } else if (data.getMes() == outroObjeto.data.getMes()) {
                if (data.getDia() < outroObjeto.data.getDia()) {
                    return true;
                } else if (data.getDia() == outroObjeto.data.getDia()) {
                    if (hora.getHora() < outroObjeto.hora.getHora()) {
                        return true;
                    } else if (hora.getHora() == outroObjeto.hora.getHora()) {
                        if (hora.getMin() < outroObjeto.hora.getMin()) {
                            return true;
                        } else if (hora.getMin() == outroObjeto.hora.getMin()) {
                            return hora.getSeg() < outroObjeto.hora.getSeg();
                        }
                    }
                }
            }
        }
        return false;
    }

}
