package Programacion1COMPLETO.Parcial;

/**
 * Created by DiegoMancini on 15/12/16.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("3.\tImplemente recursivamente el algoritmo para calcular el factorial de un numero entero, el factorial\n" +
                "•\t0!= 1\n" +
                "•\t1!= 1\n" +
                "•\tn!= n*(n-1)!\n");
    }


    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return n = n * factorial(n - 1);
        }
    }

}
