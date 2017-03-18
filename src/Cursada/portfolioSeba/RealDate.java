package Cursada.portfolioSeba;

import java.util.Calendar;

/**
 * Created by agustin on 23/9/16.
 */
public class RealDate implements IDate {


    @Override
    public Calendar getToday() {
        return Calendar.getInstance();
    }
}
