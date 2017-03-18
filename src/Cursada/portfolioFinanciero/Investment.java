package Cursada.portfolioFinanciero;

import java.util.Date;


public class Investment {
    private PlazoFijo unPlazoFijo;
    private double amount;
    private Date initDate;

    public Investment(double amount, PlazoFijo type){
        this.amount = amount;
        unPlazoFijo = type;
        initDate = new Date();
    }

    public double getInteresAnual(){
        return unPlazoFijo.getInteresAnual();
    }

    public double getAmount(){
        return amount;
    }



}
