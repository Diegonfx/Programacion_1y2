package Cursada.TarifadorLlamadas;

import java.util.Comparator;

public class DurationOfTimeComparator implements Comparator<Llamada> {

    @Override
    public int compare(Llamada llamada1, Llamada llamada2) {
        if(llamada1.getDuracionDeLlamada() ==
                llamada2.getDuracionDeLlamada())
            return 0;
        if(llamada1.getDuracionDeLlamada() >
                llamada2.getDuracionDeLlamada())
            return 1;
        return -1;
    }


}
