package FinalApu.Ejercicio1;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public abstract class Caso {

    private Abogado AbogadoResponsable;
    private ArrayList<String> personasInvolucradas;
    private String codigo;
    private String caratula;
    private boolean casoCerrado;
    private Date fechaDeInicio;
    private Date fechaDeCierre;
    private ArrayList<Audiencia> audiencias;

    public Caso(Abogado unAbogado,ArrayList<String> personasInvolucradas, String codigo, String caratula) {
        AbogadoResponsable = unAbogado;
        this.personasInvolucradas = personasInvolucradas;
        this.codigo = codigo;
        this.caratula = caratula;
        casoCerrado = false;
        fechaDeInicio = new Date();
    }

    public void cerrarCaso(){
        casoCerrado = true;
        fechaDeCierre = new Date();
    }


    public boolean sigueAbierto(){
        return !casoCerrado;
    }

    public abstract Caso pasarCasoAProximoNivel(Abogado nuevoAbogado);

    public abstract int precioPorMes();

    public abstract boolean puedeRealizarAudiencias();

    public abstract void realizarAudiencia(Date fecha, int hora, String lugar);

    public Abogado getAbogadoResponsable() {return AbogadoResponsable;}

    public ArrayList<Audiencia> getAudiencias() { return audiencias; }

    public ArrayList<String> getPersonasInvolucradas() { return personasInvolucradas; }

    public String getCodigo() {
        return codigo;
    }

    public String getCaratula() {
        return caratula;
    }

    public Date getFechaDeInicio() {return fechaDeInicio;}

    private boolean oneMonthHasPassed(Date aDate){
        Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        cal.add(Calendar.MONTH, 1);
        Date oneMonthLater = cal.getTime();

        Date currentDate = new Date(); // current date
        return currentDate.after(oneMonthLater);
    }

}
