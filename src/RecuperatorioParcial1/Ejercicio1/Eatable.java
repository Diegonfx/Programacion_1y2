package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Eatable implements StateOfGhost {

    @Override
    public void goEatable(Ghost ghost) {
        throw new RuntimeException("ALREADY THAT");
    }

    @Override
    public void goNotEatable(Ghost ghost) {
        ghost.setStateOfGhost(new NotEatable());
    }

    @Override
    public boolean isEatable() {
        return true;
    }

}
