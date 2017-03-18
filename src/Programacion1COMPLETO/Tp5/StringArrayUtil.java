package Programacion1COMPLETO.Tp5;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 9/6/16.
 */
public class StringArrayUtil {

    public static void print(String[] array) {
        print(array, 0);
    }

    private static void print(String[] array, int i) {
        if (i < array.length) {
            if (array[i] != null) {
                System.out.println(array[i] + '\t' + i);
            }
        } print(array , ++i);
    }

    public static int indexOf (String[] array, String primero, int indiceDado) {
        if (indiceDado < array.length) {
            if (primero.equals(array[indiceDado])) {
                return indiceDado;
            } return indexOf(array, primero, ++indiceDado);
        } return -1;
    }

    public static int indexOf(String[] array, String primero) {
        return indexOf(array, primero, 0);
    }

    private static int indexOfEmpty(String[] array, int i) {
        if(i < array.length) {
            if(array[i] == null) {
                return i;
            } return indexOfEmpty(array, ++i);
        } return -1;
    }

    public static int indexofEmpty(String[] array) {
        return indexOfEmpty(array, 0);
    }

    static int put(String toSave, String[] array) {
        int empty = indexofEmpty(array);
        if (empty != -1) {
            array[empty] = toSave;
        } return empty;
    }

    public static int remove(String primero, String[] array) {
        return remove(primero, array, 0, 0);
    }

    private static int remove(String primero, String[] array, int i, int removals) {
        if (i < array.length ) {
            if(primero.equals(array[i])) {
                array[i] = null;
                removals++;
            } return remove(primero, array, ++i, removals);
        } return removals;
    }

    public static String[] fillArray(String message, int length) {
        String[] array = new String[length];
        return fillArray(message, length, array, 0);
    }

    private static String[] fillArray(String message, int length, String[] array, int index) {
        if (index < array.length) {
            array[index] = Scanner.getString(message);
            fillArray(message, length, array, ++index);
        } return array;
    }

}

