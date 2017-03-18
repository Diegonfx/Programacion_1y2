package FinalApu.Ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by agustin on 16/12/16.
 */
public class ExtraJudicial extends Caso {

    public ExtraJudicial(Abogado unAbogado, ArrayList<String> personasInvolucradas, String codigo, String caratula) {
        super(unAbogado, personasInvolucradas, codigo, caratula);
    }

    @Override
    public void realizarAudiencia(Date fecha, int hora, String lugar) {
        throw new RuntimeException("Caso extra judicial no realiza audiencias");
    }

    @Override
    public boolean puedeRealizarAudiencias() {
        return false;
    }

    @Override
    public int precioPorMes() {
        return 1000;
    }


    @Override
    public Caso pasarCasoAProximoNivel(Abogado nuevoAbogado) {
        if(!sigueAbierto()){
            return new Mediacion(nuevoAbogado, getPersonasInvolucradas(),getCodigo(),getCaratula());
        }
        throw new RuntimeException("Caso no esta cerrado!");

    }
}
