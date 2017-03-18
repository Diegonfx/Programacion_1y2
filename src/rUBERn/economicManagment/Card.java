package rUBERn.economicManagment;

public class Card {

    private double balance;
    private long cardNumber;

    public Card(long cardNumber) {
        this.cardNumber = cardNumber;
        balance = 0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public long getCardNumber() {
        return cardNumber;
    }

}
