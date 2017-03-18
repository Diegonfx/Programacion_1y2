package RecuperatorioASEGURCAR2ver1.Ejercicio1;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class AsegurCar {

    private ArrayList<Cliente> clientsDataBase;
    private ArrayList<PolizaDeSeguro> polizas;
    private ControlSemestral controlSemestral;
    private AnalizadorDeBeneficios analizadorDeBeneficios;
    private AnalizadorDeDeterioro analizadorDeDeterioro;

    public AsegurCar(ArrayList<Cliente> clientsDataBase, ArrayList<PolizaDeSeguro> polizas, ControlSemestral controlSemestral, AnalizadorDeBeneficios analizadorDeBeneficios, AnalizadorDeDeterioro analizadorDeDeterioro) {
        this.clientsDataBase = clientsDataBase;
        this.polizas = polizas;
        this.controlSemestral = controlSemestral;
        this.analizadorDeBeneficios = analizadorDeBeneficios;
        this.analizadorDeDeterioro = analizadorDeDeterioro;
    }

    public ArrayList<Cliente> getClientsDataBase() {
        return clientsDataBase;
    }
    public ArrayList<PolizaDeSeguro> getPolizas() {
        return polizas;
    }
    public ControlSemestral getControlSemestral() {
        return controlSemestral;
    }
    public AnalizadorDeBeneficios getAnalizadorDeBeneficios() {
        return analizadorDeBeneficios;
    }
    public AnalizadorDeDeterioro getAnalizadorDeDeterioro() {
        return analizadorDeDeterioro;
    }

    public String hacerOrden(Cliente unCliente, Vehiculo unVehiculo , PolizaDeSeguro unaPoliza , Date finalDate) {
        String result = "";
        analizadorDeDeterioro.analyzeVehicle(unVehiculo);
        if (polizas.contains(unaPoliza)) {
            Contrato unContrato = new Contrato(unCliente , unVehiculo , unaPoliza , finalDate);
            unVehiculo.addContract(unContrato);
            analizadorDeBeneficios.analizaBeneficios(unContrato);
            double precioFinal = unContrato.getPrecioFinal() - analizadorDeBeneficios.getBeneficios();
            unContrato.setPrecioFinal(precioFinal);
            result += unContrato.getInitDate().toString() + unContrato.getFinDate().toString() + unContrato.getPrecioMensual() + unContrato.getPrecioFinal() +
                    unContrato.getVehiculoAsignado() + unContrato.getUnaPoliza().toString() + unCliente.getName() ;
        } return result;
    }



}
