package RecuperatorioParcial2.Ejercicio1;

import RecuperatorioParcial2.Ejercicio2.OrderVehicleDeterioro;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class AsegurCar {

    private ArrayList<Client> dataBase;
    private ArrayList<SecurePolicy> availablePolicies;

    public AsegurCar(ArrayList<Client> dataBase, ArrayList<SecurePolicy> availablePolicies) {
        this.dataBase = dataBase;
        this.availablePolicies = availablePolicies;
    }

    public ArrayList<Client> getDataBase() {
        return dataBase;
    }

    public ArrayList<SecurePolicy> getAvailablePolicies() {
        return availablePolicies;
    }

    public void calificarDeterioroVehiculo(Vehicle unVehicle) {

        Random rand = new Random();
        int num = rand.nextInt(99);

            if (unVehicle.hasContract()) {
                unVehicle.qualifyDeterioro(num);
            }
    }


    public void contratarPolizaDeAsegurCar(Client unClient , LocalDateTime duration , Vehicle unVehicle , SecurePolicy aPolicy) {

            if (availablePolicies.contains(aPolicy)) {

                ArrayList<Vehicle> vehiclesClient = unClient.getVehiclesOwned();

                if (vehiclesClient.contains(unVehicle)) {
                    if (unVehicle.hasContract() == true){

                        Contract aContract = new Contract(aPolicy , duration);
                        calificarDeterioroVehiculo(unVehicle);
                        unVehicle.addContract(aContract);
                        Factura unaFactura = new Factura(unClient);
                        System.out.println(unaFactura.getNameOfClient());
                        System.out.println(unaFactura.getNow());
                        System.out.println(unaFactura.getPrice());
                    }
                }
            }
        }

    public void controlVehiculo(Client unCliente) {

        for (Vehicle unVehicle : unCliente.getVehiclesOwned()) {
            double date6Months = unVehicle.getUnContract().getNowDouble() + unVehicle.getUnContract().getNowDouble() * 6 ;
            if (unVehicle.getUnContract().getNowDouble() <= date6Months) {
                calificarDeterioroVehiculo(unVehicle);
            } else {
                unVehicle.getUnContract().removePolicy();
            }
        }
    }

}
