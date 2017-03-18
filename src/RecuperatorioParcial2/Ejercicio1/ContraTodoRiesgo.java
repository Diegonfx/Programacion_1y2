package RecuperatorioParcial2.Ejercicio1;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class ContraTodoRiesgo extends SecurePolicy {

    @Override
    double getPrice(Vehicle unVehiculo) {
        return unVehiculo.getPrice() * 0.02;
    }

    @Override
    double getBenefits(Client aClient) {
        double lastPrice = 0;
        for (Vehicle unVehiculo : aClient.getVehiclesOwned()) {
            if(hasMoreThanOneVehicle(aClient)) {
                if (carsPolicyIsContraTodoRiesgo(unVehiculo))
                    lastPrice = getPrice(unVehiculo);
                lastPrice -= lastPrice * 0.1;
            }
        }
        return lastPrice;
    }
}
