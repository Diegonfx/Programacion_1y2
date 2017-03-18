package portfolioSeba;

import Cursada.portfolioSeba.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class PortfolioTests {	
	@Test
	public void test003UnClienteAlInvertirDebeTenerGanancia() {
		Portfolio portfolio = new Portfolio();
		DateSimulator dateSimulator = new DateSimulator(16, 9, 2016);
		PlazoFijo plazoFijoA = new PlazoFijoTradicional("Pzo Fijo A", 20, dateSimulator);

		assertEquals(0, portfolio.balance(), 0.01);
		portfolio.invest(1000, plazoFijoA);
		assertEquals(1000, portfolio.balance(), 0.01);

		dateSimulator.goTo(16, 9, 2017);
		assertEquals(1200, portfolio.balance(), 0.01);

		dateSimulator.goTo(16, 9, 2018);
		Investment theInvestment = portfolio.deinvest(plazoFijoA);
		assertEquals(1440, theInvestment.getBalance(), 0.01);
		assertEquals(0, portfolio.balance(), 0.01);
	}
}
