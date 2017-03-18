package Parcial2.ejercicio1;

/**
 * Created by agustin on 11/11/16.
 */
public class Cashier {

    public Invoice createInvoice(Package aPackage){
        return new Invoice(aPackage.getProduct().getNameOfProduct(), aPackage.getDniOfClient());
    }
}
