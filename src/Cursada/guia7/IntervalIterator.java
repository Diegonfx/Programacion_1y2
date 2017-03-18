package Cursada.guia7;

import java.util.Iterator;

public class IntervalIterator implements Iterator<Integer> {

    private Interval interval;
    private int currentPosition;

    IntervalIterator (Interval unIntervalo){
        interval = unIntervalo;
        currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        if(currentPosition < interval.size())
            return true;

        return false;

    }

    @Override
    public Integer next() {
        currentPosition ++;
        return interval.at(currentPosition - 1);
    }

    @Override
    public void remove() {
    }


}
