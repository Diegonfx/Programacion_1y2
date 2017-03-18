package FinalApu.Ejercicio1;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by agustin on 16/12/16.
 */
public class Audiencia {

    private Date fechaDeRealizacion;
    private int hora;
    private String lugarDeAsistencia;

    public Audiencia(Date fechaDeRealizacion, int hora, String lugarDeAsistencia) {
        this.fechaDeRealizacion = fechaDeRealizacion;
        this.hora = hora;
        this.lugarDeAsistencia = lugarDeAsistencia;
    }

    public boolean audienciaSeRealizoEsteMes(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaDeRealizacion);
        cal.add(Calendar.MONTH, 1);
        Date oneMonthLater = cal.getTime();

        Date currentDate = new Date(); // current date
        return currentDate.before(oneMonthLater);
    }
}
