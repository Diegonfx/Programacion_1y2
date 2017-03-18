package Programacion1COMPLETO.Parcial;

/**
 * Created by DiegoMancini on 13/12/16.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("1.\tHacer el metodo palindrome que devuleve un boolean indicando si el arreglo de String \n" +
                "que recibe como argumento contiene los mismos elementos de adelante para atras que de atras para adelante. ejemplo:\n" +
                "\n" +
                "\tpublic static void main(String [] args){\n" +
                "\t\tSystem.out.println (palindrome(new String[] {\"a\",\"b\",\"b\",\"a\"})); //true\n" +
                "\t\tSystem.out.println (palindrome(new String[] {\"a\",\"b\",\"c\",\"d\"})); //false\n" +
                "\t\tSystem.out.println (palindrome(new String[] {\"a\",\"b\",\"c\",\"b\",\"a\"})); //true\n" +
                "\t}\n");
    }

    public boolean palindrome(String[] array) {

        for (int i = 0 ; i < array.length ; i++) {
            for (int j = array.length-1 ; j > 0 ; j--) {
                if (array[i].equals(array[j])) {
                    return true;
                }
            }
         } return false;
    }

}
