package guia1;

import org.junit.Assert;
import org.junit.Test;


public class CircleTest {

    @Test
    public void evaluatesCenter(){
        Point2D centro = new Point2D(1,2);
        Circle circulo = new Circle(centro,2);
        Assert.assertEquals(centro.getX(), circulo.center().getX());
        Assert.assertEquals(centro.getY(), circulo.center().getY());
    }

    @Test
    public void evaluatesArea(){
        Point2D centro = new Point2D(3,1);
        Circle circulo = new Circle(centro, 2); //radio 2
        Assert.assertEquals(12.57, circulo.area(), 0.1);
    }

    @Test
    public void evaluatesContains(){
        Point2D centro = new Point2D(1,1);
        Circle circulo = new Circle(centro, 2);

        Point2D includedPoint = new Point2D(1,2);
        Assert.assertEquals(true, circulo.contains(includedPoint));
    }

    @Test
    public void evaluatesPerimeter(){
        Point2D centro = new Point2D(1,1);
        Circle circulo = new Circle(centro, 3);
        Assert.assertEquals(18.85, circulo.perimeter(),0.1);
    }

    @Test
    public void evaluatesEquals(){
        Point2D centro = new Point2D(1,1);
        Circle circulo1 = new Circle(centro, 3);
        Circle circulo2 = new Circle(centro, 3);
        assert circulo1.equals(circulo2);
    }

}
