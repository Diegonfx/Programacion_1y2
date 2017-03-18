package Cursada.portfolioSeba;
import java.util.Calendar;

public abstract class PlazoFijo extends Asset {

	public PlazoFijo(String nombre, int interesAnual, IDate dateWrapper) {
		super(nombre, interesAnual, dateWrapper); 
	}
	
	public abstract double calculateBalance(Calendar initDate, double initAmount);
}
