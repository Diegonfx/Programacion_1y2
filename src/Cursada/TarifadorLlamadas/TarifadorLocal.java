package Cursada.TarifadorLlamadas;

/**
 * Created by agustin on 8/11/16.
 */
public class TarifadorLocal {

    public double tarifar(Llamada unaLlamada){
        return (unaLlamada.getDuracionDeLlamada()/60) * 0.2;
    }
}
