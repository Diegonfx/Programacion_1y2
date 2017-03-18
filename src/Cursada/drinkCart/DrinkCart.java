package Cursada.drinkCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DrinkCart {

    private ArrayList<String> bebidas;

    public DrinkCart(String[] bebidas){
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(bebidas));
        this.bebidas = lista;
    }

    public DrinkCart(){
        bebidas = new ArrayList<>();
    }

    public List<String> getElements(){ return bebidas; }

    public void addDrink(String item){
        bebidas.add(item);
    }

    public int quantity(){ return bebidas.size(); }

    public boolean isEmpty(){
        return bebidas.isEmpty();
    }

    public void removeDrink(int index){
        bebidas.remove(index);
    }

    public void removeDrink(String item){
        int indiceAEliminar = -1;

        for(int i = 0;i < bebidas.size(); i++){
            if (item.equals(bebidas.get(i))){
                indiceAEliminar = i;
            }
        }

        if (indiceAEliminar != -1){
            bebidas.remove(indiceAEliminar);
        }
        else{
            throw new RuntimeException("No se encuentra la bebida a eliminar");
        }
    }
}
