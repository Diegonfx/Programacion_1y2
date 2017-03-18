package FinalDiciembre.Ejercicio1;

import java.util.Comparator;

/**
 * Created by agustin on 16/12/16.
 */
public class OrdenarCasosPorFechaDeIngreso implements Comparator<Case> {
    @Override
    public int compare(Case o1, Case o2) {
        if(o1.getInitialDate().before(o2.getInitialDate())){
            return 1;
        }
        else if(o1.getInitialDate().after(o2.getInitialDate())){
            return -1;
        }
        return 0;
    }
}
