package guia1;

import org.junit.Test;

public class Point2Dtest {

    @Test
    public void evaluatesGetDistace(){
        Point2D puntoA = new Point2D(1,1);
        Point2D puntoB = new Point2D(2,2);
        assertEquals(1.41, puntoA.getDistance(puntoB),0.1);

    }

    @Test
    public void evaluatesAdd(){
        Point2D puntoA = new Point2D(1,1);
        Point2D puntoB = new Point2D(2,4);
        Point2D puntoC = puntoA.add(puntoB);
        assertEquals(3, puntoC.getX());
        assertEquals(5, puntoC.getY());
    }

    @Test
    public void evaluatesEquals(){
        Point2D puntoA = new Point2D(2,4);
        Point2D puntoB = new Point2D(2,4);
        assert puntoA.equals(puntoB);
    }



}
