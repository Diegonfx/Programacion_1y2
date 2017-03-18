package Cursada.guia4.html;

import java.util.ArrayList;

public class OrderedList extends Element {

    private ArrayList<Element> elements;

    public OrderedList (){
        elements = new ArrayList<>();
    }

    public void add (Element unElemento){
        elements.add(unElemento);
    }

    public String toString(){
        String list =  "<ol>\n";
        for(int i = 0; i < elements.size(); i++){
            list += "\t\t"+ "<li> "+ elements.get(i).toString() + " </li> " + "\n";
        }

        return list + "\t</ol>\n";
    }
}
