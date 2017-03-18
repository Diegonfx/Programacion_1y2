package rUBERn.logistic;

import rUBERn.users.Client;

import java.util.ArrayList;

/**
 * Created by Usuario on 28/10/2016.
 */
public class ClientRegister {
    private ArrayList<Client> registeredClients;

    public ClientRegister(){
        registeredClients = new ArrayList<>();
    }

    public void addClient(Client aClient){
        registeredClients.add(aClient);
    }

    public Client getClient(int DNI) throws ClientNotFound {

        for (Client aClient : registeredClients ){
            if( aClient.getDNI() == DNI )
                return aClient;
        }
        throw new ClientNotFound();
    }

    public boolean dniAlreadyRegistered(int dni){
        for (Client aClient : registeredClients ){
            if(aClient.getDNI() == dni)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Clientes: \n";
        for ( Client aClient : registeredClients ) {
            result += "DNI: "+ aClient.getDNI() + "  *  " + "NAME: " + aClient.getFullName() + "  *  " + "LOCATION:"
                    + aClient.getLocation() + "  *  " + "STATUS: ";

            if (aClient.isTraveling()) {
                result += "Is Travelling";
            } else {
                result += "Is Available";
            }
            result +=  "\n";
        }
        return result;
    }
}
