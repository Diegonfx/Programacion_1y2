package Cursada.portfolioSeba;
public class Bond extends Asset {
	private double currentPrice;

	public Bond(String nombre, int interesAnual, IDate dateWrapper, double currentPrice) {
		super(nombre, interesAnual, dateWrapper); 
		this.setCurrentPrice(currentPrice);
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}

	@Override
	public Investment buildInvestment(double amount) {
		return new BondInvestment(this, (int)(amount/currentPrice), dateWrapper.getToday());
	}

	public double calculateBalance(int quantity) {
		return quantity * currentPrice;
	}
}
