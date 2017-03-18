package RecuperatorioASEGURCAR2ver1.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Vehiculo {

    private int año;
    private double valor;
    private int estado;
    private Contrato unContrato;
    private boolean controlAlDia;

    public Vehiculo(int año, double valor) {
        this.año = año;
        this.valor = valor;
        controlAlDia = false;
        estado = 0;
        unContrato = null;
    }

    public int getAño() {
        return año;
    }

    public double getValor() {
        return valor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Contrato getUnContrato() {
        return unContrato;
    }

    public boolean isControlAlDia() {
        return controlAlDia;
    }

    public void setControlAlDia() {
        controlAlDia = true;
    }

    public void addContract(Contrato anyContract) {
        unContrato = anyContract;
    }

    public void removeContract() {
        unContrato = null;
    }


}
