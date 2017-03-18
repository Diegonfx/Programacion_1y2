package Programacion1COMPLETO.Tp2;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 8/6/16.
 */
public class Tp2DiegoManciniGenerateLeapYear {
    public static void main(String[] args) {
        int year;
        year  = Scanner.getInt("\n Inserte un año a analizar: ");
        boolean leap = isLeapYear(year);
        if(leap) {
            System.out.println("Año bisisesto!");
        } else {
            System.out.println("Año no bisiesto!");
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0 ) || (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
