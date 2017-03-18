package RecuperatorioParcial1.Ejercicio2;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class Client {

    private String name;
    private ArrayList<Article> articles;
    private String clientColde;

    public Client(String name, String clientColde) {
        this.name = name;
        articles = new ArrayList<>();
        this.clientColde = clientColde;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public String getClientColde() {
        return clientColde;
    }

    public void addArticle(Article unArticle) {
        articles.add(unArticle);
    }
}
