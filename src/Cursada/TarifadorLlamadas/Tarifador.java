package Cursada.TarifadorLlamadas;


public class Tarifador {

    public double tarifarLlamada(Llamada unaLlamada){

        if(unaLlamada.isInternacional()){
            TarifadorInternacional tarifadorInternacional = new TarifadorInternacional();
            return tarifadorInternacional.tarifar(unaLlamada);
        }
        else if(unaLlamada.isLargaDistancia()){
            TarifadorLargaDistancia tarifadorLargaDistancia = new TarifadorLargaDistancia();
            return tarifadorLargaDistancia.tarifar(unaLlamada);
        }
        else if(unaLlamada.isLocal()){
            TarifadorLocal tarifadorLocal = new TarifadorLocal();
            return tarifadorLocal.tarifar(unaLlamada);
        }
        else{
            throw new RuntimeException();
        }

    }


}
