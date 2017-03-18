package Cursada.guia1;

public class Interval {

    private int first;
    private int last;

    public Interval(int inclusive, int exclusive){
        first = inclusive;
        last = exclusive - 1;
    }

    public int first(){
        return first;
    }

    public int last(){
        return last;
    }

    public int at(int posicion){
        if(posicion > size()){
            return 0;
        }
        return first + (posicion - 1);
    }

    public int size(){
        return last - first + 1;
    }

    /**
     * Ejercicio guia 2
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof Interval)) // El objeto no es del el mismo o child class
            return false;

        Interval aInterval = (Interval) o;

        return this.first == aInterval.first &&
                this.last == aInterval.last;
    }

}
