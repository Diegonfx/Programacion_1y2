package Cursada.TarifadorLlamadas;

/**
 * Created by agustin on 8/11/16.
 */
public class TarifadorInternacional {

    public double tarifar(Llamada unaLlamada){
        return (unaLlamada.getDuracionDeLlamada() / 60) * 1.0;
    }
}
