package RecuperatorioASEGURCAR2ver1.Ejercicio1;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Contrato {

    private Cliente unClient;
    private Vehiculo vehiculoAsignado;
    private PolizaDeSeguro unaPoliza;
    private LocalDate initDate;
    private Date finDate;
    private double precioMensual;
    private double precioFinal;
    private AnalizadorDeBeneficios unAnalizador;

    public Contrato(Cliente unClient, Vehiculo vehiculoAsignado, PolizaDeSeguro unaPoliza, Date finDate) {
        this.unClient = unClient;
        this.vehiculoAsignado = vehiculoAsignado;
        this.unaPoliza = unaPoliza;
        initDate = LocalDate.now();
        this.finDate = finDate;
        precioFinal = getPrecioFinal();
        precioMensual = getPrecioMensual();
    }

    public Cliente getUnClient() {
        return unClient;
    }
    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }
    public PolizaDeSeguro getUnaPoliza() {
        return unaPoliza;
    }
    public LocalDate getInitDate() {
        return initDate;
    }
    public Date getFinDate() {
        return finDate;
    }
    public double getPrecioMensual() {
       return precioFinal = vehiculoAsignado.getValor() * getUnaPoliza().getPrice();
    }
    public double getPrecioFinal(){
        return (getFinDate().getYear() - getInitDate().getYear() * 12 * getPrecioMensual());
    }
    public void setPrecioMensual(double precioMensual) {
        this.precioMensual = precioMensual;
    }
    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
