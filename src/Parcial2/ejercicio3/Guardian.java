package Parcial2.ejercicio3;

import java.util.ArrayList;

/**
 * Created by agustin on 11/11/16.
 */
public class Guardian<T> {

    private ArrayList<CriterioDeFiltro<T>> criterios;
    private ArrayList<T> elements;

    public Guardian(){
        criterios = new ArrayList<>();
        elements = new ArrayList<>();
    }

    public void agregarCriterio(CriterioDeFiltro<T> unCriterio){
        criterios.add(unCriterio);
    }

    public void sacarUnCriterio(CriterioDeFiltro<T> unCriterio){
        criterios.remove(unCriterio);
    }

    public void agregarNuevoElemento(T unElemento){
        boolean cumpleCriterios = true;

        for (CriterioDeFiltro<T> unCriterio : criterios){
            if( !unCriterio.aplicarCriterio(unElemento) ){
                cumpleCriterios = false;
            }
        }

        if(cumpleCriterios)
            elements.add(unElemento);
    }

    public boolean puedeSerAgregado(T unElemento){
        for (CriterioDeFiltro<T> unCriterio : criterios){
            if( !unCriterio.aplicarCriterio(unElemento) ){
                return false;
            }
        }
        return true;
    }

    public ArrayList<T> getElementsAdded(){
        return elements;
    }
}
