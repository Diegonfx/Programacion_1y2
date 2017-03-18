package Cursada.guia4;


public class Tarjeta {
    private double descubierto  = 10;
    private double saldo = 0;

    public Tarjeta(double saldoInicial){
        saldo = saldoInicial;
    }

    public void cargarTarjeta(double unaCantidad){
        saldo += unaCantidad;
    }

    public void gastar(double unaCantidad){
        if(saldo + descubierto < unaCantidad){
            throw new UnsuficientFundsException();
        }
        saldo -= unaCantidad;
    }

    public void cambiarDescubierto(double nuevoDescubierto){
        descubierto = nuevoDescubierto;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getDescubierto(){
        return descubierto;
    }
}
