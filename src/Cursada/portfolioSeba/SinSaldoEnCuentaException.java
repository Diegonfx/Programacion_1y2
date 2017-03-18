package Cursada.portfolioSeba;
public class SinSaldoEnCuentaException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	double balance;
	double amount;
	
	public SinSaldoEnCuentaException(double balance, double amount) {
		super("Fondos insuficientes, usted cuenta con " + balance + ", y no puede extraer " + amount);
		this.balance = balance;
		this.amount = amount;
	}

}
