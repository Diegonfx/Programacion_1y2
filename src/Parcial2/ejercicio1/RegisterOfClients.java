package Parcial2.ejercicio1;

import java.util.ArrayList;

/**
 * Created by agustin on 11/11/16.
 */
public class RegisterOfClients {

    private ArrayList<Client> clients;

    public RegisterOfClients(ArrayList<Client> listOfClients) {
        clients = listOfClients;
    }

    public ArrayList<Client> getListOfClients(){
        return clients;
    }

}
