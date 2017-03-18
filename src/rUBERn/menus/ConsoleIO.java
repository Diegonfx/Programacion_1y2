package rUBERn.menus;

import logistic.*;
import rUBERn.logistic.*;
import rUBERn.users.Client;
import rUBERn.users.Driver;

import java.util.ArrayList;

/**
 * Created by agustin on 27/10/16.
 */
public class ConsoleIO {
    private Platform platform;

    public ConsoleIO(Platform aPlatform){
        platform = aPlatform;
    }

    public int askForDni(){
        boolean noEncontroDni = true;
        int dni;
        do {
            dni = Scanner.getInt("Ingrese su DNI: ");
            if (dni >= 42000000) {
                System.out.println("Ingrese un DNI valido por favor!");
            }
            else{
                noEncontroDni = false;
            }
        }while (noEncontroDni);
        return dni;
    }

    private boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }

    public String askForName(){
        boolean noHayNombreValido = true;
        String name;
        do {
            name = Scanner.getString("Ingrese su nombre: ");
            if ((name.length() > 25) || (isNumeric(name))) {
                System.out.println("Ingrese un nombre valido por favor.\n");
            }
            else {
                noHayNombreValido = false;
            }
        }while (noHayNombreValido);
        return name;
    }

    public Client askForClient(){
        boolean clientNotAvailable = true;
        Client aClient = null;
        do{
            try {
                int dniClient = Scanner.getInt("Ingrese el DNI del client que desea viajar: ");
                aClient = platform.getRegisteredClients().getClient(dniClient);
                clientNotAvailable = false;

                if( aClient.isTraveling() ){
                    System.out.println("El cliente deseado esta actualmente viajando.");
                    clientNotAvailable = true;
                }
            }catch (ClientNotFound e){
                System.out.println("No existe un cliente con ese DNI.");
            }
        }while(clientNotAvailable);
        return aClient;
    }

    public void offerTripToDrivers (Client aClient, Point aDestination, int amtOfPassengers){
        try {
            ArrayList<Driver> posibleDrivers = platform.requestDrivers(aClient.getLocation(), amtOfPassengers);
            for (int i = 0; i < posibleDrivers.size(); i++){
                Driver aDriver = posibleDrivers.get(i);
                int response = Scanner.getInt(aDriver.getFullName() + ", te gustaria tomar este viaje? (1 si, 0 no)");
                if(response == 1) {
                    platform.makeTrip(aClient, aDriver, aDestination);
                    break;
                }
                else if(response != 0){
                    System.out.println("Porfavor ingrese un numero valido.");
                    i--;
                }
                else if((i + 1) == posibleDrivers.size() ){ //se recorrio el arreglo entero
                    throw new NoCarAvailable();
                }
            }
        }catch (NoCarAvailable e){
            System.out.println("Ningun auto esta disponible para este viaje.");
        }
    }

    public Point askForCoordenates(){
        boolean pointOutOfBounds = true;
        Point destination = null;
        do{
            try {
                int destinationX1 = Scanner.getInt("Ingrese el valor en x: ");
                int destinationY1 = Scanner.getInt("Ingrese el valor en y: ");
                destination = new Point(destinationX1, destinationY1);
                pointOutOfBounds = false;
            }
            catch (PointOutOfBounds e){
                System.out.println("El destino ingresado no es posible, recuerde que se encuentra en 50,000  x 50,000.");
            }
        }while(pointOutOfBounds);
        return destination;
    }


}
