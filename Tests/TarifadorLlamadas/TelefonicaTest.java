package TarifadorLlamadas;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;


public class TelefonicaTest {

    @Test
    public void sortingTest() throws ParseException {

        Telefonica unaTelefonica = new Telefonica();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha = sdf.parse("22/02/2016");

        unaTelefonica.agregarNuevaLlamada(new NumeroTelefonico(34,343,343452), new NumeroTelefonico(23,4545,232323),fecha,2,234);
        unaTelefonica.agregarNuevaLlamada(new NumeroTelefonico(34,343,343452), new NumeroTelefonico(23,4545,232323),fecha,2,15);
        unaTelefonica.agregarNuevaLlamada(new NumeroTelefonico(34,343,343452), new NumeroTelefonico(23,4545,232323),fecha,2,504);
        unaTelefonica.agregarNuevaLlamada(new NumeroTelefonico(34,343,343452), new NumeroTelefonico(23,4545,232323),fecha,2,402);
        unaTelefonica.agregarNuevaLlamada(new NumeroTelefonico(34,343,343452), new NumeroTelefonico(23,4545,232323),fecha,2,15);

        for (Llamada unaLlamada : unaTelefonica.getLlamadasRealizadas()){
            System.out.println(unaLlamada);
        }

        System.out.println("----------");
        Comparator<Llamada> criterio = new DurationOfTimeComparator();
        for(Llamada unaLlamada : unaTelefonica.sort(criterio)){
            System.out.println(unaLlamada);
        }

    }

}