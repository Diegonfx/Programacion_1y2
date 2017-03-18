package rUBERn.cars;

/**
 * Created by DiegoMancini on 28/10/16.
 */
public class CarCategory {

    private String type;
    private int maxPassengers;
    private double speedCoefficient;
    private double qualityCoefficient;
    private double priceIncremental;

    public CarCategory(String type, int maxPassengers, double speedCoefficient, double qualityCoefficient, double priceIncremental){
        this.type = type;
        this.maxPassengers = maxPassengers;
        this.speedCoefficient = speedCoefficient;
        this.qualityCoefficient = qualityCoefficient;
        this.priceIncremental = priceIncremental;
    }

    public double priceIncremental() {
        return priceIncremental;
    }

    public double qualityCoefficient() {
        return qualityCoefficient;
    }

    public double getSpeedCoefficient() {
        return speedCoefficient;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String toString(){ return type; }


}
