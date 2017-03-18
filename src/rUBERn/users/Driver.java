package rUBERn.users;

import rUBERn.cars.Car;
import rUBERn.economicManagment.Card;
import rUBERn.logistic.Point;

public class Driver extends Person{

    private Car driversCar;
    private Point location;
    private StateOfDriver state;

    public Driver (String fullName, int aDNI, Card aCreditCard, Car aCar, Point initLocation) {
        super(fullName, aDNI, aCreditCard);
        state = new Online();
        driversCar = aCar;
        location = initLocation;
    }

    public void moveDriver(Point newLocation){
        location = newLocation;
    }

    public Point getLocation() {
        return location;
    }

    public boolean isOnline() {
        return state.isOnline();
    }

    public boolean isTravelling(){
        return state.isTravelling();
    }

    public void goesOnline() {
        state.goOnline(this);
    }

    public void goesOffline() {
        state.goOffline(this);
    }

    public void startsTravel() {
        state.startsTravel(this);
    }

    public void finishesTravel(){
        state.endsTravel(this);
    }

    public void setState(StateOfDriver nuevoState) {
        state = nuevoState;
    }

    public StateOfDriver getState(){
        return state;
    }

    public Car getCar() {
        return driversCar;
    }

}
