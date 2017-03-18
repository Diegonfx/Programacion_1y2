package Cursada.guia1;

public class Circle {

    private double radius;
    private Point2D center;

    public Circle(Point2D center, double radius){
        this.radius = radius;
        this.center = center;
    }

    public Point2D center() {
        return center;
    }

    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    public boolean contains(Point2D punto) {
        if(center.getDistance(punto) <= radius){
            return true;
        }
        else{ return false; }
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Guia 2
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof Circle)) // El objeto no es del el mismo o child class
            return false;

        Circle aCircle = (Circle)o;

        return this.radius == aCircle.radius && this.center.equals(aCircle.center);
    }
}
