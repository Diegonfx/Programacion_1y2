package Cursada.portfolioSeba;
import java.util.Calendar;

public abstract class Investment {
	public abstract Asset getAsset();
	public abstract Calendar getInitialDate();
	public abstract double getInitialAmount();
	public abstract double getBalance();
}
