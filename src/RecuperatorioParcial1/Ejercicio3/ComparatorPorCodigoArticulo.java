package RecuperatorioParcial1.Ejercicio3;

import RecuperatorioParcial1.Ejercicio2.Client;
import RecuperatorioParcial1.Ejercicio2.Container;

import java.util.Comparator;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class ComparatorPorCodigoArticulo implements Comparator<Container> {

    private Client aClient;

    @Override
    public int compare(Container o1, Container o2) {

        if (o1.getArticleCode()== o1.getArticleCode()) {
            return 0;
        } else if (o1.getArticleCode() < o2.getArticleCode()) {
            return -1;
        } else {
            return 1;
        }
    }
}
