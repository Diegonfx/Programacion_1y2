package Cursada.drinkCart;

import java.util.ArrayList;
import java.util.HashMap;

public class Cashier {

    private HashMap<String, Double> catalog;

    public Cashier(HashMap<String, Double> precios){
        this.catalog = precios;
    }


    public double costoDeCart(DrinkCart cart){
        double costo = 0;

        for (String item : cart.getElements()){
            costo += costOf(item);
        }
        return costo;
    }

    public Invoice checkout(DrinkCart aCart){
        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();

        for(String item : aCart.getElements()){
            invoiceItems.add(new InvoiceItem(item, costOf(item)));
        }

        return new Invoice(invoiceItems);
    }

    public double costOf(String aItem) {
        if(!catalog.containsKey(aItem)){
            throw new UnknownItemCostException(aItem + " is not contained in the price catalog");
        }

        return catalog.get(aItem);

    }

}
