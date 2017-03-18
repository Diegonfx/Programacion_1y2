package Cursada.TarifadorLlamadas;

/**
 * Created by agustin on 4/11/16.
 */
public class NumeroTelefonico {

    private int codigoDePais;
    private int codigoDeArea;
    private int numero;

    NumeroTelefonico(int unCodigoDePais, int unCodigoDeArea, int unNumero){
        codigoDePais = unCodigoDePais;
        codigoDeArea = unCodigoDeArea;
        numero = unNumero;
    }


    public int getCodigoDePais() {
        return codigoDePais;
    }

    public int getCodigoDeArea() {
        return codigoDeArea;
    }

    public int getNumero() {
        return numero;
    }

}
