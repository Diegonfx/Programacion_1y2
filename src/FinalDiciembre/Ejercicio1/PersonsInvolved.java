package FinalDiciembre.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class PersonsInvolved {

    private String name;
    private int dni;
    private String positionInTheCase;

    public PersonsInvolved(String name, int dni, String positionInTheCase) {
        this.name = name;
        this.dni = dni;
        this.positionInTheCase = positionInTheCase;
    }

    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    public String getPositionInTheCase() {
        return positionInTheCase;
    }
}
