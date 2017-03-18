package Cursada.guia1;

public class Fraction {

    private int numerador;
    private int denominador;

    /**
     * Cada vez que se crea una fraction, se expresa en
     * su minima expresion
     * @param numerador
     * @param denominador
     */
    public Fraction(int numerador, int denominador){
        int mcm = mcm(numerador,denominador);
        this.numerador = numerador / mcm;
        this.denominador = denominador / mcm;
    }

    public Fraction add(Fraction input){
        int denominador = this.denominador * input.getDenominador();
        int numerador = this.numerador * input.getDenominador() +
                    input.getNumerador() * this.denominador;

        return new Fraction(numerador, denominador);
    }

    public Fraction sub(Fraction input){
        int denominador = this.denominador * input.getDenominador();
        int numerador = this.numerador * input.getDenominador() -
                input.getNumerador() * this.denominador;

        return new Fraction(numerador, denominador);
    }

    public Fraction add (int number){
        int numerador = this.numerador + (number * this.denominador);
        return new Fraction(numerador, this.denominador);
    }

    public Fraction mul (Fraction f){
        int numerador = this.numerador * f.getNumerador();
        int denominador = this.denominador * f.getDenominador();
        return new Fraction(numerador, denominador);
    }

    public Fraction div (Fraction f){
        int numerador = this.numerador * f.getDenominador();
        int denominador = this.denominador * f.getNumerador();
        return new Fraction(numerador, denominador);
    }

    public float asFloat(){
        return (float) numerador / denominador;
    }

    public boolean equals(Fraction f){
        if (numerador == f.getNumerador() &&
                denominador == f.getDenominador())
            return true;
        else return false;
    }
    
    public int getNumerador(){
        return numerador;
    }

    public int getDenominador(){
        return denominador;
    }

    /**
     * Maximo Comun Multiplo
     * @param a
     * @param b
     * @return
     */
    private int mcm(int a, int b){
        if(b==0) return a;
        return mcm(b, a%b);
    }

    /**
     * Ejercicio guia 2
     * @param o
     * @return
     */
    public boolean equals(Object o){
        if(this == o)  //Los dos objetos apuntan al mismo lugar en la memoria
            return true;

        if(!(o instanceof Fraction)) // El objeto no es del el mismo o child class
            return false;

        Fraction aFraction = (Fraction) o;

        return this.numerador == aFraction.numerador &&
                this.denominador == aFraction.denominador;
    }

}
