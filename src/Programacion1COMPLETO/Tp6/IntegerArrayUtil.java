package Programacion1COMPLETO.Tp6;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 15/12/16.
 */
public class IntegerArrayUtil {

    public static void main(String[] args) {
        System.out.println("Hacer un método toString que pasándole un arreglo de ints arme un String de la siguiente forma {5, 3, 8, 1} y lo retorne.\n" +
                "Método sum que dado un arreglo de ints devuelva la suma total de todos sus elementos.\n" +
                "Método avg que dado un arreglo de ints devuelva el promedio de todos sus elementos.\n" +
                "Método max que dado un arreglo de ints devuelva el elemento máximo de todos sus elementos.\n" +
                "Método min que dado un arreglo de ints devuelva el elemento mínimo de todos sus elementos.\n" +
                "Hacer un método fillArray que reciba como argumento un String con un mensaje y un entero (cantidad de ints a ingresar). " +
                "\nEl método debe pedir n ints, crear un arreglo para contenerlos y retornarlo lleno con los ints ingresados por el usuario.\n" +
                "\nEXTRA POINT:\n" +
                "\n" +
                "Método sort que dado un arreglo de ints lo ordene de menor a mayor.");
    }

    public String toString(int[] intArray) {
        String s = "" ;
        for (int i = 0 ; i <= intArray.length ; i++) {
            if (i == intArray.length) {
                s += intArray[i] + " .";
            }
            s += intArray[i] + " , " ;
        } return s;
    }

    public int sum (int[] intArray) {
        int result = 0;
        for (int i = 0 ; i < intArray.length ; i++) {
            result += intArray[i];
        } return result;
    }

    public int avg (int[] intArray) {
        int result = 0;
        int length = intArray.length;
        for (int i = 0 ; i < length ; i++) {
            result += intArray[i];
        } return result/length;
    }

    public int max ( int[] intArray) {

        int max = 0;
        for (int i = 0 ; i < intArray.length ;i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        } return max;
    }

    public int min (int[] intArray) {

        int min = 0;

        for (int i = 0 ; i < intArray.length ; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        } return min;
    }

    public int[] fillArray(String message , int quantity) {
        int[] array = new int[quantity];
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = Scanner.getInt(message + i + " : ");
        } return array;
    }

    public void sort (int[] intArray) {
        int value = 0;
        for (int i = 0 ; i < intArray.length ; i++) {
            value = intArray[i];
            int value2 = intArray[i+1];
            if ((value > value2 ) ) {
                intArray[i] = intArray[i+1];
                intArray[i+1] = intArray[i];
            }
        }
    }

}
