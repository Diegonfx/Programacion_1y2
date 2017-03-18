package Cursada.guia4.hotel;

import java.util.ArrayList;

public class Hotel {

    private Habitacion[] habitaciones;
    private ArrayList<Reserva> reservas;

    public Hotel(Habitacion[] unasHabitaciones){
        habitaciones = unasHabitaciones;
        reservas = new ArrayList<>();
    }

    public Reserva hacerReserva(int fecha, String tipoDeHabitacion){

        int indiceDeHabitacion = -1;

        ArrayList<Integer> posiblesHabitaciones = new ArrayList<>();
        boolean hayDeEseTipo = false;
        for(int i = 0; i < habitaciones.length; i++){
            if(habitaciones[i].type() == tipoDeHabitacion){
                posiblesHabitaciones.add(i);
                hayDeEseTipo = true;
            }
        }

        if(!hayDeEseTipo)
            return null; // El hotel no tiene el tipo de habitacion que se busca

        // paso 1

        boolean x1 = true;
        for(int i = 0; i < reservas.size(); i++){
            if(tipoDeHabitacion.equals(reservas.get(i).getHabitacion().type()) &&
                reservas.get(i).getFecha() == fecha){
                x1 = false;

                for(int j = 0; j < posiblesHabitaciones.size(); j++){
                    if(! habitaciones[posiblesHabitaciones.get(j)].equals(reservas.get(i).getHabitacion()))
                        indiceDeHabitacion = posiblesHabitaciones.get(j);
                }
            }
        }

        if(x1)
            indiceDeHabitacion = posiblesHabitaciones.get(0);

        if(indiceDeHabitacion == -1){
            return null;
        }

        Reserva nuevaReserva = new Reserva(fecha, habitaciones[indiceDeHabitacion]);
        reservas.add(nuevaReserva);
        return nuevaReserva;
    }

}
