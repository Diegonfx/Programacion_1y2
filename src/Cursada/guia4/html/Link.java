package Cursada.guia4.html;

public class Link extends Element {

    private String link;
    private String text;

    public Link (String aLink, String aText){
        link = aLink;
        text = aText;
    }

    public String toString(){
        return "<a href=\""+ link + "\">"+ text +"</a>";
    }
}
