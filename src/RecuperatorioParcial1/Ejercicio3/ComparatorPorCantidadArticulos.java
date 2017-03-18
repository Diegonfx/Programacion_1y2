package RecuperatorioParcial1.Ejercicio3;

import RecuperatorioParcial1.Ejercicio2.Container;

import java.util.Comparator;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class ComparatorPorCantidadArticulos implements Comparator<Container>{

    @Override
    public int compare(Container o1, Container o2) {
        if (o1.getWeight()== o1.getWeight()) {
            return 0;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }
}
