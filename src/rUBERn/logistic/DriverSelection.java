package rUBERn.logistic;


import rUBERn.users.Driver;

import java.util.ArrayList;


public class DriverSelection {

    private int maxLengthToPickup;

    public DriverSelection(int aMaxLengthToPickup){
        maxLengthToPickup = aMaxLengthToPickup;
    }

    public ArrayList<Driver> obtainOrderedListOfDrivers(ArrayList<Driver> availableDrivers, Point clientLocation, int amountOfPassengers) throws NoCarAvailable {
        ArrayList<Driver> validDrivers = new ArrayList<>();

        for (Driver aDriver : availableDrivers) {
            if((aDriver.getCar().getMaxPassengers() >= amountOfPassengers) &&
                    (aDriver.getLocation().getDistance(clientLocation) <= maxLengthToPickup) ) {
                validDrivers.add(aDriver);
            }
        }
        if(validDrivers.isEmpty())
            throw new NoCarAvailable();

        return sortListOfDrivers(validDrivers, clientLocation);
    }

    private ArrayList<Driver> sortListOfDrivers(ArrayList<Driver> posibleDrivers, Point clientLocation) {
        for(int i = posibleDrivers.size()-1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(costValue(posibleDrivers.get(j + 1), clientLocation) <
                        costValue(posibleDrivers.get(j), clientLocation)) {
                    Driver temp = posibleDrivers.get(j);
                    posibleDrivers.set(j, posibleDrivers.get(j + 1));
                    posibleDrivers.set(j + 1, temp);
                }
            }
        }
        return posibleDrivers;
    }

    private double costValue(Driver aDriver, Point clientLocation){
        return aDriver.getLocation().getDistance(clientLocation) *
                aDriver.getCar().getSpeedCoefficient() * aDriver.getCar().qualityCoefficient();
    }

    public void changeMaxLengthToPickup(int maxLengthToPickup) {
        this.maxLengthToPickup = maxLengthToPickup;
    }

}
