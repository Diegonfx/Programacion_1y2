package Cursada.portfolioFinanciero;

import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Investment> inversiones;

    public Portfolio(){
        inversiones = new ArrayList<>();
    }

    public Investment invest(double amount, PlazoFijo type){
        Investment newInvestment = new Investment(amount,type);
        inversiones.add(newInvestment);
        return newInvestment;
    }

    public void returnInvestment(double amount, PlazoFijo unPlazoFijo){
        int indiceAeliminar = -1;

        for(int i = 0; i < inversiones.size(); i++){
            if(inversiones.get(i).getInteresAnual() == unPlazoFijo.getInteresAnual() &&
                    inversiones.get(i).getAmount() == amount)
                indiceAeliminar = i;

        }

        if(indiceAeliminar != -1) {
            inversiones.remove(indiceAeliminar);
        }else{
            throw new RuntimeException("No existe el Investment buscado");
        }
    }

    public double dailyProfit(){
        double dailyProfit = 0;
        for(int i = 0; i < inversiones.size(); i++){
            dailyProfit += inversiones.get(i).getInteresAnual() *
                    inversiones.get(i).getAmount() / 365;
        }
        return dailyProfit;
    }

    public double BalanceIn1Year(){
        double total = 0;
        for(int i = 0; i < inversiones.size(); i++){
            total += (inversiones.get(i).getInteresAnual() + 1) *
                    inversiones.get(i).getAmount();
        }
        return total;
    }



}
