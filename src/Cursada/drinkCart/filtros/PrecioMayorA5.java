package Cursada.drinkCart.filtros;


import java.util.HashMap;
import java.util.Map;

public class PrecioMayorA5 implements TieneFiltro{

    public HashMap<String, Double> filtrar(HashMap<String, Double> unCatalogo ){

        HashMap<String, Double> newCatalog = new HashMap<>();

        for ( Map.Entry<String, Double> element : unCatalogo.entrySet() ) {

            if(element.getValue() >= 5){
                newCatalog.put(element.getKey(), element.getValue());
            }

        }
        return newCatalog;
    }
}









