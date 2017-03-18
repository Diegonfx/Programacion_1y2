package Cursada.portfolioSeba;
import java.util.Calendar;

public class DateSimulator implements IDate {
	Calendar fakeToday;
	
	public DateSimulator(int day, int month, int year) {
		goTo(day, month, year);
	}

	@Override
	public Calendar getToday() {
		return fakeToday;
	}

	public void goTo(int day, int month, int year) {
		fakeToday = Calendar.getInstance();
		fakeToday.set(year, month - 1, day);
	}

}
