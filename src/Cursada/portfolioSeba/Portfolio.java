package Cursada.portfolioSeba;
import java.util.ArrayList;
import java.util.Iterator;

public class Portfolio {
	ArrayList<Investment> investments = new ArrayList<Investment>();
	
	public double balance() {
		double balance = 0;
		for (Iterator<Investment> iterator = investments.iterator(); iterator.hasNext();) {
			Investment investment = iterator.next();
			balance += investment.getBalance();
		}

		for (int i =0; i< investments.size(); i++){
			balance += investments.get(i).getBalance();
		}
		return balance;
	}

	public Investment invest(double amount, Asset asset) {
		Investment newInvestment = asset.buildInvestment(amount);
		investments.add(newInvestment);
		return newInvestment;
	}

	public Investment deinvest(Asset asset) {
		for (Iterator<Investment> iterator = investments.iterator(); iterator.hasNext();) {
			Investment investment = iterator.next();
			if (investment.getAsset() == asset) {
				investments.remove(investment);
				return investment;
			}
		}
		throw new RuntimeException();
	}
}
