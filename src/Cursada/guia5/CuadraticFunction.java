package Cursada.guia5;

import guia1.Polinomio;

/**
 * Created by agustin on 28/9/16.
 */
public class CuadraticFunction implements Function{
    public Polinomio cuadraticFunction;

    public CuadraticFunction(double a, double b, double c){
        cuadraticFunction = new Polinomio(2);
        cuadraticFunction.setCoef(0,c);
        cuadraticFunction.setCoef(1, b);
        cuadraticFunction.setCoef(2,a);
    }


    @Override
    public double evaluate(double value) {

        return cuadraticFunction.evaluar(value);
    }
}
