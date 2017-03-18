package Parcial2.ejercicio1;

import java.util.ArrayList;

/**
 * Created by agustin on 11/11/16.
 */
public class DeliverySystem {
    private Transport truck;
    private Transport car;
    private Transport bike;
    private ArrayList<Invoice> comprobantes;
    private RegisterOfClients registerOfClients;


    public DeliverySystem(RegisterOfClients registerOfClients){
        this.registerOfClients = registerOfClients;
        truck = new Transport(registerOfClients, this);
        car = new Transport(registerOfClients, this);
        bike = new Transport(registerOfClients, this);
        comprobantes = new ArrayList<Invoice>();
    }

    public void deliver(ArrayList<java.lang.Package> listOfPackages){
        for (java.lang.Package aPackage : listOfPackages){
            if(aPackage.getWeightOfPackage() > 10){
                truck.add(aPackage);
            }
            else if(aPackage.getWeightOfPackage() > 1){
                car.add(aPackage);
            }
            else{
                bike.add(aPackage);
            }
        }
        truck.startDelivering();
        car.startDelivering();
        bike.startDelivering();

    }

    public void addInvoice(Invoice aInvoice){
        comprobantes.add(aInvoice);
    }

    public ArrayList<Invoice> getComprobantes(){
        return comprobantes;
    }
}
