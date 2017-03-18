package Parcial1.Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by agustin on 30/9/16.
 */
public class    Table {

    private HashMap<String, HashMap<String, Object> > table;

    public Table(){
        table = new HashMap<>();
    }

    public void put(String keyDimensionA, String keyDimensionB, Object value){
        if (table.containsKey(keyDimensionA)){
            table.get(keyDimensionA).put(keyDimensionB, value);
        }

        else{
            HashMap<String, Object> newHashMap = new HashMap<>();
            newHashMap.put(keyDimensionB, value);
            table.put(keyDimensionA, newHashMap);
        }
    }

    public Object get(String keyDimensionA, String keyDimensionB){
        if(!table.containsKey(keyDimensionA)){
            throw new RuntimeException("Value does not exist");
        }
        else{
            HashMap<String, Object> dimensionB = table.get(keyDimensionA);
            if(!dimensionB.containsKey(keyDimensionB))
                throw new RuntimeException("Value does not exist");

            else
                return dimensionB.get(keyDimensionB);
        }
    }

    public int size(){
        int size = 0;

        for ( Map.Entry<String, HashMap<String, Object> > element : table.entrySet() ){

            HashMap<String,Object> dimensionB = element.getValue();
            size += dimensionB.size();

        }
        return size;
    }

    public void remove(String keyDimensionA, String keyDimensionB){
        if (table.containsKey(keyDimensionA)){
            HashMap<String, Object> dimensionB = table.get(keyDimensionA);

            if(dimensionB.containsKey(keyDimensionB)){
                dimensionB.remove(keyDimensionB);
            }
        }

    }

    public void removeFromDimensionA(String key){
        if(table.containsKey(key)){
            table.remove(key);
        }

    }

    public void removeFromDimensionB(String key){
        for ( Map.Entry<String, HashMap<String, Object> > element : table.entrySet() ){

            HashMap<String,Object> dimensionB = element.getValue();

            if(dimensionB.containsKey(key)){
                dimensionB.remove(key);
            }

        }
    }

    public ArrayList<String> keysA(){

        ArrayList<String> keysA = new ArrayList<>();

        for ( Map.Entry<String, HashMap<String, Object> > element : table.entrySet() ) {

            keysA.add(element.getKey());
        }

        return keysA;
    }

    public ArrayList<String> keysB(){

        ArrayList<String> keysB = new ArrayList<>();

        for ( Map.Entry<String, HashMap<String, Object> > element : table.entrySet() ) {

            HashMap<String,Object> dimensionB = element.getValue();

            for ( Map.Entry<String, Object> item : dimensionB.entrySet() ){

                keysB.add(item.getKey());
            }

        }

        return keysB;
    }


}
