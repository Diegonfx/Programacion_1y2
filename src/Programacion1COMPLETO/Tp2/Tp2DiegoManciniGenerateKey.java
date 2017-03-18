package Programacion1COMPLETO.Tp2;

import Tp1.Scanner;

/**
 * Created by DiegoMancini on 8/6/16.
 */
public class Tp2DiegoManciniGenerateKey {
    public static void main(String[] args) {
        String name = Scanner.getString("Dame un nombre:");
        String surname0 = Scanner.getString("Dame un apellido");
        String surname = surname0.toLowerCase();
        char firstLetter = surname.charAt(0);
        char m = 'm';
        if (firstLetter < m) {
            System.out.println("Su apellido comienza con una letra anterior a la 'm'");
        } else if (firstLetter > m) {
            System.out.println("Su apellido comienza con una letra posterior a la 'm'");
        } else if (firstLetter == m) {
            System.out.println("Su apellido comienza con la letra 'm'");
        }
        String code1 = surname.substring(0,3);
        String code2 = name.substring(((name.length()) - 3),(name.length()));
        System.out.println("Su codigo es: " + code1 + code2);
    }
}
