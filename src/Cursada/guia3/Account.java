package Cursada.guia3;

public abstract class Account {
    private int cbu;

    public Account(int aCbu){
        cbu = aCbu;
    }

    public int getCbu() {
        return cbu;
    }

    public abstract void withdraw (int amount) throws Exception;

    public abstract  void deposit(int amount);

    public abstract void depositCheck(Check check) throws Exception;

    public abstract double getBalance();

}
