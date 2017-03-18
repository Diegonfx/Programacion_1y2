package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Ghost extends MovableItems {

    private StateOfGhost stateOfGhost;

    public Ghost() {
        stateOfGhost = new NotEatable();
    }

    @Override
    int getScore() {
        return 200;
    }

    @Override
    boolean canBeEaten() {
        return false;
    }

    public StateOfGhost getStateOfGhost() {
        return stateOfGhost;
    }

    public void setStateOfGhost(StateOfGhost stateOfGhost) {
        this.stateOfGhost = stateOfGhost;
    }

    @Override
    public void moveUP(Board aBoard) {

    }

    @Override
    public void moveDOWN(Board aBoard) {

    }

    @Override
    public void moveLEFT(Board aBoard) {

    }

    @Override
    public void moveRIGHT(Board aBoard) {

    }
}
