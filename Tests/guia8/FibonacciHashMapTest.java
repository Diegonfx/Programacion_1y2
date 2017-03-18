package guia8;

import org.junit.Test;

public class FibonacciHashMapTest {

    @Test
    public void testFibonacci(){
        FibonacciHashMap elFibo = new FibonacciHashMap();
        assertEquals(55, elFibo.fibonacci(9));
        assertEquals(9, elFibo.getStoredResults().size());

    }
}