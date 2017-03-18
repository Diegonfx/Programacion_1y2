package RecuperatorioParcial2.Ejercicio3;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 2/12/16.
 */
public class SuperList<T> {

    private ArrayList<FilterCriteria<T>> criterios;
    private ArrayList<T> elements;

    public SuperList() {
        criterios = new ArrayList<>();
        elements = new ArrayList<>();
    }

    public void addCriterio(FilterCriteria<T> unCriterio){
        criterios.add(unCriterio);
    }

    public void removeCriterio(FilterCriteria<T> unCriterio){
        criterios.remove(unCriterio);
    }

    public void addElement(T unElemento){

        boolean cumpleCriterios = true;

        for (FilterCriteria<T> unCriterio : criterios){
            if( !unCriterio.filter(unElemento) ){
                cumpleCriterios = false;
            }
        }

        if(cumpleCriterios)
            elements.add(unElemento);
    }

    public void removeElementOnce(T unElemento) {
        if (elements.contains(unElemento)) {
            elements.remove(unElemento);
        } else throw new RuntimeException("NOT FOUND");
    }

    public void removeAllElement(T unElemento) {
        for (T elementToLoop : elements) {

            if (elementToLoop.equals(unElemento)) {
                elements.remove(unElemento);
            }
        }
    }

    public boolean containsElement(T element) {

        if (elements.contains(element)) {
            return true;
        } return false;
    }

    public boolean puedeSerAgregado(T unElemento){
        for (FilterCriteria<T> unCriterio : criterios){
            if( !unCriterio.filter(unElemento) ){
                return false;
            }
        }
        return true;
    }

    public ArrayList<T> getElementsUniqueAndFiltered(FilterCriteria<T> unCriterio){

        ArrayList<T> filteredElements = new ArrayList<>();

        for (T elementToLoop : elements) {
            if (!(filteredElements.contains(elementToLoop))) {
                filteredElements.add(elementToLoop);
            } else throw new RuntimeException("ELEMENT ALREADY ADDED");
        }
        return filteredElements;

    }
}
