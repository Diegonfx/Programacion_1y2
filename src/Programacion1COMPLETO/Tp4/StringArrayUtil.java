package Programacion1COMPLETO.Tp4;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 9/6/16.
 */
public class StringArrayUtil {

    public static void print(String[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] != null ) {
                System.out.println(i + "\t" + array[i]);
            }
        }
    }

    public static int indexOf(String[] array, String primero, int dado) {
        for (int i = dado ; i < array.length ; i++) {
            if (primero.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String[] array, String primero) {
        return indexOf(array, primero, 0);
    }

    public static int indexOfEmpty(String[] array) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == null ) {
                return i;
            }

        }
        return -1;
    }

    public static int put(String array, String[] primero) {
        int index = indexOfEmpty(primero);
        if (index != -1) {
            //guardar primero en array
            primero[index] = array;
        }
        return index;
    }

    public static int remove(String[] array, String toRemove){
        int eliminaciones = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (toRemove.equals(array[i])) {
                array[i] = null;
                eliminaciones++;
            }
        }
        return eliminaciones;
    }

    public static String[] fillArray(int quantityOfStrings, String message) {
        String[] array = new String[quantityOfStrings];
        for (int i = 0; i< array.length; i++) {
            array[i] = Scanner.getString(message);
        }
        return array;
    }
}

