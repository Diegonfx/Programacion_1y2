package RecuperatorioASEGURCAR2ver1.Ejercicio1;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Cliente {

    private String name;
    private ArrayList<Vehiculo> vehiculos;

    public Cliente(String name, ArrayList<Vehiculo> vehiculos) {
        this.name = name;
        this.vehiculos = vehiculos;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void addVehiculos(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }
}
