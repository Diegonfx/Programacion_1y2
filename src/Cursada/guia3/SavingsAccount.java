package Cursada.guia3;

public class SavingsAccount extends Account{

    private double cantidadDeDinero = 0;
    private int cantidadDeOperations = 0;


    public SavingsAccount(int unCbu) {
        super(unCbu);
    }

    public void depositCheck(Check check) throws Exception{
        if(cantidadDeOperations > 10)
            cantidadDeDinero -= 5; // se cobra un poco cuando pasa el limite de operaciones gratis

        if (check.isValid()) {
            cantidadDeDinero += check.getValue();
            check.fueUsado();
        } else {
            throw new Exception("check already performed");
        }

        cantidadDeOperations++;
    }

    public void deposit(int amount){
        cantidadDeDinero += amount;
    }

    public void withdraw (int amount) throws Exception{
        if(cantidadDeDinero < amount){
            throw new NoHaySuficientesFondos();
        }

        cantidadDeDinero -= amount;
    }

    public double getBalance() {
        return cantidadDeDinero;
    }
}
