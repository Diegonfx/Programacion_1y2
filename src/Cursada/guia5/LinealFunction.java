package Cursada.guia5;

import guia1.Polinomio;

/**
 * Created by agustin on 28/9/16.
 */
public class LinealFunction implements Function{

    public Polinomio linealFunction;

    public LinealFunction(double pendiente, double ordenada){
        linealFunction = new Polinomio(1);
        linealFunction.setCoef(0,ordenada);
        linealFunction.setCoef(1, pendiente);
    }


    @Override
    public double evaluate(double value) {
        return linealFunction.evaluar(value);
    }
}
