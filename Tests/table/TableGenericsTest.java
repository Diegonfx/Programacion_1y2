package table;

import org.junit.Test;

/**
 * Created by agustin on 7/10/16.
 */
public class TableGenericsTest {

    @Test
    public void addElement(){

        TableGenerics<String, Integer, Double> tabla = new TableGenerics<>();

        tabla.put("Santander", 40269312, 12000.0);

        assertEquals(1, tabla.size());
    }

}