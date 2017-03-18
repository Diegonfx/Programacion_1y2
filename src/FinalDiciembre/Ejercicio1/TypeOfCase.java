package FinalDiciembre.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public interface TypeOfCase {

    boolean isExtraJudicial() ;

    boolean isMediacion() ;

    boolean isJudicial() ;

    void goMediacion(Case aCase) ;

    void goJuicio(Case aCase) ;

}
