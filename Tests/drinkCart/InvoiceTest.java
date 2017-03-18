package drinkCart;

import org.junit.Test;

import java.util.HashMap;

public class InvoiceTest {

    @Test
    public void evaluatesCheckout(){
        String[] bebidas = {"Cepita","Coca", "Agua", "Aquarius", "Cepita"};
        DrinkCart cart = new DrinkCart(bebidas);

        HashMap<String, Double> precios = new HashMap<>();
        precios.put("Cepita", 14.9);
        precios.put("Coca", 25.9);
        precios.put("Agua", 16.7);
        precios.put("Aquarius", 18.1);

        Cashier cajero = new Cashier(precios);
        Invoice factura = cajero.checkout(cart);

        assertEquals(100.455,factura.totalAbanar(), 0.001);
    }


}
