package FinalDiciembre.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Juicio implements TypeOfCase {


    @Override
    public boolean isExtraJudicial() {
        return false;
    }

    @Override
    public boolean isMediacion() {
        return false;
    }

    @Override
    public boolean isJudicial() {
        return true;
    }

    @Override
    public void goMediacion(Case aCase) {
        throw new RuntimeException("ALREADY A TRIAL");
    }

    @Override
    public void goJuicio(Case aCase) {
        throw new RuntimeException("ALREADY A TRIAL");
    }
}
