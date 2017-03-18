package Programacion1COMPLETO.StringList;

/**
 * Created by DiegoMancini on 15/12/16.
 */
public class StringList {

    private String[] items; // Elementos de la lista, puede tener lugares vacíos al final del array
    private int size = 0; // Cantidad de lugares ocupados con valores distintos de null, empieza en 0

    public StringList() {
        items = new String[10];
    }

    public StringList(int n) {
        items = new String[n];
    }

    public void add(String item) {
        if (size == items.length) {
            String[] temporalArray = new String[items.length * 2];
            for (int i = 0 ; i < temporalArray.length ; i++) {
                temporalArray[i] = items[i];
            } items = temporalArray;
        } items[size] = item;
        size++ ;
    }

    public int indexOf(String item) {

        for (int i = 0 ; i < size ; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        } return -1;
    }

    public void remove(int index) {

        items[index] = null;

        for (int i = 0 ; i < size ;i++) {
            items[index] =items[index+1];
            items[index+1] = null;

        } size-- ;
    }

    public String toString() {

        String s = "" ;

        for (int i = 0 ; i < items.length ; i++) {
            if (i == 0) {
                s += "[ " + "'" + items[i] + "'" + " , ";
            } else if(i == items.length-1) {
                s+= "'" + items[i] + "' ]";
            } s += "'" + items[i] + "' , ";
        } return s;
    }

    public int size() {
        return size;
    }

}
