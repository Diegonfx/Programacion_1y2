package guia4;

import org.junit.Test;

/**
 * Created by agustin on 31/8/16.
 */
public class GerenteTest {

    @Test
    public void getSueldoEmpleado(){
        Legajo legajoApu = new Legajo("Agustin Bettati", "Pilar, Buenos Aires", 203020346);
        Empleado apu = new Empleado(9700,legajoApu);
        assertEquals(9700, apu.getSueldo(), 0.1);
    }

    @Test
    public void getSueldoGerente(){
        Legajo legajoApu = new Legajo("Agustin Bettati", "Pilar, Buenos Aires", 203020346);
        Empleado apu = new Empleado(9700, legajoApu);
        Legajo legajoJorge = new Legajo("Jorge Perez", "Buenos Aires", 234312423);
        Empleado jorge = new Empleado(7000, legajoJorge);

        Empleado[] subordinados = {apu, jorge};

        Legajo legajoGerente = new Legajo("Alberto", "Capital Federal", 232349643);
        Gerente unGerente = new Gerente(12000, legajoGerente, subordinados);

        assertEquals(12167, unGerente.getSueldo(), 0.1);
    }

}