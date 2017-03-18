package Parcial2.tests.ejercicio3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by agustin on 11/11/16.
 */
public class GuardianTest {

    @Test
    public void testTryingAFilter(){
        Guardian<Integer> unaLista = new Guardian<>();

        unaLista.agregarNuevoElemento(10);

        unaLista.agregarCriterio(new CriterioDeFiltro<Integer>() {
            @Override
            public boolean aplicarCriterio(Integer unElemento) {
                if (unElemento < 5)
                    return false;

                return true;
            }
        });

        unaLista.agregarCriterio(new CriterioDeFiltro<Integer>() {
            @Override
            public boolean aplicarCriterio(Integer unElemento) {
                if (unElemento > 15)
                    return false;

                return true;
            }
        });

        assertFalse( unaLista.puedeSerAgregado(1) );
        assertFalse( unaLista.puedeSerAgregado(20) );
        assertTrue( unaLista.puedeSerAgregado(11) );
    }

}