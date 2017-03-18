package FinalDiciembre.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Mediacion implements TypeOfCase {

    @Override
    public boolean isExtraJudicial() {
        return false;
    }

    @Override
    public boolean isMediacion() {
        return true;
    }

    @Override
    public boolean isJudicial() {
        return false;
    }

    @Override
    public void goMediacion(Case aCase) {
        throw new RuntimeException("Already MEDIACION");

    }

    @Override
    public void goJuicio(Case aCase) {
        aCase.setaType(new Juicio());
    }
}
