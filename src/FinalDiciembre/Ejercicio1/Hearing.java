package FinalDiciembre.Ejercicio1;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Hearing {

    private Date hearingDate;
    private int hourScheduled;
    private String place;

    public Hearing(Date hearingDate, int hourScheduled, String place) {
        this.hearingDate = hearingDate;
        this.hourScheduled = hourScheduled;
        this.place = place;
    }

    public Date getHearingDate() {
        return hearingDate;
    }

    public int getHourScheduled() {
        return hourScheduled;
    }

    public String getPlace() {
        return place;
    }

    public boolean audienciaSeRealizoEsteMes(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(hearingDate);
        cal.add(Calendar.MONTH, 1);
        Date oneMonthLater = cal.getTime();

        Date currentDate = new Date(); // current date
        return currentDate.before(oneMonthLater);
    }

}
