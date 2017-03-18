package FinalApu.Ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by agustin on 16/12/16.
 */
public class Juicio extends Caso {

    public Juicio(Abogado unAbogado, ArrayList<String> personasInvolucradas, String codigo, String caratula) {
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
        return 5000;
    }

    @Override
    public Caso pasarCasoAProximoNivel(Abogado nuevoAbogado) {

        throw new RuntimeException("Un juicio es el nivel mas alto");
    }
}
