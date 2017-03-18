package Parcial1.entradaUniversidad;

import java.util.ArrayList;

/**
 * Created by agustin on 30/9/16.
 */
public class SistemaDeSeguridad {

    private ArrayList<String> accesoPermanente;
    private ArrayList<String> materiasQueSeEstanCursando;

    public SistemaDeSeguridad(ArrayList<String> accesoPermanente, ArrayList<String> materiasQueSeEstanCursando) {
        this.accesoPermanente = accesoPermanente;
        this.materiasQueSeEstanCursando = materiasQueSeEstanCursando;
    }

    public boolean validarEntrada(Tarjeta unaTarjeta){
        Persona dueñoDeTarejeta = unaTarjeta.getPersona();

        if(dueñoDeTarejeta.getType().equals("Estudiante")){
            Estudiante unEstudiante = (Estudiante)unaTarjeta.getPersona();
            ArrayList<String> materiasEnCurso = getMateriasQueSeEstanCursando();


            for (String materia : materiasEnCurso){
                if(unEstudiante.getMateriasQueCursa().contains(materia)){
                    return true;
                }
            }
            return false;
        }

        else{
            for(String personalQueTieneAcceso : getAccesoPermanente()){
                if(personalQueTieneAcceso.equals(dueñoDeTarejeta.getType())){
                    return true;
                }
            }
            return false;
        }
    }

    public ArrayList<String> getAccesoPermanente() {
        return accesoPermanente;
    }

    public ArrayList<String> getMateriasQueSeEstanCursando() {
        return materiasQueSeEstanCursando;
    }
}
