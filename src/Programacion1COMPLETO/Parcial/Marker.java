package Programacion1COMPLETO.Parcial;

public class Marker {

    boolean state;
    int inkLevel;
    String message;

    public Marker(String message, int inkLevel) {
        this.message = message;
        this.inkLevel = inkLevel;
        state = false;
    }

    public void open() {
        state = true;
    }

    public boolean isOpen() {
        if (state == false) {
            return false;
        } else return true;
    }

    public void write(String message) {
        System.out.println(message);
        inkLevel -= message.length();
    }

    public int getInkLevel() {
        return inkLevel;
    }
}
