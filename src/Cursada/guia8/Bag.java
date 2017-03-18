package Cursada.guia8;

import java.util.HashMap;
import java.util.Map;


public class Bag {

    private HashMap<Object, Integer> contenedor;

    public Bag(){
        contenedor = new HashMap<>();
    }

    public void add(Object element) {

        if(contenedor.containsKey(element)){
            contenedor.put(element, contenedor.get(element) + 1);
        }
        else{
            contenedor.put(element, 1);
        }

    }

    //Informa cuantas copias hay del objeto pasado cómo parámetro
    public int count(Object object) {
        if(contenedor.containsKey(object))
            return contenedor.get(object);

        else
            return 0;
    }

    public void remove(Object object){
        if (contenedor.get(object) == 1){
            contenedor.remove(object);
        }
        else {
            contenedor.put(object, contenedor.get(object) - 1);
        }
    }

    //Informa el tamaño total de la colección
    public int size() {
        int size = 0;
        for ( Map.Entry<Object, Integer> element : contenedor.entrySet() ) {
            size += element.getValue();
        }

        return size;
    }

    public boolean isEmpty() {
        if(size() == 0)
            return true;

        return false;
    }
}

