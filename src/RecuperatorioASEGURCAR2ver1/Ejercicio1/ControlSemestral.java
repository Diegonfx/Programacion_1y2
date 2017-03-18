package RecuperatorioASEGURCAR2ver1.Ejercicio1;

import java.time.LocalDate;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class ControlSemestral {

    private AnalizadorDeDeterioro analysis;
    private AnalizadorDeBeneficios analizadorDeBeneficios;
    private LocalDate vehicleControlDate;

    public ControlSemestral(AnalizadorDeDeterioro analysis , AnalizadorDeBeneficios analizadorDeBeneficios) {
        this.analysis = analysis;
        vehicleControlDate = LocalDate.now();
        this.analizadorDeBeneficios = analizadorDeBeneficios;
    }

    public AnalizadorDeDeterioro getAnalysis() {
        return analysis;
    }
    public AnalizadorDeBeneficios getAnalizadorDeBeneficios() {
        return analizadorDeBeneficios;
    }
    public int getTodaysMonth() {
        return vehicleControlDate.getMonthValue();
    }

    public void controlVehicle(Vehiculo aVehicle) {

            if (aVehicle.getUnContrato().getInitDate().getMonthValue() + 6 > getTodaysMonth() && aVehicle.isControlAlDia() == false) {
                analysis.analyzeVehicle(aVehicle);
            } else {
                analizadorDeBeneficios.removeBeneficios();
            }
            aVehicle.setControlAlDia();
        }

}
