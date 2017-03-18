package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public interface StateOfGhost {

    void goEatable(Ghost ghost) ;

    void goNotEatable(Ghost ghost) ;

    boolean isEatable();

    String toString();

}
