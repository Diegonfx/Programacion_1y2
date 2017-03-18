package rUBERn.users;

import rUBERn.economicManagment.Card;
import rUBERn.logistic.Point;

public class Client extends Person{
    private boolean isTraveling;
    private Point location;

    public Client(String aFullName, int unDNI, Point initLocation, Card aCreditCard) {
        super(aFullName, unDNI, aCreditCard);
        location = initLocation;
        isTraveling = false;
    }

    public boolean isTraveling() {
        return isTraveling;
    }

    public void startsTravel(){
        isTraveling = true;
    }

    public void finishTravel(){
        isTraveling = false;
    }

    public Point getLocation() {
        return location;
    }

    public void changeLocation(Point newLocation){
        location = newLocation;
    }

}
