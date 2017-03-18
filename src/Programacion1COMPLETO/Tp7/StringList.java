package Programacion1COMPLETO.Tp7;

/**
 * Created by DiegoMancini on 9/6/16.
 */
public class StringList {

    private String[] items;
    private int size = 0;

    /** Inicializa items con un máximo de 10 lugares, comienza con sus lugares vacíos */
    public StringList() {
        items = new String[10];
    }

    /** Inicializa items con un máximo de n lugares, comienza con sus lugares vacíos */
    public StringList(int n) {
        items = new String[n];
    }

    /**
     * Agrega un String a la lista, en la primera posición disponible.
     * Si no hay más lugares vacíos al final del arreglo, agranda el arreglo con la siguiente lógica:
     * - Crear un nuevo arreglo del doble de tamaño que el arreglo items original
     * - Copie todos los valores del viejo arreglo de items al nuevo
     * - Asigne el nuevo arreglo a items
     */
    public void add(String item) {
        if (size == items.length) {
            String[] nuevoArray = new String[items.length*2];
            for (int i = 0 ; i < nuevoArray.length ; i++) {
                nuevoArray[i] = items[i];
            }items = nuevoArray;
        } items[size] = item;
        size++;
    }

    /**
     * Busca el elemento en la lista:
     * - Si lo encuentra retorna su posición
     * - De lo contrario retorna -1
     */
    public int indexOf(String item) {

        for (int i = 0 ; i < items.length ; i++) {
            if (!item.equals(items[i])) {
                return i;
            }
        } return -1;
    }

    /**
     * Elimina el String que este en la posición index de la lista:
     * - La lista NO deberá quedar con lugares vacíos en el medio.
     * - Los lugares vacíos deben estar todos al final.
     *
     * Ejemplos teniendo un StringList que contiene estos items ["a", "b", "c", null, null]:
     * - Luego de llamar a remove(2) sobre la lista, queda: ["a", "b", null, null, null]
     * - Luego de llamar a remove(0) sobre la lista, queda: ["b", "c", null, null, null]
     */
    public void remove(int index) {

        items[index] = null;
        for (; index+1 < size ; index++) {
            items[index] = items[index+1];
            items[index+1] = null;
        }
        size--;
    }

    /**
     * Retorna un String de la siguiente forma: ['a', 'b', 'c']
     * NO debe agregar al String los valores vacíos o null.
     *
     * Ejemplo:
     * - Teniendo un StringList con estos items ["a", "b", "c", null, null]
     * - El metodo toString devuelve: ['a', 'b', 'c']
     */
    public String toString() {
        // todo implementar constructor
        return "h";
    }

    /**
     * Retorna la cantidad de elementos que NO son nulos en el arreglo.
     * Solo los que tienen valor.
     *
     * Ejemplo:
     * - Teniendo un StringList con estos items ["a", "b", "c", null, null]
     * - El metodo size devuelve: 3
     */
    public int size() {
        // todo implementar constructor
        return 1;
    }

}
