package portfolioSeba;

import org.junit.Test;


public class ClientTests {
	@Test 
	public void test001() {
		Client client = new Client("Pedro");
		assertEquals(0, client.cashBalance(), 0.01);
		client.deposit(100);
		assertEquals(100, client.cashBalance(), 0.01);
		client.extract(10);
		assertEquals(90, client.cashBalance(), 0.01);
	} 
	
	@Test(expected = SinSaldoEnCuentaException.class)
	public void test002() {
		Client client = new Client("Pedro");
		client.extract(10);
	}
	
	@Test
	public void test003UnClienteAlInvertirDebeTenerGanancia() {
		Client client = new Client("Pedro");
		DateSimulator dateSimulator = new DateSimulator(16, 9, 2016);
		PlazoFijo plazoFijoA = new PlazoFijoTradicional("Pzo Fijo A", 20, dateSimulator);

		client.deposit(10000);
		client.invest(1000, plazoFijoA);
		assertEquals(1000, client.investmentsBalance(), 0.01);

		dateSimulator.goTo(16, 9, 2017);
		client.deinvest(plazoFijoA);
		assertEquals(10200, client.cashBalance(), 0.01);

		dateSimulator.goTo(16, 10, 2017);
		assertEquals(10200, client.cashBalance(), 0.01);
		client.extract(10000);
		assertEquals(200, client.cashBalance(), 0.01);
	}
	
	@Test
	public void test004UnClienteAlInvertirBonosDebeTenerGanancia() {
		Client client = new Client("Pedro");
		DateSimulator dateSimulator = new DateSimulator(16, 9, 2016);
		Bond boden19 = new Bond("Boden2019", 20, dateSimulator, 55);

		client.deposit(10000);
		client.invest(1000, boden19);
		assertEquals(990, client.investmentsBalance(), 0.01);
		assertEquals(9010, client.cashBalance(), 0.01);

		dateSimulator.goTo(16, 9, 2017);
		boden19.setCurrentPrice(50);
		assertEquals(900, client.investmentsBalance(), 0.01);
		assertEquals(9010, client.cashBalance(), 0.01);

		dateSimulator.goTo(16, 9, 2018);
		boden19.setCurrentPrice(70);
		client.deinvest(boden19);
		assertEquals(0, client.investmentsBalance(), 0.01);
		assertEquals(10270, client.cashBalance(), 0.01);

		dateSimulator.goTo(16, 10, 2019);
		assertEquals(0, client.investmentsBalance(), 0.01);
		assertEquals(10270, client.cashBalance(), 0.01);
	}
}
