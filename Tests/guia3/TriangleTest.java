package guia3;

import org.junit.Test;

/**
 * Created by agustin on 19/8/16.
 */
public class TriangleTest {
    @Test
    public void evaluatesPerimeter(){
        Triangle triangulo = new Triangle(2,4,3);
        assertEquals(9, triangulo.perimetro(), 0.1);
    }

    @Test
    public void evaluatesArea(){
        Triangle triangulo = new Triangle(4,5,3);
        assertEquals(6, triangulo.area(), 0.1);
    }

}