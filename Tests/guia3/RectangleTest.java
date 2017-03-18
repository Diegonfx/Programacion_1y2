package guia3;

import org.junit.Test;

public class RectangleTest {
    @Test
    public void testArea(){
        Rectangle unRectangulo = new Rectangle(4,6);
        assertEquals(24, unRectangulo.area(), 0.01);
    }

    @Test
    public void testPerimetro(){
        Rectangle unRectangulo = new Rectangle(4,6);
        assertEquals(20, unRectangulo.perimetro(), 0.01);

    }

    @Test
    public void getDiagonal() throws Exception {
        Rectangle unRectangulo = new Rectangle(4,6);
        assertEquals(Math.sqrt(52), unRectangulo.getDiagonal(), 0.01);
    }

}