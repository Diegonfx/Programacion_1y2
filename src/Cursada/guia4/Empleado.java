package Cursada.guia4;


public class Empleado {

    private double sueldoBase;
    private Legajo legajoDeEmpleado;

    public Empleado(double unSueldoBase, Legajo unLegajo){
        sueldoBase = unSueldoBase;
        legajoDeEmpleado = unLegajo;
    }

    public double getSueldo() {
        return sueldoBase;
    }

    public double getSueldoBase(){
        return sueldoBase;
    }
}
