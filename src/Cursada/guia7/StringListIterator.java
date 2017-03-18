package Cursada.guia7;

import java.util.Iterator;


public class StringListIterator implements Iterator<String> {
    private StringList stringList;
    private int counter;

    public StringListIterator(StringList aStringList){
        stringList = aStringList;
        counter = 0;
    }

    @Override
    public void remove() {

        stringList.remove(counter);

    }


    @Override
    public boolean hasNext() {
        if( counter >= stringList.size() )
            return false;

        return true;
    }

    @Override
    public String next() {
        counter++;
        return stringList.getValue(counter -1 );

    }
}
