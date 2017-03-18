package table;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by agustin on 30/9/16.
 */
public class TableTest {

    @Test
    public void sizeOfTable(){

        Table aTable = new Table();

        aTable.put("Coca", "1.5lts", 34);
        aTable.put("Coca", "2.25lts", 41);

        assertEquals(2, aTable.size());

        aTable.put("Cepita", "600ml", 22);

        assertEquals(3, aTable.size());
    }

    @Test
    public void removeASpecificValue(){
        Table aTable = new Table();

        aTable.put("Coca", "1.5lts", 34);
        aTable.put("Coca", "2.25lts", 41);

        aTable.remove("Coca","1.5lts");

        assertEquals(1, aTable.size());
    }

    @Test
    public void revomeKeyA(){
        Table aTable = new Table();

        aTable.put("Coca", "1.5lts", 34);
        aTable.put("Coca", "2.25lts", 41);

        aTable.removeFromDimensionA("Coca");

        assertEquals(0, aTable.size());
    }

    @Test
    public void revomeKeyB(){
        Table aTable = new Table();

        aTable.put("Coca", "1.5lts", 34);
        aTable.put("Coca", "2.25lts", 41);

        aTable.removeFromDimensionB("1.5lts");

        assertEquals(1, aTable.size());
    }

    @Test
    public void obtainKeysA(){
        Table aTable = new Table();

        aTable.put("Coca", "1.5lts", 34);
        aTable.put("Cepita", "600ml", 22);

        ArrayList<String> keysA = aTable.keysA();

        assertEquals(2, keysA.size());
        assertEquals("Cepita", keysA.get(0));
    }

    @Test
    public void obtainKeysB(){
        Table aTable = new Table();

        aTable.put("Coca", "1.5lts", 34);
        aTable.put("Coca", "600ml", 19);
        aTable.put("Ceptia","500ml", 15);

        ArrayList<String> keysB = aTable.keysB();

        assertEquals(3, keysB.size());
        assertEquals("500ml", keysB.get(0));
    }





}