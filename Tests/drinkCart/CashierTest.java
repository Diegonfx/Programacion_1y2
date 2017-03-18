package drinkCart;

import org.junit.Test;

import java.util.HashMap;


public class CashierTest {

    @Test
    public void evaluateCostoDeDrinkCart(){
        String[] bebidas = {"Cepita","Coca", "Agua", "Aquarius", "Cepita"};
        DrinkCart cart = new DrinkCart(bebidas);

        HashMap<String, Double> precios = new HashMap<>();
        precios.put("Cepita", 14.9);
        precios.put("Coca", 25.9);
        precios.put("Agua", 16.7);
        precios.put("Aquarius", 18.1);

        Cashier cajero = new Cashier(precios);

        assertEquals(90.5,cajero.costoDeCart(cart), 0.1);
    }

    @Test
    public void test001_HeKnowsItemsCost(){
        HashMap<String,Double> aCatalog = new HashMap<>();
        aCatalog.putIfAbsent("CocaCola 2lts", 30.0);
        Cashier aCashier = new Cashier(aCatalog);

        assertEquals(30, aCashier.costOf("CocaCola 2lts"), 0.1);
    }

    @Test(expected = UnknownItemCostException.class)
    public void test002_WhenHeDoesntKnowItemsCostShouldRaiseError(){
        HashMap<String,Double> aCatalog = new HashMap<>();
        Cashier aCashier = new Cashier(aCatalog);

        aCashier.costOf("Item Desconocido");
    }

}
