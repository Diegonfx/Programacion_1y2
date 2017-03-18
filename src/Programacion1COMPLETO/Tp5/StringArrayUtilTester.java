package Programacion1COMPLETO.Tp5;

import Tp1.Scanner;
import Tp4.*;

/**
 * Created by DiegoMancini on 9/6/16.
 */
public class StringArrayUtilTester {
    public static void main(String[] args) {
        String[] array = Tp4.StringArrayUtil.fillArray(5, "Ingrese una palabra: ");

        String a = Scanner.getString("Ingrese la palabra a buscar: ");

        int count = Tp4.StringArrayUtil.remove(array, a);

        if (count == 0) {
            System.out.println("No existe el string");
        } else {
            System.out.println("Existe el string");
            String newString = Scanner.getString("Ingrese otra palabra: ");
            Tp4.StringArrayUtil.put(newString, array);
        }
        Tp4.StringArrayUtil.print(array);
    }
}

