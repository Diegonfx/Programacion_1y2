package Cursada.guia4.hotel;


public class Reserva {

    private Habitacion habitacion;
    private int fecha;

    public Reserva(int unaFecha, Habitacion unaHabitacion){
        habitacion = unaHabitacion;
        fecha = unaFecha;
    }

    public Habitacion getHabitacion(){
        return habitacion;
    }

    public int getFecha() {
        return fecha;
    }

}
