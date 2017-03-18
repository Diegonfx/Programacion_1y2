package Cursada.guia4;


public class Gerente extends Empleado {
    private Empleado[] subordinados;

    public Gerente(double sueldoBase, Legajo unLegajo, Empleado[] unosSubordinados){
        super(sueldoBase,unLegajo);
        subordinados = unosSubordinados;
    }

    @Override
    public double getSueldo() {
        double extra = 0;
        for(int i = 0;i < subordinados.length; i++){
            extra += subordinados[i].getSueldo() * 0.01;
        }

        return extra + this.getSueldoBase();
    }

}
