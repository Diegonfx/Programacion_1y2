package Cursada.guia3;


public class Triangle extends Figure{

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangle(int lado1, int lado2, int lado3){
        if(lado1 + lado2 > lado3 && lado2 + lado3 > lado1
                && lado1 + lado3 > lado2) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.lado3 = lado3;
        }
        else
            throw new IllegalArgumentException();
    }

    @Override
    public double area(){
        double halfPerimeter = perimetro() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - lado1) *
                (halfPerimeter - lado2) * (halfPerimeter - lado3));
    }

    @Override
    public double perimetro(){
        return lado1 +lado2 + lado3;
    }
}
