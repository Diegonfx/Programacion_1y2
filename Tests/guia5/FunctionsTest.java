package guia5;

import org.junit.Test;

/**
 * Created by agustin on 28/9/16.
 */
public class FunctionsTest {
    @Test
    public void evaluateLinealFunction() {
        LinealFunction funcionLineal = new LinealFunction(2, 1);

        assertEquals(11, funcionLineal.evaluate(5),0.1);
    }

    @Test
    public void evaluateCuadraticFunction() {
        CuadraticFunction funcionCuadratica = new CuadraticFunction(2,2,1);

        assertEquals(41, funcionCuadratica.evaluate(4),0.1);
    }

    @Test
    public void evaluateCompoundFunction() {
        LinealFunction funcionF = new LinealFunction(2, 1);
        CuadraticFunction funcionG = new CuadraticFunction(2,2,1);


        CompoundFunction funcionCompuesta = new CompoundFunction(funcionF,funcionG);

        assertEquals(83, funcionCompuesta.evaluate(4),0.1);
    }


}