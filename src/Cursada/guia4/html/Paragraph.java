package Cursada.guia4.html;

/**
 * Created by agustin on 29/8/16.
 */
public class Paragraph extends Element{

    private String paragraph;

    public Paragraph(String aParagraph){
        paragraph = aParagraph;
    }

    public String toString(){
        return "<p>" +paragraph+ "</p>";
    }
}
