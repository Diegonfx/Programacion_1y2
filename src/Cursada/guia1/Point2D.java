package Cursada.guia1;

public class Point2D {

    private int ejeX;
    private int ejeY;

    public Point2D(int x, int y){
        ejeX = x;
        ejeY = y;
    }

    public double getDistance(Point2D punto) {
        return Math.sqrt(Math.pow(ejeX - punto.getX(),2)
                        + Math.pow(ejeY - punto.getY(),2) );
    }

    public Point2D add(Point2D punto) {
        int x = ejeX + punto.getX();
        int y = ejeY + punto.getY();
        return new Point2D(x,y);
    }

    public int getX(){
        return ejeX;
    }
    public int getY(){
        return ejeY;
    }

    /**
     * Ejercicio de la guia 2
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof Point2D)) // El objeto no es del el mismo o child class
            return false;

        Point2D aPoint = (Point2D)o;

        return this.ejeX == aPoint.ejeX && this.ejeY == aPoint.ejeY;
    }
}
