package Cursada.entradaUniversidad;


/**
 * Created by agustin on 30/9/16.
 */
public class Molinete {
    private SistemaDeSeguridad sistemaDeSeguridad;

    public Molinete(SistemaDeSeguridad unSistemDeSeguridad) {
        sistemaDeSeguridad = unSistemDeSeguridad;
    }

    public boolean validarTarjeta(Tarjeta unaTarjeta){

        return sistemaDeSeguridad.validarEntrada(unaTarjeta);

    }
}
