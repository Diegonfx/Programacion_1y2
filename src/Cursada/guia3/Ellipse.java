package Cursada.guia3;


public class Ellipse extends Figure{

    private double axisMayor;
    private double axisMenor;

    public Ellipse(double axis1, double axis2){
        if(axis1 >= axis2){
            axisMayor = axis1;
            axisMenor = axis2;
        }
        else{
            axisMayor = axis2;
            axisMenor = axis1;
        }
    }

    /**
     * Es un calculo aprox con un error del 5%
     * @return perimetro
     */
    @Override
    double perimetro() {
        return 2 * Math.PI * Math.sqrt(
                (float)((Math.pow(axisMayor,2) + Math.pow(axisMenor,2))/2)
        );
    }

    @Override
    public double area(){
        return Math.PI * axisMayor * axisMenor;
    }



}
