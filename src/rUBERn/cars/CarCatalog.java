package rUBERn.cars;

import java.util.ArrayList;

public class CarCatalog {

    private ArrayList<CarCategory> carCategories;

    public CarCatalog(){
        carCategories = new ArrayList<>();
    }

    public int catalogSize() {
        return carCategories.size();
    }

    public void addNewCarCategory(CarCategory aTypeOfCar){
        carCategories.add(aTypeOfCar);
    }

    public CarCategory getCarCategory(int index){
        return carCategories.get(index - 1);
    }

    public String toString(){
        String result = "Tipos De Autos: \n";
        for (int i = 0; i < carCategories.size(); i++){
            CarCategory aCar = carCategories.get(i);
            result += "Index: " + (i + 1) + "  *  Type: " + aCar.toString() +
                    "  *  MaxPassengers: " + aCar.getMaxPassengers() + "  *  Quality Coefficient: "+
                    aCar.qualityCoefficient() + "\n";
        }
        return result;

    }




}
