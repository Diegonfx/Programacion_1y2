package portfolioSeba;

import org.junit.Test;

import java.util.Calendar;


public class DateSimulatorTests {	
	@Test
	public void test001() {
		DateSimulator dateSimulator = new DateSimulator(16, 9, 2016);
		assertEquals(16, dateSimulator.getToday().get(Calendar.DAY_OF_MONTH));
		assertEquals(8, dateSimulator.getToday().get(Calendar.MONTH));
		assertEquals(2016, dateSimulator.getToday().get(Calendar.YEAR));

		dateSimulator.goTo(20, 10, 2020);
		assertEquals(20, dateSimulator.getToday().get(Calendar.DAY_OF_MONTH));
		assertEquals(9, dateSimulator.getToday().get(Calendar.MONTH));
		assertEquals(2020, dateSimulator.getToday().get(Calendar.YEAR));
	}
}
