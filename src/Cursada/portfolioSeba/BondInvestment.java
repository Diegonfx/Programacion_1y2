package Cursada.portfolioSeba;
import java.util.Calendar;

public class BondInvestment extends Investment {

	private Bond bond;
	private int quantity;
	private Calendar initDate;
	private double initAmount;

	public BondInvestment(Bond bond, int quantity, Calendar initDate) {
		this.bond = bond;
		this.quantity = quantity;
		this.initDate = initDate;
		this.initAmount = quantity * bond.getCurrentPrice();
	}

	@Override
	public Asset getAsset() {
		return bond;
	}

	@Override
	public Calendar getInitialDate() {
		return initDate;
	}

	@Override
	public double getInitialAmount() {
		return initAmount;
	}

	@Override
	public double getBalance() {
		return bond.calculateBalance(quantity);
	}

}
