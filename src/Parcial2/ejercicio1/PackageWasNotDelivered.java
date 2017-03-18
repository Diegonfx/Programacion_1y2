package Parcial2.ejercicio1;

import java.lang.*;

/**
 * Created by agustin on 11/11/16.
 */
public class PackageWasNotDelivered extends RuntimeException{

    private java.lang.Package order;

    public PackageWasNotDelivered(java.lang.Package aPackage){
        order = aPackage;
    }

    public java.lang.Package getPackage(){
        return order;
    }
}
