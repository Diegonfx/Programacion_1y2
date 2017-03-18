package rUBERn.logistic;

import org.junit.Test;
import rUBERn.logistic.Point;
import rUBERn.logistic.PointOutOfBounds;

import static org.junit.Assert.*;


public class PointTest {

    @Test(expected = PointOutOfBounds.class)
    public void creatPointOutOfMap(){
        Point aPoint = new Point(0 , 50001);
    }

    @Test
    public void getDistance(){
        Point point1  = new Point(200, 340);
        Point point2 = new Point(1201, 3403);

        assertEquals(3222.4167, point1.getDistance(point2), 0.01);
    }

}