package Cursada.guia3;


public class CheckingAccount extends Account{

    private double cantidadDeDinero = 0;
    private int valorDescubierto = 0;

    public CheckingAccount(int unCbu, int valorDescubierto) {
        super(unCbu);
        this.valorDescubierto = valorDescubierto;
    }

    public void deposit(int amount){
        cantidadDeDinero += amount;
    }

    public void withdraw (int amount) throws Exception{
        if(cantidadDeDinero + valorDescubierto < amount){
            throw new NoHaySuficientesFondos();
        }

        cantidadDeDinero -= amount;

    }

    public void depositCheck(Check check) throws Exception{
        if (check.isValid()) {
            cantidadDeDinero += check.getValue();
            check.fueUsado();
        } else {
            throw new Exception("check already performed");
        }
    }

    public Check issueCheck(int amount) throws Exception {
        if(cantidadDeDinero + valorDescubierto < amount){
            throw new Exception("Cuenta no tiene suficiente saldo");
        }
        Check ceque = new Check(amount);
        cantidadDeDinero -= amount;
        return ceque;
    }

    public double getBalance() {
        return cantidadDeDinero;
    }



}
