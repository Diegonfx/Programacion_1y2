package RecuperatorioParcial2.Ejercicio1;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class Client {

    private ArrayList<Vehicle> vehiclesOwned;
    private AsegurCar asegurCar;

    public Client() {
        vehiclesOwned = new ArrayList<>();
    }

    public ArrayList<Vehicle> getVehiclesOwned() {
        return vehiclesOwned;
    }

    public void addVehicle(Vehicle unVehicle) {
        vehiclesOwned.add(unVehicle);
    }

    public void removeVehicle(Vehicle unVehicle) {
        vehiclesOwned.remove(unVehicle);
    }

}
