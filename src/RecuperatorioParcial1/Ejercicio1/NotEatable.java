package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class NotEatable implements StateOfGhost {

    @Override
    public void goEatable(Ghost ghost) {
        ghost.setStateOfGhost(new Eatable());
    }

    @Override
    public void goNotEatable(Ghost ghost) {
        throw new RuntimeException("ALREADY THAT") ;
    }

    @Override
    public boolean isEatable() {
        return false;
    }

}
