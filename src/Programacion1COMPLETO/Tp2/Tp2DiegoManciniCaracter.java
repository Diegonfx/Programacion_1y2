package Programacion1COMPLETO.Tp2;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 8/6/16.
 */
public class Tp2DiegoManciniCaracter {
    public static void main(String[] args) {
        char caracter = Scanner.getChar("Dame un caracter: ");
        int caracterCode = (int) caracter;
        System.out.println("Caracter dado: " + caracter);
        System.out.println("Codigo del caracter = " + caracterCode);
    }
}
