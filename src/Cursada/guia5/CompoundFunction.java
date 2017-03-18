package Cursada.guia5;


public class CompoundFunction implements Function{

    private Function funcionF;
    private Function funcionG;

    CompoundFunction(Function funcionF, Function funcionG){
        this.funcionF = funcionF;
        this.funcionG = funcionG;
    }

    @Override
    public double evaluate(double value) {
        return funcionF.evaluate( funcionG.evaluate(value) );
    }
}
