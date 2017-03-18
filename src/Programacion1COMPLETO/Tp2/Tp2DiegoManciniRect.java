package Programacion1COMPLETO.Tp2;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 8/6/16.
 */
public class Tp2DiegoManciniRect {
    public static void main(String[] args) {
        double a = Scanner.getDouble("Ingrese el coeficiente de 'a' : ");
        double b = Scanner.getDouble("Ingrese el coeficiente de 'b' : ");
        double x1 = Scanner.getDouble("Ingrese la coordenada x1 : ");
        double x2 = Scanner.getDouble("Ingrese la coordenada x2 : ");

        double y1 = calculateY(a,b,x1);
        double y2 = calculateY(a,b,x2);

        System.out.println("Para la siguiente ecuacion: ");
        System.out.println("Y = " + a + "x +" +b);
        System.out.println();
        System.out.println("Dados los siguientes puntos: ");
        System.out.println("P1: (" + x1 + ", " + y1 + ")");
        System.out.println("P2: (" + x2 + ", " + y2 + ")");
        System.out.println("Distancia entre los puntos es: " + distance(x1, y1, x2, y2));
        System.out.println();
    }

    public static double calculateY(double a, double b, double x) {
        double y = a+x+b;
        return y;
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return distance;
    }
}
