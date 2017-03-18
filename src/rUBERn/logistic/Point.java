package rUBERn.logistic;


public class Point {

    private int ejeX;
    private int ejeY;

    public Point(int x , int y) throws PointOutOfBounds {
        if ( x > 50000 || x < 0 || y > 50000 || y < 0 )
            throw new PointOutOfBounds();
        else{
            ejeX = x;
            ejeY = y;
        }
    }

    public double getDistance(Point point) {
        double distance = Math.sqrt((Math.pow(ejeX - point.getX() , 2)) + (Math.pow(ejeY - point.getY() , 2)));
        return distance;
    }

    public int getX() {
        return ejeX;
    }

    public int getY() {
        return ejeY;
    }

    public Point add(Point point) {
        int x = ejeX + point.getX();
        int y = ejeY + point.getY();
        return new Point(x, y);
    }

    @Override
    public String toString(){
        return "(" + ejeX + ", " + ejeY + ")";
    }
}
