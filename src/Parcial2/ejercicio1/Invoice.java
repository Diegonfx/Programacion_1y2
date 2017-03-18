package Parcial2.ejercicio1;

import java.util.Date;

/**
 * Created by agustin on 11/11/16.
 */
public class Invoice {

    private String nameOfProduct;
    private int dniOfClient;
    private Date dateOfDelivery;

    public Invoice(String nameOfProduct, int dniOfClient) {
        this.nameOfProduct = nameOfProduct;
        this.dniOfClient = dniOfClient;
        dateOfDelivery = new Date();
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getDniOfClient() {
        return dniOfClient;
    }

    public Date getDateOfDelivery() {
        return dateOfDelivery;
    }

}
