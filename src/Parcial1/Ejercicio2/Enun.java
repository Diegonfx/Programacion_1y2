package Parcial1.Ejercicio2;

/**
 * Created by DiegoMancini on 24/11/16.
 */
public class Enun {

    public static void main(String[] args) {
        System.out.println("a) Se desea implementar un objeto Table, la cual es una tabla que puede tener un objeto asociado a una clave doble.\n No debe obligar a tener un valor para cada fila o columna. Las claves son String, y el valor un object. Los métodos a implementar deben ser los siguientes:\n" +
                "\n" +
                "●\tput (keyDimensionA, keyDimensionB, value)  \t-- agrega un elemento a la tabla, asociado a las claves\n" +
                "●\tget(keyDimensionA, keyDimensionB) \t   \t-- devuelve el objeto asociado a dichas claves\n" +
                "●\tsize\t\t  \t-- informa la cantidad total de valores guardados\n" +
                "●\tremove(keyDimensionA, keyDimensionB) \t-- borra de la table el valor asociado a las claves, sino lo encuentra, no hace nada\n" +
                "●\tremoveFromDimensionA(key)\t\t-- borra todos los elementos asociados a la clave key en la dimensión A\n" +
                "●\tremoveFromDimensionB(key)\t\t-- borra todos los elementos asociados a la clave key en la dimensión B \n" +
                "●\tkeysA\t\t\t-- devuelve todas las claves A\n" +
                "●\tkeysB\t\t\t-- devuelve todas las claves B\n" +
                "●\tvalues\t\t\t-- devuelve todos los valores\n");
    }

}
