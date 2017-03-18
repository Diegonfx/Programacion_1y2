package guia3;

import org.junit.Test;


public class CircleTest {

    @Test
    public void EvaluatesPerimetro(){
        Circle unCirculo = new Circle(5);
        assertEquals(31.42, unCirculo.perimetro(), 0.01);

    }

    @Test
    public void EvaluatesArea(){
        Circle unCirculo = new Circle(5);
        assertEquals(78.54, unCirculo.area(), 0.01);
    }

}