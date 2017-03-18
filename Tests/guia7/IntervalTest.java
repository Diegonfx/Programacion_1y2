package guia7;

import org.junit.Test;


public class IntervalTest {

    @Test
    public void testIterator(){
        Interval intervalo = new Interval(2,6);

        for (Integer numero : intervalo ) {
            System.out.println(numero);

        }

    }

    @Test
    public void evaluatesFirst(){
        Interval intervalo = new Interval(2,6);
        assertEquals(2, intervalo.first());
    }

    @Test
    public void evaluatesLast(){
        Interval intervalo = new Interval(2,9);
        assertEquals(8, intervalo.last());
    }

    @Test
    public void evaluatesAt(){
        Interval intervalo = new Interval(5,15);
        assertEquals(5, intervalo.at(0));
    }

    @Test
    public void evaluatesSize(){
        Interval intervalo = new Interval(1,8);
        assertEquals(7, intervalo.size());
    }

}