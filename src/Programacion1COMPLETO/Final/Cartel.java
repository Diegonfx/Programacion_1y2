package Programacion1COMPLETO.Final;

/**
 * Created by DiegoMancini on 15/12/16.
 */
public class Cartel {

    //
    private String text;

    /**
     * Constructor de objetos de la clase Cartel
     */
    public Cartel(String text) {
        this.text = text;
    }

    /**
     * Método que permite modificar el texto del cartel
     *
     */

    public void setText(String nuevoTexto) {
        text = nuevoTexto;
    }

    /**
     * muestra en pantalla su texto mostrándolo del siguiente modo
     * *** textoCartel ***
     */
    public void print(){

        System.out.println("***" + text + "***");
    }

    /**
     * Método que retorna el String del texto
     * @return el String de text
     */
    public String toString(){
        return text;
    }

}
