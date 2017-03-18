package Cursada.guia5.Numbers;

public class MultiploDeCuatro implements TieneCondicion{
    public boolean condicion(int unNumero){
        if( (unNumero%4) == 0)
            return true;

        return false;
    }
}
