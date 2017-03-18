package guia5;

import org.junit.Test;


public class ArrayStackTest {
    @Test
    public void testPush(){
        ArrayStack unArrayStack = new ArrayStack();
        unArrayStack.push(20);
        unArrayStack.push("Hola");
        unArrayStack.push(30);

        assertEquals(20, unArrayStack.get(0));
        assert unArrayStack.get(1).equals("Hola");

    }

    @Test
    public void pop() throws Exception {
        ArrayStack unArrayStack = new ArrayStack();
        unArrayStack.push("Hola");
        unArrayStack.pop();
        assert unArrayStack.isEmpty();
    }

    @Test
    public void isEmpty() throws Exception {
        ArrayStack unArrayStack = new ArrayStack();
        assert unArrayStack.isEmpty();
    }

}