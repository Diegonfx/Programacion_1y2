package Cursada.TarifadorLlamadas;

import java.util.Date;

public class Llamada {
    private NumeroTelefonico emisor;
    private NumeroTelefonico receptor;
    private Date fecha;
    private int horaDeInicio;
    private int duracionDeLlamada;

    public Llamada(NumeroTelefonico emisor, NumeroTelefonico receptor, Date fecha, int horaDeInicio, int duracionDeLlamada) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.fecha = fecha;
        this.horaDeInicio = horaDeInicio;
        this.duracionDeLlamada = duracionDeLlamada;

    }

    public boolean isInternacional(){
        if(emisor.getCodigoDePais() != receptor.getCodigoDePais())
            return true;

        return false;
    }

    public boolean isLargaDistancia(){
        if(!isInternacional() && emisor.getCodigoDeArea() != receptor.getCodigoDeArea())
            return true;

        return false;
    }

    public boolean isLocal(){
        if(!isInternacional() && !isLargaDistancia())
            return true;

        return false;
    }

    public int getDuracionDeLlamada() {
        return duracionDeLlamada;
    }

    public int getHoraDeInicio() {
        return horaDeInicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public NumeroTelefonico getReceptor() {
        return receptor;
    }

    public NumeroTelefonico getEmisor() {
        return emisor;
    }

    public String toString(){
        return "Duracion de llamada: "+ duracionDeLlamada;
    }

}
