package Parcial2.ejercicio1;

import java.util.ArrayList;

/**
 * Created by agustin on 11/11/16.
 */

public class Transport {
    private RegisterOfClients listOfClients;
    private ArrayList<Package> packages;
    private DeliverySystem deliverySystem;
    private Cashier cashier;


    public Transport(RegisterOfClients listOfClients, DeliverySystem aSystem) {
        this.listOfClients = listOfClients;
        cashier = new Cashier();
        packages = new ArrayList<>();
        deliverySystem = aSystem;

    }

    public void add (java.lang.Package aPackage){
        packages.add(aPackage);
    }

    public void startDelivering(){
        for (Package aPackage : packages){

            boolean delivered = false;
            for(Client aClient : listOfClients.getListOfClients()){

                if(aClient.verificarPedido(aPackage)){
                    Invoice comprobante  = cashier.createInvoice(aPackage);
                    deliverySystem.addInvoice(comprobante);
                    delivered = true;
                }
            }
            if( !delivered){
                throw new PackageWasNotDelivered(aPackage);
            }
        }
    }
}
