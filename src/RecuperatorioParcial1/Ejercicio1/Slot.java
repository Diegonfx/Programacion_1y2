package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Slot {

    private Item anItem;

    public Slot() {
        anItem = null;
    }

    public Item getAnItem() {
        return anItem;
    }

    public void addAnItem(Item item) {
        anItem = item;
    }
}
