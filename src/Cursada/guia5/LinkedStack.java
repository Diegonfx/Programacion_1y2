package Cursada.guia5;


public class LinkedStack implements Stack{

    private Node first; // Un pointer al first node en el stack
    private int size = 0;

    private class Node {
        Object item;
        Node next;
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node(); // A Node to contain the new item.
        newNode.item = element;

        if ( first == null ) {
            // The new item is the first (and only) one in the list.
            // Set first to point to it.
            first = newNode;
        }
        else{
            newNode.next = first;
            first = newNode;
            size++;
        }

    }

    @Override
    public Object pop() {
        Object item = first.item;        // save item to return
        first = first.next;            // delete first node
        size--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

}
