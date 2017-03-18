package Cursada.guia3;


public class FigurasMain {

    public static void main(String[] args) {
        Circle circulo = new Circle(4);
        Rectangle rectangulo = new Rectangle(2,5);
        Triangle triangulo = new Triangle(5,5,7);
        Ellipse ellipse = new Ellipse(4,6);

        Figure[] figuras = {circulo, rectangulo, triangulo, ellipse};
        for (int i = 0; i < figuras.length; i++){

            System.out.println("Datos de la figura " + (i + 1));
            System.out.println("Area: " + figuras[i].area());
            System.out.println("Perimetro: " + figuras[i].perimetro());

            if(figuras[i] instanceof Rectangle){
                Rectangle rectangle = (Rectangle) figuras[i];
                System.out.println("Diagonal: " + rectangle.getDiagonal());
            }

            System.out.println();
            System.out.println("   *******");
            System.out.println();
        }
    }
}
