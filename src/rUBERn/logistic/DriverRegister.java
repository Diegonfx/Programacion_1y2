package rUBERn.logistic;
import rUBERn.users.Driver;

import java.util.ArrayList;

public class DriverRegister {

    private ArrayList<Driver> registeredDrivers;


    public DriverRegister(){
        registeredDrivers = new ArrayList<>();
    }

    public void addDriver(Driver aDriver){
        registeredDrivers.add(aDriver);
    }


    public ArrayList<Driver> getAvailableDrivers(){
        ArrayList<Driver> availableDrivers = new ArrayList<>();

        for (Driver aDriver : registeredDrivers){
            if( aDriver.isOnline() && !aDriver.isTravelling())
                availableDrivers.add(aDriver);
        }
        return availableDrivers;
    }

    public Driver getDriver(int DNI) throws DriverNotFound {

        for (Driver aDriver : registeredDrivers ){
            if( aDriver.getDNI() == DNI )
                return aDriver;
        }
        throw new DriverNotFound();
    }

    public boolean dniAlreadyRegistered(int dni){
        for (Driver aDriver : registeredDrivers ){
            if(aDriver.getDNI() == dni)
                return true;
        }
        return false;
    }

    @Override
    public String toString() {

        String result = "Choferes: \n";
        for (Driver aDriver : registeredDrivers) {

            result += "DNI: " + aDriver.getDNI() + "  *  " + "NAME: " + aDriver.getFullName() + "  *  "+ "LOCATION:"
                    + aDriver.getLocation() + "  *  " + "CAR TYPE: " +
                    aDriver.getCar()+ "  *  " + "STATUS: " + "Is " + aDriver.getState() + " \n";
        }
        return result;
    }

}
