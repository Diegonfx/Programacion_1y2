package Cursada.drinkCart;


public class InvoiceItem {
    private String type;
    private double price;

    public InvoiceItem(String aType, double aPrice){
        type = aType;
        price = aPrice;
    }


    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
