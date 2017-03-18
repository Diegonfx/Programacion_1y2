package rUBERn.logistic;

/**
 * Created by agustin on 11/10/16.
 */
public class NoCarAvailable extends Exception {

    public NoCarAvailable(){
        super();
    }

    public NoCarAvailable(String msg){
        super(msg);
    }
}
