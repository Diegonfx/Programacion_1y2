package rUBERn.users;

import rUBERn.economicManagment.Card;

/**
 * Created by Usuario on 20/10/2016.
 */
public abstract class Person {
    private Card creditCard;
    private int DNI;
    private String fullName;

    public Person(String fullName, int aDNI, Card aCreditCard) {
        creditCard = aCreditCard;
        this.fullName = fullName;
        DNI = aDNI;
    }

    public long getCardNumber() {
        return creditCard.getCardNumber();
    }

    public void recievesPayment(double amount) {
        creditCard.deposit(amount);
    }

    public void makePayment (double amount) {
        creditCard.withdraw(amount);
    }

    public int getDNI() {
        return DNI;
    }

    public String getFullName() {
        return fullName;
    }


}
