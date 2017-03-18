package Cursada.guia3;


public class Boolean {

    private boolean value;

    public Boolean(boolean aValue){
        value = aValue;
    }

    public boolean and(Boolean aValue){
        return (value && aValue.value);
    }

    public boolean or(Boolean aValue){
        return (value || aValue.value);
    }

    public void not(){
        value = !value;
    }

    public boolean getValue(){
        return value;
    }


}
