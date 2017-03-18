package Cursada.guia5.Numbers;

import java.util.ArrayList;

public class NumberHolder {

    private int[] listaDeNumeros;

    public NumberHolder(int[] unosNumeros){
        listaDeNumeros = unosNumeros;
    }

    public ArrayList<Integer> filtrar(TieneCondicion unObjeto){
        ArrayList<Integer> nuevaLista = new ArrayList<>();
        for(int i = 0; i < listaDeNumeros.length; i++){

            if(unObjeto.condicion(listaDeNumeros[i]) )
                nuevaLista.add( listaDeNumeros[i] );
        }
        return nuevaLista;
    }


}
