package FinalApu.Ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by agustin on 16/12/16.
 */
public class Mediacion extends Caso {

    public Mediacion(Abogado unAbogado, ArrayList<String> personasInvolucradas, String codigo, String caratula) {
        super(unAbogado, personasInvolucradas, codigo, caratula);
    }

    @Override
    public void realizarAudiencia(Date fecha, int hora, String lugar) {
        getAudiencias().add(new Audiencia(fecha, hora,lugar));
    }

    @Override
    public boolean puedeRealizarAudiencias() {
        return true;
    }

    @Override
    public int precioPorMes() {
        return 2000;
    }

    @Override
    public Caso pasarCasoAProximoNivel(Abogado nuevoAbogado) {
        if(!sigueAbierto()){
            return new Juicio(nuevoAbogado, getPersonasInvolucradas(),getCodigo(),getCaratula());
        }
        throw new RuntimeException("Caso no esta cerrado!");
    }


}
