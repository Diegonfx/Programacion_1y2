package Cursada.table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TableGenerics <K1, K2, V> {

    private HashMap<K1, HashMap<K2, V>> table;

    public TableGenerics (){
        table = new HashMap<>();
    }

    public void put(K1 keyDimensionA, K2 keyDimensionB, V value){
        if (table.containsKey(keyDimensionA)){
            table.get(keyDimensionA).put(keyDimensionB, value);
        }
        else{
            HashMap<K2, V> newHashMap = new HashMap<>();
            newHashMap.put(keyDimensionB, value);
            table.put(keyDimensionA, newHashMap);
        }
    }

    public V get(K1 keyDimensionA, K2 keyDimensionB){
        if(!table.containsKey(keyDimensionA)){
            throw new RuntimeException("Value does not exist");
        }
        else{
            HashMap<K2, V> dimensionB = table.get(keyDimensionA);
            if(!dimensionB.containsKey(keyDimensionB))
                throw new RuntimeException("Value does not exist");

            else
                return dimensionB.get(keyDimensionB);
        }
    }

    public int size(){
        int size = 0;

        for ( Map.Entry<K1, HashMap<K2, V> > element : table.entrySet() ){

            HashMap<K2,V> dimensionB = element.getValue();
            size += dimensionB.size();

        }
        return size;
    }

    public void remove(K1 keyDimensionA, K2 keyDimensionB){
        if (table.containsKey(keyDimensionA)){
            HashMap<K2, V> dimensionB = table.get(keyDimensionA);

            if(dimensionB.containsKey(keyDimensionB)){
                dimensionB.remove(keyDimensionB);
            }
        }

    }

    public void removeFromDimensionA(K1 key){
        if(table.containsKey(key)){
            table.remove(key);
        }

    }

    public void removeFromDimensionB(K2 key){
        for ( Map.Entry<K1, HashMap<K2, V> > element : table.entrySet() ){

            HashMap<K2, V> dimensionB = element.getValue();

            if(dimensionB.containsKey(key)){
                dimensionB.remove(key);
            }

        }
    }

    public ArrayList<K1> keysA(){

        ArrayList<K1> keysA = new ArrayList<>();

        for ( Map.Entry<K1, HashMap<K2, V> > element : table.entrySet() ) {

            keysA.add(element.getKey());
        }

        return keysA;
    }

    public ArrayList<K2> keysB(){

        ArrayList<K2> keysB = new ArrayList<>();

        for ( Map.Entry<K1, HashMap<K2, V> > element : table.entrySet() ) {

            HashMap<K2, V> dimensionB = element.getValue();

            for ( Map.Entry<K2, V> item : dimensionB.entrySet() ){

                keysB.add(item.getKey());
            }

        }

        return keysB;
    }


}

