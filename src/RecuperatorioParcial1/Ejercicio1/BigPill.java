package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class BigPill extends Item {

    @Override
    int getScore() {
        return 100;
    }

    @Override
    boolean canBeEaten() {
        return true;
    }
}
