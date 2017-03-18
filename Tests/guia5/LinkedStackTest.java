package guia5;

import org.junit.Test;

/**
 * Created by agustin on 15/9/16.
 */
public class LinkedStackTest {
    @Test
    public void push() throws Exception {
        LinkedStack unLinkedStack = new LinkedStack();
        unLinkedStack.push("Hola");
        unLinkedStack.push(200);
        assertEquals(200, unLinkedStack.pop());
    }

    @Test
    public void pop() throws Exception {
        LinkedStack unLinkedStack = new LinkedStack();
        unLinkedStack.push("Hola");
        unLinkedStack.pop();
        assert unLinkedStack.isEmpty();
    }

    @Test
    public void isEmpty()  {
        LinkedStack unLinkedStack = new LinkedStack();
        assert unLinkedStack.isEmpty();
    }

}