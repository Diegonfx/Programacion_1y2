package Cursada.guia5;

public class ArrayStack implements Stack {

    private Object[] array;
    int counter = 0;

    public ArrayStack(){
        array = new Object[10]; // Size inicial de 10
    }

    public Object get(int index){
        return array[index];
    }

    @Override
    public void push(Object element) {
        if(counter == array.length){
            Object[] temp = new Object[counter*2];
            for(int i = 0; i < array.length; i++){
                temp[i] = array[i];
            }
            array = temp;
        }
        array[counter] = element;
        counter++;
    }

    @Override
    public Object pop() {
        Object element = array[counter];
        array[counter] = null;
        counter--;
        return element;
    }

    @Override
    public boolean isEmpty() {
        return counter == 0;
    }
}
