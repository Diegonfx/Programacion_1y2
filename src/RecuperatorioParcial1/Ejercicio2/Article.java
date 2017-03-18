package RecuperatorioParcial1.Ejercicio2;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Article {

    private String description;
    private int code;
    private double weight;

    public Article(String description, int code, double weight) {
        this.description = description;
        this.code = code;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public double getWeight() {
        return weight;
    }
}
