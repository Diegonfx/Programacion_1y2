package FinalDiciembre.Ejercicio1;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class ExtraJudicial implements TypeOfCase {

    @Override
    public boolean isExtraJudicial() {
        return true;
    }

    @Override
    public boolean isMediacion() {
        return false;
    }

    @Override
    public boolean isJudicial() {
        return false;
    }

    @Override
    public void goMediacion(Case aCase) {
        aCase.setaType(new Mediacion());
    }

    @Override
    public void goJuicio(Case aCase) {
        aCase.setaType(new Juicio());
    }
}
