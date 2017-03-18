package guia3;

import org.junit.Test;

public class EllipseTest {
    @Test
    public void evaluatesPerimetro() {
        Ellipse unEllipse = new Ellipse(3,4);
        assertEquals(22.1, unEllipse.perimetro(), 0.2);  //margen error 5%
    }

    @Test
    public void evaluatesArea(){
        Ellipse unEllipse = new Ellipse(6,9);
        assertEquals(169.65, unEllipse.area(), 0.01);
    }


}