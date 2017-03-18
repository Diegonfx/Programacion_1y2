package Cursada.portfolioSeba;
import java.util.Calendar;
import java.util.Date;

public abstract class Asset {
	protected String name;
	protected int interesAnual;
	protected IDate dateWrapper;
	
	public Asset(String name, int interesAnual, IDate dateWrapper) {
		this.name = name;
		this.interesAnual = interesAnual;
		this.dateWrapper = dateWrapper;
	}

	public abstract Investment buildInvestment(double amount);
	
	public double yearsBetween(Date d1, Date d2){
		// hay mejores formas de calcular esta diferencia, ademas de librerias como Joda-Time
        return ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)) / 365.0;
	}

	public double years(Calendar initDate) {

		return yearsBetween(initDate.getTime(), dateWrapper.getToday().getTime());
	}
}
