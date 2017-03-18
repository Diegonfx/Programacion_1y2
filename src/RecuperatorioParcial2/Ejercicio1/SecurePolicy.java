package RecuperatorioParcial2.Ejercicio1;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public abstract class SecurePolicy implements TypeOfBenefit{

    abstract double getPrice(Vehicle unVehiculo);
    abstract double getBenefits(Client aClient);

    @Override
    public boolean durationOfCarsContractIsGreaterThanTwoYears(Vehicle unVehiculo) {

        if (unVehiculo.hasContract()) {
            if (unVehiculo.getUnContract().getDuracionDouble() >= unVehiculo.getUnContract().getNowDouble() +2) {
                return true;
            }
        } return false;
    }

    @Override
    public boolean deterioroIsLowerThanTwenty(Vehicle unVehiculo) {

        if (unVehiculo.getDeterioro() <= 20) {
            return true;
        } return false;

    }

    @Override
    public boolean carsPolicyIsContraTodoRiesgo(Vehicle unVehiculo) {

        ContraTodoRiesgo poliza = new ContraTodoRiesgo();

        if (unVehiculo.hasContract()) {
            if (unVehiculo.getUnContract().getaPolicy().equals(poliza)) {
                return true;
            }
        } return false;

    }

    @Override
    public boolean hasMoreThanOneVehicle(Client unClient) {

        ArrayList<Vehicle> vehiclesClient = unClient.getVehiclesOwned();

        for (int i = 0; i < vehiclesClient.size(); i++) {
            if ((vehiclesClient.size() > 1) && (vehiclesClient.get(i).hasContract())) {
                return true;
            }
        }
        return false;

    }

}
