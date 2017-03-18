package RecuperatorioParcial2.Ejercicio1;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class ContraTerceros extends SecurePolicy {

    @Override
    double getPrice(Vehicle unVehiculo) {
            return unVehiculo.getPrice() * 0.01;

    }

    @Override
    double getBenefits(Client unCliente) {
        double lastPrice = 0;
        for (Vehicle unVehiculo : unCliente.getVehiclesOwned()) {
            if (durationOfCarsContractIsGreaterThanTwoYears(unVehiculo) && (deterioroIsLowerThanTwenty(unVehiculo)))
                lastPrice = getPrice(unVehiculo);
            lastPrice -= 2 * 0.01;
        }
        return lastPrice;
    }
}
