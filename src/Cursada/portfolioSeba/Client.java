package Cursada.portfolioSeba;
public class Client {
	String name;
	double balance;
	Portfolio portfolio;
	
	public Client(String name) {
		this.name = name;
		this.balance = 0;
		this.portfolio = new Portfolio();
	}

	public double cashBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void extract(double amount) {
		if(amount > balance){
			throw new SinSaldoEnCuentaException(balance, amount);
		}
		balance -= amount;
	}

	public void invest(double amount, Asset asset) {
		Investment newInvestment = portfolio.invest(amount, asset);
		extract(newInvestment.getInitialAmount());
	}

	public double investmentsBalance() {
		return portfolio.balance();
	}

	public void deinvest(Asset asset) {
		Investment oldInvestment = portfolio.deinvest(asset);
		deposit(oldInvestment.getBalance());
	}
}
