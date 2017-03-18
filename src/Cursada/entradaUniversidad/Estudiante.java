package Cursada.entradaUniversidad;

import java.util.ArrayList;

/**
 * Created by agustin on 30/9/16.
 */
public class Estudiante extends Persona {

    private ArrayList<String> materiasQueCursa;

    public Estudiante(ArrayList<String> unasMateriasQueCursa){
        super("Estudiante");
        materiasQueCursa = unasMateriasQueCursa;
    }

    public ArrayList<String> getMateriasQueCursa() {
        return materiasQueCursa;
    }
}
