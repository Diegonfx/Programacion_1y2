package Cursada.guia4.html;
import java.util.ArrayList;

public class Body {

    private ArrayList<Element> elementos;

    public Body(){
        elementos = new ArrayList<>();
    }

    public void addElement(Element unElemento) {
        elementos.add(unElemento);
    }

    public String toString(){
        String body = "";

        body += "<body> \n";

        for(int i = 0; i < elementos.size(); i++){
            body += "\t" + elementos.get(i) + "\n";
        }
        return body + "</body>";
    }

}
