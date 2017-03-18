package Cursada.portfolioFinanciero;



public class Cliente {

    private Portfolio unPortfolio;
    private double univestedMoney;

    public Cliente(double initialMoney){
        univestedMoney = initialMoney;
        unPortfolio = new Portfolio();
    }

    public Investment invest(double amount, PlazoFijo type)  {
        Investment newInvestment;
        if(univestedMoney >= amount){
            newInvestment = unPortfolio.invest(amount,type);
            univestedMoney -= amount;

        }
        else{
            throw new UnsuficientFundsException();
        }
        return newInvestment;
    }

    public void returnInvestment(double amount, PlazoFijo unPlazoFijo){
        unPortfolio.returnInvestment(amount, unPlazoFijo);
        univestedMoney += amount;
    }

    public double balanceIn1Year(){
        return univestedMoney + unPortfolio.BalanceIn1Year();

    }


    public double dailyProfit(){
        return unPortfolio.dailyProfit();
    }


}
