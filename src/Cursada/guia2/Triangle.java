package Cursada.guia2;

public class Triangle {

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

    public float area(){
        float halfPerimeter = perimeter() / 2;
        return (float) Math.sqrt(halfPerimeter * (halfPerimeter - lado1) *
                (halfPerimeter - lado2) * (halfPerimeter - lado3));
    }

    public boolean isIsoceles(){
        if(isEquilateral()){
            return false;
        }
        else if (lado1 == lado2 || lado1 == lado3 ||
                lado2 == lado3){
            return true;
        }
        else
            return false;
    }

    public boolean isScalane(){
        if(lado1 != lado2 && lado1 != lado3 &&
                lado2 != lado3)
            return true;
        else
            return false;
    }

    public boolean isEquilateral(){
        if (lado1 == lado2 && lado1 == lado3){
            return true;
        }
        else
            return false;
    }

    public int perimeter(){
        return lado1 +lado2 + lado3;
    }

}
