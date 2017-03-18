package Cursada.guia3;


public class Rectangle extends Figure{
    private double base;
    private double altura;

    public Rectangle(double lado1, double lado2){
        if(lado1 <= 0 || lado2 <= 0){
            throw new IllegalArgumentException();
        }
        if(lado1 >= lado2){
            base = lado1;
            altura = lado2;
        }
        else{
            base = lado2;
            altura = lado1;
        }
    }
    @Override
    public double area(){
        return base * altura;
    }

    @Override
    public double perimetro(){
        return (base * 2) + (altura * 2);
    }

    public double getDiagonal(){
        return Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
}
