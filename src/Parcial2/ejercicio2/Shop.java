package Parcial2.ejercicio2;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import ejercicio1.*;

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

    public void sortOrders(){
        for(int i = listOfOrders.size()-1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(listOfOrders.get(j).compareTo(listOfOrders.get(j+1))  < 0) {
                    Package temp = listOfOrders.get(j);
                    listOfOrders.set(j, listOfOrders.get(j + 1));
                    listOfOrders.set(j + 1, temp);
                }
            }
        }
    }

    public void sortOrders(Comparator<Package> unCriterio){
        for(int i = listOfOrders.size()-1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(unCriterio.compare(listOfOrders.get(j), listOfOrders.get(j+1))  < 0) {
                    Package temp = listOfOrders.get(j);
                    listOfOrders.set(j, listOfOrders.get(j + 1));
                    listOfOrders.set(j + 1, temp);
                }
            }
        }
    }

    public void makeDeliveryOfOrders(){
        delivery.deliver(listOfOrders);
    }

    public ArrayList<Invoice> getComprobantesOfDelivery(){
        return delivery.getComprobantes();
    }


}
