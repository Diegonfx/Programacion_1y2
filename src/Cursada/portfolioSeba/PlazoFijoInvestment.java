package Cursada.portfolioSeba;
import java.util.Calendar;

public class PlazoFijoInvestment extends Investment {
	private PlazoFijo plazoFijo;
	private double initAmount;
	private Calendar initDate;

	public PlazoFijoInvestment(PlazoFijo plazoFijo, double initAmount, Calendar initDate) {
		this.plazoFijo = plazoFijo;
		this.initAmount = initAmount;
		this.initDate = initDate;
	}

	@Override
	public Asset getAsset() {
		return plazoFijo;
	}

	@Override
	public double getBalance() {
		return plazoFijo.calculateBalance(initDate, initAmount);
	}

	@Override
	public Calendar getInitialDate() {
		return initDate;
	}

	@Override
	public double getInitialAmount() {
		return initAmount;
	}

}
