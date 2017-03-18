package Parcial2.tests.ejercicio1;

import Parcial2.ejercicio1.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by agustin on 11/11/16.
 */
public class DeliverySystemTest {

    @Test
    public void testOfNormalDelivery(){
        HashMap<Integer, Product> products = new HashMap<>();

        products.put(0232, new Product("Licuadora", 0.4));
        products.put(1234, new Product("Bici", 2.2));
        products.put(1832, new Product("Teclado", 0.1));

        ArrayList<Client> listaDeClientes = new ArrayList<>();

        Client jorge = new Client(40340403, 2342);
        Client pablo = new Client(35403020, 1034);

        listaDeClientes.add(jorge);
        listaDeClientes.add(pablo);

        Shop unaTienda = new Shop(products, listaDeClientes);

        unaTienda.makeOrder(jorge, 0232);
        unaTienda.makeOrder(pablo, 1832);

        unaTienda.makeDeliveryOfOrders();

        ArrayList<Invoice> comprobantes = unaTienda.getComprobantesOfDelivery();

        assertEquals(2, comprobantes.size());

        Invoice unInvoice = comprobantes.get(0);

        assertEquals(40340403, unInvoice.getDniOfClient());
        assertEquals("Licuadora", unInvoice.getNameOfProduct());
    }

    @Test(expected = ProductCodeDoesNotExist.class)
    public void productCodeDoesNotExist(){

        HashMap<Integer, Product> products = new HashMap<>();

        products.put(0232, new Product("Licuadora", 0.4));


        ArrayList<Client> listaDeClientes = new ArrayList<>();

        Client jorge = new Client(40340403, 2342);

        listaDeClientes.add(jorge);

        Shop unaTienda = new Shop(products, listaDeClientes);

        unaTienda.makeOrder(jorge, 1111);
    }

}