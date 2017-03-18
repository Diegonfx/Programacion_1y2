package Parcial1.entradaUniversidad;

/**
 * Created by agustin on 30/9/16.
 */
public abstract class Persona {
    private String type;

    public Persona(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
