package Cursada.guia3;


public class Check {

    private boolean issued = false;
    private int value;

    public Check(int aValue){
        value = aValue;
    }

    public int getValue() {
        return value;
    }

    public void fueUsado(){
        issued = true;
    }

    public boolean isValid() {
        return !issued;
    }
}
