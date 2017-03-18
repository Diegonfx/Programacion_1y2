package Programacion1COMPLETO.Final;

/**
 * Created by DiegoMancini on 15/12/16.
 */
    /* Esta clase simula ser una cartelera
 * En primera instancia con posibilidad de 4 carteles
 *
 * @author (Jorge Oribe)
 * @version (1.0)
 */
public class Cartelera {

    // Definimos las variables de instancia de esta clase
    private Cartel[] carteles;

    /**
     * Constructor de objetos de la clase Cartelera
     * Crea una cartelera con cuatro carteles sin texto (String vacio: "")
     * Por eso no necesita que le pase ningún dato.
     */
    public Cartelera(int cantidad) {
        carteles = new Cartel[cantidad];
        for (int i = 0 ; i < cantidad ; i++) {
            carteles[i] = new Cartel("");
        }
    }

    /**
     * Método que muestra la cartelera
     */
    public void mostrar(){

        System.out.println("****************");
        for (int i = 0 ; i < carteles.length ; i++) {
            carteles[i].print();
        }
        System.out.println("****************");

    }

    /**
     * modifica el texto de los carteles
     * @param nuevosTextos texto para los carteles
     */
    public void modificaCarteles(String[] nuevosTextos) {
        for (int i = 0 ; i < carteles.length ; i++) {
            carteles[i].setText(nuevosTextos[i]);
        }
    }

    /**
     * metodo que pone todos los carteles sin texto
     * (Observar que uso el método anterior con 4 String vacíos)
     */
    public void modificaCarteles() {

        for (int i = 0 ; i < carteles.length ; i++) {
            carteles[i].setText("");
        }

    }
}
