package drinkCart.filtros;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PrecioMayorA5Test {

    @Test
    public void evaluatesMayorA5(){
        HashMap<String, Double> precios = new HashMap<>();
        precios.put("Cepita", 1.9);
        precios.put("Coca", 5.9);
        precios.put("Agua", 6.7);
        precios.put("Aquarius", 3.1);

        DrinkCatalog unDrinkCatalog = new DrinkCatalog(precios);

        PrecioMayorA5 mayorA5 = new PrecioMayorA5();

        HashMap<String, Double> nuevoCatalog = unDrinkCatalog.aplicarFiltro(mayorA5);


        assertFalse( nuevoCatalog.containsKey("Cepita") ); //No tiene cepita
        assertTrue( nuevoCatalog.containsKey("Coca") );  //Cotiene coca

    }

}