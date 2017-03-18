package Cursada.guia1;

public class BankAccount {

    private int cbu;
    private float cantidadDeDinero = 0;

    public BankAccount(int unCbu){
        cbu = unCbu;
    }

    public void deposit (double amount){
        if(amount > 0){
            cantidadDeDinero += amount;
        }
    }

    public void withdraw (double amount){
        if(amount > 0){
            cantidadDeDinero -= amount;
        }
    }

    public float getBalance(){
        return cantidadDeDinero;
    }

    public int getCBU(){
        return cbu;
    }

    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof BankAccount)) // El objeto no es del el mismo o child class
            return false;

        BankAccount aBankAccount = (BankAccount)o;

        return this.cbu == aBankAccount.cbu && this.cantidadDeDinero == aBankAccount.cantidadDeDinero;
    }

}
