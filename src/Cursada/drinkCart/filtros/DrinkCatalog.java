package Cursada.drinkCart.filtros;

import java.util.HashMap;


public class DrinkCatalog {

    private HashMap<String, Double> catalog;

    public DrinkCatalog(HashMap<String, Double> unCatalog){
        catalog = unCatalog;
    }

    public HashMap<String, Double> aplicarFiltro(TieneFiltro unFiltro){
        return unFiltro.filtrar(catalog);

    }




}
