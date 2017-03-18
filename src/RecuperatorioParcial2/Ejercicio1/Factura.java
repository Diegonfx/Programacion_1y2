package RecuperatorioParcial2.Ejercicio1;

import java.time.LocalDateTime;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class Factura {

    private Client nameOfClient;
    private LocalDateTime now;
    private double price;

    public Factura(Client nameOfClient) {
        price = 0;
        this.nameOfClient = nameOfClient;
        now = LocalDateTime.now();
    }

    public Client getNameOfClient() {
        return nameOfClient;
    }

    public LocalDateTime getNow() {
        return now;
    }

    public double getPrice() {
        double finalPrice = 0;
        for (Vehicle un : nameOfClient.getVehiclesOwned()) {
            finalPrice += un.getUnContract().getaPolicy().getPrice(un);
        }
        return finalPrice;
    }
}
