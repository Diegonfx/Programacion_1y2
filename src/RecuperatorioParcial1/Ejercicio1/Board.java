package RecuperatorioParcial1.Ejercicio1;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Board {

    private int x;
    private int y;
    private ArrayList<ArrayList<Slot>> table;

    public Board(int x, int y) {
        this.x = x;
        this.y = y;
        table = new ArrayList<>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<ArrayList<Slot>> getTable() {
        return table;
    }


}
