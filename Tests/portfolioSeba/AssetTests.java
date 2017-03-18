package portfolioSeba;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AssetTests {
	@Test 
	public void test001() {
		Asset asset = new PlazoFijoTradicional("prueba", 10, new DateSimulator(1, 1, 2016));
		double result = asset
			.yearsBetween(
				new DateSimulator(1, 1, 2017).getToday().getTime(),
				new DateSimulator(1, 1, 2018).getToday().getTime()
			);
		assertEquals(1, result, 0.01);
	}
}
