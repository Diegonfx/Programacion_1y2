package guia1;

import org.junit.Test;

public class PolinomioTest {

    @Test
    public void evaluatesSetCoef(){
        Polinomio cuadratica = new Polinomio(2);
        cuadratica.setCoef(0, 2);
        cuadratica.setCoef(1, 3);
        cuadratica.setCoef(2, 1);

        assertEquals(2, cuadratica.getValue(0), 0.1);
        assertEquals(3, cuadratica.getValue(1), 0.1);
        assertEquals(1, cuadratica.getValue(2), 0.1);
    }

    @Test
    public void evaluatesEvaluar(){
        Polinomio cubica = new Polinomio(3);
        cubica.setCoef(0, 2);
        cubica.setCoef(1, 3);
        cubica.setCoef(2, 1);
        cubica.setCoef(3, 3);
        assertEquals(36,cubica.evaluar(2));
    }

    @Test
    public void evaluatesDerivar(){
        Polinomio cuadratica = new Polinomio(2);
        cuadratica.setCoef(0, 2);
        cuadratica.setCoef(1, 3);
        cuadratica.setCoef(2, 1);

        Polinomio cuadraticaDerivada = cuadratica.derivar();

        assertEquals(3, cuadraticaDerivada.getValue(0), 0.1);
        assertEquals(2, cuadraticaDerivada.getValue(1), 0.1);
    }

    @Test
    public void evaluatesEquals(){
        Polinomio cuadratica1 = new Polinomio(2);
        cuadratica1.setCoef(0, 2);
        cuadratica1.setCoef(1, 3);
        cuadratica1.setCoef(2, 1);

        Polinomio cuadratica2 = new Polinomio(2);
        cuadratica2.setCoef(0, 2);
        cuadratica2.setCoef(1, 3);
        cuadratica2.setCoef(2, 1);

        assert cuadratica1.equals(cuadratica2);
    }


}


