package guia4;

import org.junit.Test;


public class TarjetasTest {

    @Test(expected = UnsuficientFundsException.class)
    public void gastandoMasDeLoQueTiene() throws Exception {

        Tarjeta tarjetaNormal = new Tarjeta(100);

        tarjetaNormal.gastar(120);

    }

    @Test
    public void gastandoNormal() throws Exception {
        Tarjeta tarjetaNormal = new Tarjeta(100);

        tarjetaNormal.gastar(60);

        assertEquals(40, tarjetaNormal.getSaldo(), 0.1);
    }

    @Test
    public void gastandoConDescuentoJubilando() throws Exception {
        TarjetaJubilado tarjetaJubilado = new TarjetaJubilado(100);

        tarjetaJubilado.gastar(115);


        assertEquals(8, tarjetaJubilado.getSaldo(), 0.1);
    }

    @Test
    public void gastandoConDescuentoEstudiante() throws Exception {
        TarjetaEstudiante tarjetaEstudiante = new TarjetaEstudiante(400);

        tarjetaEstudiante.gastar(100); //Con descuento, -20
        tarjetaEstudiante.gastar(100); //Con descuento, -20
        tarjetaEstudiante.gastar(100); //Sin descuento, -100
        tarjetaEstudiante.gastar(100); //Sin descuento, -100


        assertEquals(160, tarjetaEstudiante.getSaldo(), 0.1);
    }



}