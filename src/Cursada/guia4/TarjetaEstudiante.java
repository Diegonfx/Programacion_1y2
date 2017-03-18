package Cursada.guia4;

public class TarjetaEstudiante extends Tarjeta{
    private int cantidadDeCompras = 0;

    public TarjetaEstudiante(double saldoInicial){
        super(saldoInicial);
    }

    @Override
    public void gastar(double unaCantidad){
        if(cantidadDeCompras < 2)
            super.gastar(unaCantidad * 0.2);

        else
            super.gastar(unaCantidad); // sin descuento por ya tuvo dos operaciones

        cantidadDeCompras++;
    }
}
