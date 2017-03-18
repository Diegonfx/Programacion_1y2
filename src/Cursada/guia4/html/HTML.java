package Cursada.guia4.html;


public class HTML {
    private Head head;
    private Body body;

    public HTML(String title){
        head = new Head();
        head.addTitle(title);
        body = new Body();
    }

    public String toString(){
        return "<!DOCTYPE html> \n" + "<html> \n"
                + head + "\n" + body + "\n" + "</html>";
    }

    public Body getBody() {
        return body;
    }

    public Head getHead() {
        return head;
    }

}
