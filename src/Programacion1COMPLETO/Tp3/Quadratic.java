package Programacion1COMPLETO.Tp3;

/**
 * Created by DiegoMancini on 8/6/16.
 */
public class Quadratic {
    double a;
    double b;
    double c;

    //StringList
    public Quadratic(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    //Metodos

    void setA(double a1) {
        a = a1;
    }

    void setB(double b1) {
        b = b1;
    }

    void setC(double c1) {
        c = c1;
    }

    // Y = A * X^2 + B * X + C ¡!

    double valueY(double x) {
        return (a*(x*x)) + (b*(x)) + c;
    }

    public String toString() {
        return "Y = " + a + "X^2 + " + b + "X + " + c;
    }

    public String derivation() {
        return (2 * a) + " *X + " + b;
    }

    String roots() {
        double determinante = ((b*b) - (4*a*c));
        if (determinante < 0) {
            return "( )";
        } else if (determinante == 0) {
            double raiz = (-b / (2*a));
            return "( " + raiz + " )";
        } else {
            double raiz1 = (-b + Math.sqrt(determinante)) / 2*a ;
            double raiz2 = (-b - Math.sqrt(determinante)) / 2*a ;
            return "( " + raiz1 + ", " + raiz2 + " )";
        }
    }

    public String valueX(double y) {
        double yAndx = ((b*b) - 4 * a * (c-y));
        if ((a == 0) && (b == 0) && (c == 0)) {
            return "X es igual a cero";
        } if (yAndx == 0) {
            double x1 = -b / 2*a;
            return "Unica x, que es: " + x1;
        } else if (yAndx > 0) {
            double x2 = (((-1)*b + Math.sqrt(Math.pow(b,2)-4*a*(c-y)))/(2*a));
            double x3 = (((-1)*b - Math.sqrt(Math.pow(b,2)-4*a*(c-y)))/(2*a));
            return "Los valores de x son: " + x2 + "," +  x3;
        } else {
            return "No hay x reales";
        }
    }

}
