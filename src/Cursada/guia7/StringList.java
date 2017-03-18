package Cursada.guia7;

import java.util.Iterator;

public class StringList implements Iterable<String>{
    private String[] items;
    private int size = 0;

    public Iterator<String> iterator() {

        return new StringListIterator(this);
    }

    public StringList() {
        items = new String[10];
    }

    public void add(String item) {
        // Si array no tiene tamaño suficiente
        if(size == items.length){
            String[] temp = new String[size*2];
            for(int i = 0; i < items.length; i++){
                temp[i] = items[i];
            }
            items = temp;
        }
        items[size] = item;
        size++;
    }

    public String getValue(int index){
        return items[index];
    }


    public int indexOf(String item) {
        for (int i = 0; i < items.length; i++){
            if (item.equals(items[i])){
                return i;
            }
        }
        return -1;
    }

    public void remove(int index) {
        items[index] = null;
        for(int i = index;(i + 1) < size; i++){
            items[i] = items[i + 1];
            items[i + 1] = null;
        }
        size--;
    }

    public String toString() {
        String result = "[";
        for(int i = 0; i < size; i++){
            if((i+1) == size)
                result += "'" + items[i] + "'";
            else
                result += "'" + items[i] + "', ";
        }
        return result + "]";
    }

    public String shortest(){
        String shortest = items[0];
        for(int i =0; i<size; i++){
            if(items[i].length() < shortest.length()){
                shortest = items[i];
            }
        }
        return shortest;
    }

    public String longest(){
        String longest = items[0];
        for(int i =0; i<size; i++){
            if(items[i].length() > longest.length()){
                longest = items[i];
            }
        }
        return longest;
    }

    public int size() {
        return size;
    }


}
