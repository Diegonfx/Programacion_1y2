package portfolioFinanciero;

import org.junit.Test;


public class ClienteTest {

    @Test(expected = UnsuficientFundsException.class)
    public void TestInvierteMasDeLoQueTiene() {
        Cliente unClient = new Cliente(1000);

        PfA unPfA = new PfA();
        PfC unPfC = new PfC();

        Investment unaInversion = unClient.invest(300, unPfA);
        Investment otraInversion = unClient.invest(800, unPfC);



    }

    @Test
    public void returnAnualBalance() throws Exception {
        Cliente unClient = new Cliente(1000);

        PfA unPfA = new PfA();
        PfC unPfC = new PfC();
        Investment unaInversion = unClient.invest(200, unPfA);
        Investment otraInversion = unClient.invest(100, unPfC);

        assertEquals(1070, unClient.balanceIn1Year(), 0.1);
    }

    @Test
    public void returnDailyProfit() throws Exception {
        Cliente unClient = new Cliente(1000);

        PfC unPfC = new PfC();
        Investment otraInversion = unClient.invest(1000, unPfC);

        assertEquals(0.821, unClient.dailyProfit(), 0.1);
    }

    @Test
    public void testRetirarUnPlazoFijo(){
        Cliente unClient = new Cliente(1000);

        PfA unPfA = new PfA();
        PfC unPfC = new PfC();
        Investment unaInversion = unClient.invest(200, unPfA);
        Investment otraInversion = unClient.invest(500, unPfC);
        unClient.returnInvestment(500,unPfC);

        assertEquals(1040, unClient.balanceIn1Year(), 0.1);
    }

    @Test(expected = RuntimeException.class)
    public void testRetirarUnPlazoFijoQueNoExiste(){
        Cliente unClient = new Cliente(1000);

        PfA unPfA = new PfA();
        PfB unPfB = new PfB();
        PfC unPfC = new PfC();
        Investment unaInversion = unClient.invest(200, unPfA);
        Investment otraInversion = unClient.invest(500, unPfC);
        unClient.returnInvestment(400,unPfB); // No existe este plazo fijo
    }


}