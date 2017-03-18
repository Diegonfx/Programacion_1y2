package Cursada.guia4;

public class TarjetaJubilado extends Tarjeta{

    public TarjetaJubilado(double saldoInicial){

        super(saldoInicial);
    }

    @Override
    public void gastar(double unaCantidad) {
        super.gastar(unaCantidad * 0.8); // gasta con un 20%
    }
}
