package Cursada.guia8;

import java.util.HashMap;

public class FibonacciHashMap {

    private HashMap<Integer, Integer> obtainedResults;

    public FibonacciHashMap(){
        obtainedResults = new HashMap<>();
    }

    public int fibonacci(int number){
        if(obtainedResults.containsKey(number)){
            return obtainedResults.get(number);
        }

        if ( number == 0 || number == 1)
            return 1;

        obtainedResults.put(number-1, fibonacci(number -1));
        obtainedResults.put(number-2, fibonacci(number-2));
        return  fibonacci(number - 1) + fibonacci(number-2);
    }

    public HashMap<Integer, Integer> getStoredResults(){
        return obtainedResults;
    }

}
