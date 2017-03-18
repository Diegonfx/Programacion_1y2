package Cursada.guia4.html;


public class Head {

    String head = "";

    public void addCSSStyleSheet(String type, String fileName){
        head += "<link rel=\""+type+"\" type=\"text/css\" href=\"" +fileName+ "\">" + "\n";
    }

    public void addJS(String fileName){
        head += "\t<script src=\"" + fileName + "\"> </script>" + "\n";
    }

    public void addTitle(String title){
        head += "\t<title> " + title + "</title>" + "\n";
    }

    public String toString(){
        return "<head> \n" + head + "</head>";
    }
}
