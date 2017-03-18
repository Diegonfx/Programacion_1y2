package guia7;

import org.junit.Test;

import java.util.Iterator;


public class StringListTest {


    @Test
    public void testOfIterator(){
        StringList unaLista = new StringList();

        unaLista.add("Hola");
        unaLista.add("rgerg");
        unaLista.add("Jorge");

        for (String element : unaLista ){
            System.out.println( element );
        }

        System.out.println("----");

        Iterator i = unaLista.iterator();

        System.out.println(i.next());
        i.remove();
        System.out.println(i.next());
    }

}