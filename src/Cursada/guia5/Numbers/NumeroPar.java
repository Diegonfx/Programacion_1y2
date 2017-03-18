package Cursada.guia5.Numbers;

public class NumeroPar implements TieneCondicion {

    public boolean condicion(int unNumero){
        if( (unNumero%2) == 0)
            return true;

        return false;
    }
}
