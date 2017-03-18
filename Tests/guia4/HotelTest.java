package guia4;

import guia4.hotel.*;
import org.junit.Test;

import static org.junit.Assert.assertNull;


public class HotelTest {

    @Test
    public void hacerReservaNormal() throws Exception {
        Suite aSuite = new Suite();
        Presidencial aPresi = new Presidencial();
        Estandar aStandard = new Estandar();

        Habitacion[] habitacions = {aPresi,aStandard,aSuite};
        Hotel hotel = new Hotel(habitacions);

        Reserva reserva1 = hotel.hacerReserva(1, "Estandar");

        assert reserva1.getHabitacion().equals(aStandard); // Hacen referencia al mismo objeto
    }

    @Test
    public void hacerReservaDeCuartoReservado(){
        Suite aSuite = new Suite();
        Presidencial aPresi = new Presidencial();
        Estandar aStandard = new Estandar();

        Habitacion[] habitacions = {aPresi,aStandard,aSuite};
        Hotel hotel = new Hotel(habitacions);

        Reserva reserva1 = hotel.hacerReserva(4,"Estandar");
        Reserva reservaError = hotel.hacerReserva(4, "Estandar");

        assertNull(reservaError);
    }

    @Test
    public void reservaDeUnCuartoIgualMismaFecha(){
        Suite aSuite = new Suite();
        Suite aSuite2 = new Suite();
        Estandar aStandard = new Estandar();

        Habitacion[] habitacions = {aStandard,aSuite,aSuite2};
        Hotel hotel = new Hotel(habitacions);

        Reserva reserva1 = hotel.hacerReserva(4,"Suite");
        Reserva reserva2 = hotel.hacerReserva(4,"Suite");

        assert reserva2.getHabitacion().equals(aSuite2);
    }

}