package Cursada.guia4.html;


public class htmlTester {
    public static void main(String[] args) {
        HTML htmlPrueba = new HTML("Pagina desarrollada con java");

        htmlPrueba.getHead().addJS("miJavaScript.js");

        Header titulo = new Header("Esto es el header de la pagina");
        htmlPrueba.getBody().addElement(titulo);
        Paragraph parrafo = new Paragraph("Esto es un parrafo, tambien se pueden agregar listas");
        htmlPrueba.getBody().addElement(parrafo);

        UnorderedList unaLista = new UnorderedList();
        unaLista.add(new Paragraph("Elemento 1"));
        unaLista.add(new Paragraph("Elemento 2"));
        unaLista.add(new Paragraph("Elemento 3"));
        unaLista.add(new Paragraph("Elemento 4"));

        htmlPrueba.getBody().addElement(unaLista);

        Link unLink = new Link("reddit.com", "Tambien podes agregar links");

        htmlPrueba.getBody().addElement(unLink);

        System.out.println(htmlPrueba);
    }
}
