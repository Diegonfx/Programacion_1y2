package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Pacman extends MovableItems {

    private int score;
    private int life;
    private int x;
    private int y;


    public Pacman() {
        score = 0;
        life = 3;
    }

    @Override
    int getScore() {
        return 0;
    }

    @Override
    boolean canBeEaten() {
        return false;
    }

    public int getLife() {
        return life;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveRIGHT(Board aBoard) {

    }

    @Override
    public void moveLEFT(Board aBoard) {

    }

    @Override
    public void moveDOWN(Board aBoard) {

    }

    @Override
    public void moveUP(Board aBoard) {

    }
}
