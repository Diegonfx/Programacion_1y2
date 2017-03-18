package Parcial2.ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by agustin on 11/11/16.
 */
public class Shop {

    private HashMap<Integer, Product> listOfProducts;
    private DeliverySystem delivery;
    private ArrayList<Package> listOfOrders;

    public Shop(HashMap<Integer, Product> listOfProducts, ArrayList<Client> listOfClients){
        this.listOfProducts = listOfProducts;
        delivery = new DeliverySystem(new RegisterOfClients(listOfClients));
        listOfOrders = new ArrayList<>();
    }

    public void makeOrder(Client aClient, int productCode){
        if(! listOfProducts.containsKey(productCode) ){
            throw new ProductCodeDoesNotExist();
        }
        Package newOrder = new Package(listOfProducts.get(productCode), aClient.getDni(), aClient.getCodigoPostal());
        aClient.addOrder(newOrder);
        listOfOrders.add(newOrder);
    }

    public void makeDeliveryOfOrders(){
        delivery.deliver(listOfOrders);
    }

    public ArrayList<Invoice> getComprobantesOfDelivery(){
        return delivery.getComprobantes();
    }


}
