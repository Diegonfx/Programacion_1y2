package Parcial1.entradaUniversidad;


import java.util.ArrayList;

/**
 * Created by agustin on 30/9/16.
 */

public class Edificio {

    private ArrayList<Molinete> molinetes;

    public Edificio(ArrayList<Molinete> unosMolinetes) {

        molinetes = unosMolinetes;
    }

    public boolean requestAccess(int numeroDeMolinete, Tarjeta unaTarjeta){

        return molinetes.get(numeroDeMolinete).validarTarjeta(unaTarjeta);


    }

}
