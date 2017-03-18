package Cursada.guia4.html;

import java.util.ArrayList;


public class UnorderedList extends Element {

    private ArrayList<Element> elements;

    public UnorderedList (){
        elements = new ArrayList<>();
    }

    public void add (Element unElemento){
        elements.add(unElemento);
    }

    public String toString(){
        String list =  "<ul>\n";
        for(int i = 0; i < elements.size(); i++){
            list += "\t\t"+ "<li> "+ elements.get(i).toString() + " </li> " + "\n";
        }

        return list + "\t</ul>\n";
    }
}

