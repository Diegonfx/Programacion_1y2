package Cursada.guia3;


public class SpecialAccount extends Account{

    private double cantidadDeDinero = 0;
    private int puntos = 0;

    public SpecialAccount(int unCbu){
        super(unCbu);
    }

    public void deposit(int amount){
        cantidadDeDinero += amount;
        puntos++;
    }

    public void withdraw (int amount) throws Exception{
        if(cantidadDeDinero < amount){
            throw new NoHaySuficientesFondos();
        }

        cantidadDeDinero -= amount;

    }

    public void depositCheck(Check check) throws Exception{
        if (check.isValid()) {
            cantidadDeDinero += check.getValue();
            check.fueUsado();
            puntos++;
        } else {
            throw new Exception("check already performed");
        }

    }

    public double getBalance() {
        return cantidadDeDinero;
    }
    public int getPuntos() {
        return puntos;
    }
}
