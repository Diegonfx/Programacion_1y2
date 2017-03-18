package guia1;

import org.junit.Test;

public class IntervalTest {

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
        assertEquals(7, intervalo.at(3));
    }

    @Test
    public void evaluatesSize(){
        Interval intervalo = new Interval(1,8);
        assertEquals(7, intervalo.size());
    }

    @Test
    public void evaluatesEquals(){
        Interval intervalo1 = new Interval(5,15);
        Interval intervalo2 = new Interval(5,15);
        assert intervalo1.equals(intervalo2);

    }


}
