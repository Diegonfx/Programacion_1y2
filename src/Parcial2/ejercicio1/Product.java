package Parcial2.ejercicio1;

public class Product {
    private String nameOfProduct;
    private double weight;

    public Product(String nameOfProduct, double weight) {
        this.nameOfProduct = nameOfProduct;
        this.weight = weight;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public double getWeight() {
        return weight;
    }
}
