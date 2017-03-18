package rUBERn.cars;


public class Car {
    private CarCategory category;

    public Car (CarCategory aCategory){
        category = aCategory;
    }


    public double getSpeedCoefficient(){
        return category.getSpeedCoefficient();
    }
    public int getMaxPassengers(){
        return category.getMaxPassengers();
    }
    public double priceIncremental(){
        return category.priceIncremental();
    }
    public double qualityCoefficient(){
        return category.qualityCoefficient();
    }
    public String toString(){
        return category.toString();
    }



}
