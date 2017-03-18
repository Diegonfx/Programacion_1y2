package Programacion1COMPLETO.Parcial;

/**
 * Created by DiegoMancini on 13/12/16.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("2.\tHacer el método reverse que invierta el arreglo de Strings que se le pasa.\n" +
                "•\tDefinición del método public static void reverse (String[] string)\n");
    }

    public void reverse(String[] array) {

        for (int i = 0 ; i < array.length ; i++) {
            for (int j = array.length -1 ; j > 0 ; j--) {
                while (i <= array.length /2) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }



}
