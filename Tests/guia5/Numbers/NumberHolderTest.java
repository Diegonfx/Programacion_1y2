package guia5.Numbers;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class NumberHolderTest {

    @Test
    public void TestEsPar(){
        int[] lista = {3,22,5, -2, 5};

        NumberHolder contenedor = new NumberHolder(lista);
        NumeroPar esPar = new NumeroPar();

        ArrayList<Integer> nuevaLista = contenedor.filtrar(esPar);
        assertEquals(22, (int)nuevaLista.get(0));
        assertEquals(-2, (int)nuevaLista.get(1));
    }

    @Test
    public void TestEsMultiploDeCuatro(){
        int[] lista = {3,8,5, -2, 12};

        NumberHolder contenedor = new NumberHolder(lista);
        MultiploDeCuatro esMultiploDeCuatro = new MultiploDeCuatro();

        ArrayList<Integer> nuevaLista = contenedor.filtrar(esMultiploDeCuatro);
        assertEquals(8, (int)nuevaLista.get(0));
        assertEquals(12, (int)nuevaLista.get(1));
    }





}