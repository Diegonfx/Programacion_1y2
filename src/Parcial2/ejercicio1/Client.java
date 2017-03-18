package Parcial2.ejercicio1;

import java.util.ArrayList;

/**
 * Created by agustin on 11/11/16.
 */
public class Client {
    private int dni;
    private int codigoPostal;
    private ArrayList<Package> listaDePedidos;

    public Client(int dni, int codigoPostal) {
        this.dni = dni;
        this.codigoPostal = codigoPostal;
        listaDePedidos = new ArrayList<>();
    }

    public int getDni() {
        return dni;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void addOrder(Package aOrder){
        listaDePedidos.add(aOrder);
    }

    public boolean verificarPedido(Package aOrder){

        if(listaDePedidos.contains(aOrder) ){
            listaDePedidos.remove(aOrder);
            return true;
        }
        return false;
    }

}
