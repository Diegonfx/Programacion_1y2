package guia2;


import org.junit.Test;

public class TriangleTest {
    @Test
    public void evaluateInvalidTriangle(){
        try{
            Triangle invalidTri = new Triangle(2,3,1);
            assert false;
        }
        catch (Exception e){
            assert true;
        }
    }

    @Test
    public void evaluatesPerimeter(){
        Triangle triangulo = new Triangle(2,4,3);
        assertEquals(9, triangulo.perimeter());
    }

    @Test
    public void evaluatesArea(){
        Triangle triangulo = new Triangle(4,5,3);
        assertEquals(6, triangulo.area(), 0.1);
    }

    @Test
    public void evaluatesIsEquilateral(){
        Triangle triangulo = new Triangle(4,4,4);
        assert(triangulo.isEquilateral());
    }

    @Test
    public void evaluatesIsIsoceles(){
        Triangle triangulo = new Triangle(4,4,7);
        assert(triangulo.isIsoceles());
    }

    @Test
    public void evaluatesIsScalane(){
        Triangle triangulo = new Triangle(2,4,5);
        assert(triangulo.isScalane());
    }

}
