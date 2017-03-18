package Programacion1COMPLETO.Parcial;

/**
 * Created by DiegoMancini on 15/12/16.
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("4.\tHacer el método que se llame print que recibiendo un String [][] strings y lo imprima. Ejemplo:\n" +
                "\tString [][] mainString= {{\"1\",\"2\",\"3\"},{\"4\"},{\"5\",\"6\"}};\n" +
                "\tprint (mainString); // muestra lo sig en pantalla\n" +
                "\n" +
                "column = 0:\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "column =1:\n" +
                "4\n" +
                "column=2:\n" +
                "5\n" +
                "6\n");
    }

    public void print(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Column: " + i);
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Spot: " + matrix[i][j]);
            }
        }
    }

}
