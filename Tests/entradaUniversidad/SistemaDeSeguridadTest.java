package entradaUniversidad;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by agustin on 30/9/16.
 */
public class SistemaDeSeguridadTest {

    @Test
    public void entradaDeEsutianteConMateriaEnCurso(){

        ArrayList<String> accesoPermanente = new ArrayList<>();

        ArrayList<String> materiasCursadas = new ArrayList<>();
        materiasCursadas.add("Programacion");
        materiasCursadas.add("Analisis");
        materiasCursadas.add("Algebra");

        SistemaDeSeguridad sistemaEdificio1 = new SistemaDeSeguridad(accesoPermanente,materiasCursadas);

        ArrayList<Molinete> molinetes = new ArrayList<>();

        Molinete molinete1 = new Molinete( sistemaEdificio1 );
        Molinete molinete2 = new Molinete( sistemaEdificio1 );
        Molinete molinete3 = new Molinete( sistemaEdificio1 );

        molinetes.add(molinete1);
        molinetes.add(molinete2);
        molinetes.add(molinete3);

        Edificio edificio1 = new Edificio(molinetes);

        ArrayList<String> materiasDePedro = new ArrayList<>();
        materiasDePedro.add("Programacion");

        Persona pedro = new Estudiante(materiasDePedro);

        Tarjeta tarjetaDePedro = new Tarjeta(pedro);

        assertTrue(edificio1.requestAccess(1, tarjetaDePedro));

    }

    @Test
    public void SeNiegaEntradaDeEstudianteDeOtraMateria(){
        ArrayList<String> accesoPermanente = new ArrayList<>();

        ArrayList<String> materiasCursadas = new ArrayList<>();
        materiasCursadas.add("Programacion");
        materiasCursadas.add("Analisis");
        materiasCursadas.add("Algebra");

        SistemaDeSeguridad sistemaEdificio1 = new SistemaDeSeguridad(accesoPermanente,materiasCursadas);

        ArrayList<Molinete> molinetes = new ArrayList<>();

        Molinete molinete1 = new Molinete( sistemaEdificio1 );
        Molinete molinete2 = new Molinete( sistemaEdificio1 );
        Molinete molinete3 = new Molinete( sistemaEdificio1 );

        molinetes.add(molinete1);
        molinetes.add(molinete2);
        molinetes.add(molinete3);

        Edificio edificio1 = new Edificio(molinetes);

        ArrayList<String> materiasDeJorge = new ArrayList<>();
        materiasDeJorge.add("Filosofia");

        Persona jorge = new Estudiante(materiasDeJorge);

        Tarjeta tarjetaDeJorge = new Tarjeta(jorge);

        assertFalse(edificio1.requestAccess(1, tarjetaDeJorge));

    }

    @Test
    public void entradaDeEmpleado(){

        ArrayList<String> accesoPermanente = new ArrayList<>();
        accesoPermanente.add("Docente");
        accesoPermanente.add("Empleado de limpieza");

        ArrayList<String> materiasEnCurso = new ArrayList<>();

        SistemaDeSeguridad sistemaEdificio1 = new SistemaDeSeguridad(accesoPermanente,materiasEnCurso);

        ArrayList<Molinete> molinetes = new ArrayList<>();

        Molinete molinete1 = new Molinete( sistemaEdificio1 );
        Molinete molinete2 = new Molinete( sistemaEdificio1 );
        Molinete molinete3 = new Molinete( sistemaEdificio1 );

        molinetes.add(molinete1);
        molinetes.add(molinete2);
        molinetes.add(molinete3);

        Edificio edificio1 = new Edificio(molinetes);

        Persona ezequiel = new Docente();
        Tarjeta tarjetaDeEzequiel = new Tarjeta(ezequiel);

        assertTrue( edificio1.requestAccess(2, tarjetaDeEzequiel) );

    }



}