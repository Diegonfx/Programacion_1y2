package rUBERn.logistic;

import rUBERn.cars.CarCatalog;
import rUBERn.economicManagment.Cashier;
import rUBERn.users.Client;
import rUBERn.users.Driver;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Platform {

    private Cashier cashier;
    private DriverRegister registeredDrivers;
    private ClientRegister registeredClients;
    private DriverSelection driverSelection;
    private CarCatalog registeredCars;
    private int maxLengthToPickup = 30000;  //Esto lo define

    public Platform(){
        cashier = new Cashier();
        registeredDrivers = new DriverRegister();
        registeredClients = new ClientRegister();
        registeredCars = new CarCatalog();
        driverSelection = new DriverSelection(maxLengthToPickup);
    }

    public ClientRegister getRegisteredClients(){
        return registeredClients;
    }

    public DriverRegister getRegisteredDrivers(){
        return registeredDrivers;
    }

    public CarCatalog getRegisteredCars(){ return registeredCars; }

    public ArrayList<Driver> requestDrivers (rUBERn.logistic.Point clientLocation, int amountOfPassengers) throws NoCarAvailable {
        ArrayList<Driver> driversDisponibles = registeredDrivers.getAvailableDrivers();
        return driverSelection.obtainOrderedListOfDrivers(driversDisponibles, clientLocation, amountOfPassengers);
    }

    public void makeTrip(Client aClient, Driver aDriver, rUBERn.logistic.Point destination){
        aDriver.startsTravel();
        aClient.startsTravel();
        double distanceToClient = aDriver.getLocation().getDistance(aClient.getLocation());
        double distanceFromClientToDestination = aClient.getLocation().getDistance(destination);
        double totalDurationOfTrip = (distanceToClient + distanceFromClientToDestination) / 5;
        // Timer corre en su propio thread
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
                    @Override
                    public void run() {
                        cashier.makePayment(aDriver, aClient, distanceFromClientToDestination);
                        aDriver.moveDriver(destination);
                        aClient.changeLocation(destination);
                        aDriver.finishesTravel();
                        aClient.finishTravel();
                        setMsg("Termino el viaje de " + aClient.getFullName() );
                    }
                },
                (long)totalDurationOfTrip //milisecond
        );
        System.out.println("El viaje de " + aClient.getFullName() + " fue asignado a "+ aDriver.getFullName() +", y ya esta en proceso" );
    }

    private void setMsg(String text){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane optionPane = new JOptionPane(text,JOptionPane.PLAIN_MESSAGE);
        JDialog dialog = optionPane.createDialog("Finalizacion de un viaje!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }


}
