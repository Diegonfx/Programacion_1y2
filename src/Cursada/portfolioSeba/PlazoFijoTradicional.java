package Cursada.portfolioSeba;
import java.util.Calendar;

public class PlazoFijoTradicional extends PlazoFijo {
	public PlazoFijoTradicional(String nombre, int interesAnual, IDate dateWrapper) {
		super(nombre, interesAnual, dateWrapper); 
	}

	@Override
	public Investment buildInvestment(double amount) {
		return new PlazoFijoInvestment(this, amount, dateWrapper.getToday());
	}

	@Override
	public double calculateBalance(Calendar initDate, double initAmount) {
		double yearsSinceInit = years(initDate);
		return initAmount * Math.pow(1 + interesAnual / 100.0, yearsSinceInit);

	}
}
