package Cursada.drinkCart;


import java.util.ArrayList;

public class Invoice {

    private ArrayList<InvoiceItem> items;
    private double totalCost = 0;

    public Invoice(ArrayList<InvoiceItem> listaDeItems) {
        items = listaDeItems;

        for (InvoiceItem item : listaDeItems){
            totalCost += item.getPrice();
        }
    }

    public double totalAbanar() {

        return  totalCost * 1.11; // 11% IVA;
    }


}
