package RecuperatorioASEGURCAR2ver1.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class AnalizadorDeBeneficios {

    private double beneficios;

    public AnalizadorDeBeneficios() {
        beneficios = 0;
    }


    public double analizaBeneficios(Contrato unContrato) {

        if (unContrato.getInitDate().getYear() +2 < unContrato.getFinDate().getYear() && unContrato.getVehiculoAsignado().getEstado() < 20) {
            beneficios += unContrato.getPrecioMensual() * 2;
        } for (Vehiculo unVehiculo : unContrato.getUnClient().getVehiculos()) {
            if (unContrato.getUnClient().getVehiculos().size() > 1) {
                if (unVehiculo.getUnContrato().getUnaPoliza().equals(new ContraTodoRiesgo())) {
                beneficios += unContrato.getPrecioMensual() * 0.1;
                }
            }
        } return beneficios;
    }

    public void removeBeneficios() {
            beneficios = 0;
        }


    public double getBeneficios() {
        return beneficios;
    }
}
