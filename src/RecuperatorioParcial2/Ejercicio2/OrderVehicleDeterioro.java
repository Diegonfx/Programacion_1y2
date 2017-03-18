package RecuperatorioParcial2.Ejercicio2;

import RecuperatorioParcial2.Ejercicio1.Vehicle;

import java.util.Comparator;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class OrderVehicleDeterioro implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle vehicle1, Vehicle vehicle2) {

        if (vehicle1.getDeterioro() == vehicle2.getDeterioro()) {
            return 0;
        } else if (vehicle1.getDeterioro() < vehicle2.getDeterioro()) {
            return 1;
        } else {
            return -1;
        }

    }

}
