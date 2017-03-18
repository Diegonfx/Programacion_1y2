package RecuperatorioParcial1.Ejercicio2;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Container implements Comparable<Container> {

    private Client unClient;
    private String containerCode;
    private double weight;
    private double maxWeightSupported;

    public Container(Client unClient, String containerCode, double maxWeightSupported) {
        this.unClient = unClient;
        this.containerCode = containerCode;
        this.maxWeightSupported = maxWeightSupported;
        weight = 0;
    }

    public Client getUnClient() {
        return unClient;
    }

    public String getContainerCode() {
        return containerCode;
    }

    public double getWeight() {
        for (int i = 0 ; i < unClient.getArticles().size() ; i++) {

        }
        return weight;
    }

    public double getMaxWeightSupported() {
        return maxWeightSupported;
    }

    public void setMaxWeightSupported(double maxWeightSupported) {
        this.maxWeightSupported = maxWeightSupported;
    }

    public int getArticlesInside() {
        int size = 0;
        for (int i = 0 ; i < unClient.getArticles().size() ; i++) {
            size += unClient.getArticles().get(i).getWeight();
        } return size;
    }

    public int getArticleCode() {
        int code = 0;
        for (int i = 0 ; i < unClient.getArticles().size() ; i++) {
            code = unClient.getArticles().get(i).getCode();
        } return code;
    }

    @Override
    public int compareTo(Container o) {
        if (getWeight() == o.getWeight()) {
            return 0;
        } else if (getWeight() < o.getWeight()) {
            return -1;
        } else {
            return 1;
        }
    }


}
