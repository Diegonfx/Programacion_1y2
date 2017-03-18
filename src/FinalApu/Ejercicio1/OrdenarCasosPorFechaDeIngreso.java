package FinalApu.Ejercicio1;

import java.util.Comparator;

/**
 * Created by agustin on 16/12/16.
 */
public class OrdenarCasosPorFechaDeIngreso implements Comparator<Caso> {
    @Override
    public int compare(Caso o1, Caso o2) {
        if(o1.getFechaDeInicio().before(o2.getFechaDeInicio())){
            return 1;
        }
        else if(o1.getFechaDeInicio().after(o2.getFechaDeInicio())){
            return -1;
        }
        return 0;
    }
}
