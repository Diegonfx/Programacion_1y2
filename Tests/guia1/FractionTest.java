package guia1;

import org.junit.Test;

public class FractionTest {

    @Test
    public void evaluatesAdd(){
        Fraction fractionA = new Fraction(3,8);
        Fraction fractionB = new Fraction(1,3);
        Fraction sum = fractionA.add(fractionB);
        assertEquals(17, sum.getNumerador());
        assertEquals(24, sum.getDenominador());

        sum = fractionA.add(2);
        assertEquals(19, sum.getNumerador());
        assertEquals(8, sum.getDenominador());
    }

    @Test
    public void evaluatesSub(){
        Fraction fractionA = new Fraction(3,10);
        Fraction fractionB = new Fraction(4,7);
        Fraction sum = fractionA.sub(fractionB);
        assertEquals(-19, sum.getNumerador());
        assertEquals(70, sum.getDenominador());
    }

    @Test
    public void evaluatesMul(){
        Fraction fractionA = new Fraction(4,17);
        Fraction fractionB = new Fraction(3,2);
        Fraction mul = fractionA.mul(fractionB);

        assertEquals(6, mul.getNumerador());
        assertEquals(17, mul.getDenominador());
    }

    @Test
    public void evaluatesDiv(){
        Fraction fractionA = new Fraction(1,15);
        Fraction fractionB = new Fraction(4,9);
        Fraction mul = fractionA.div(fractionB);

        assertEquals(3, mul.getNumerador());
        assertEquals(20, mul.getDenominador());
    }

    @Test
    public void evaluatesAsFloat(){
        Fraction fractionA = new Fraction(4,17);
        assertEquals(0.235, fractionA.asFloat(), 0.01);
    }

    @Test
    public void evaluatesEquals(){
        Fraction fractionA = new Fraction(4,9);
        Fraction fractionB = new Fraction(4,9);
        assert fractionA.equals(fractionB);
    }



}
