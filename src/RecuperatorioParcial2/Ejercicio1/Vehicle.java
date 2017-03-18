package RecuperatorioParcial2.Ejercicio1;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class Vehicle implements Comparable<Vehicle>{

    private int modelYear;
    private int deterioro;
    private double price;
    private Contract unContract;
    private double policyPrice;

    public Vehicle(int modelYear, double price) {
        this.modelYear = modelYear;
        this.price = price;
        deterioro = 0;
        unContract = null;
    }

    @Override
    public int compareTo(Vehicle vehicle2) {

        if (modelYear == vehicle2.getModelYear()) {
            return 0;
        } else if (modelYear > vehicle2.getModelYear()) {
            return 1;
        } else {
            return -1;
        }

    }

    public int getModelYear() {
        return modelYear;
    }

    public int getDeterioro() {
        return deterioro;
    }

    public double getPrice() {
        return price;
    }

    public Contract getUnContract() {
        return unContract;
    }

    public void addContract(Contract unContract) {
        this.unContract = unContract;
    }

    public void qualifyDeterioro(int deterioroAC) {
        this.deterioro = deterioroAC;
    }

    public double getPolicyPrice() {
        return getUnContract().getaPolicy().getPrice(this);
    }

    public boolean hasContract() {

        if (!(unContract == null)) {
            return true;

        } else return false;

    }


}
