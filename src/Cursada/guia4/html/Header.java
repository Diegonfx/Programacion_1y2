package Cursada.guia4.html;


public class Header extends Element{

    private String header;

    public Header(String aHeader){
        header = aHeader;
    }

    public String toString(){
        return "<h1>" + header + "</h1>";
    }
}

