package RecuperatorioParcial1.Ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by DiegoMancini on 1/12/16.
 */
public class ContainerDepot {

    private ArrayList<Container> containersInDepot;
    private Integer rows;
    private Integer columns;
    private Integer maxStackedContainers;
    private ArrayList<HashMap<Integer , ArrayList<Container>>> containersRow;
    private HashMap<Integer , ArrayList<Container>> containersColumn;
    private Integer containers ;

    ArrayList<ArrayList<ArrayList<Integer>>> chupala;

    public ContainerDepot(Integer rows, Integer columns, Integer maxStackedContainers) {
        containersInDepot = new ArrayList<>();
        this.rows = rows;
        this.columns = columns;
        this.maxStackedContainers = maxStackedContainers;
        containersRow = new ArrayList<>(rows);
        containersColumn = new HashMap<>(columns);
        containers = 0;
    }

    public void put(Integer row , Integer column , Container containerA) {
        ArrayList<Container> containersInROWCOLUMN = new ArrayList<>(maxStackedContainers);
        containersInROWCOLUMN.add(containerA);
        containersInDepot.add(containerA);
        containersColumn.put(column , containersInROWCOLUMN);
        containersRow.add(containersColumn);
        containers++;
    }

    public void move(Container containerA , Integer row , Integer column) {

        if (containersInDepot.contains(containerA)) {
            ArrayList<Container> nuevoList = new ArrayList<>(maxStackedContainers);
            nuevoList.add(containerA);
            containersColumn.put(column , nuevoList);
            containersRow.add(containersColumn);
        }
    }

    public boolean contains(Container containerA) {
        for (int i = 0 ; i < containersRow.size() ; i++) {
            for (int j = 0 ; j < containersColumn.size() ; j++) {
                for (Container uno : containersRow.get(i).get(j)) {
                    if (containerA.equals(uno)) {
                        return true;
                    }
                }
            }
        } return false;
    }

    public void remove(Container containerA) {
        if (contains(containerA)) {
            for (int i = 0 ; i < containersRow.size() ; i++) {
                for (int j = 0 ; j < containersRow.size() ; j++) {
                    containersRow.get(i).get(j).remove(containerA);
                }
            }
        }
    }

    public void log(){
        int espacioTotal = containersColumn.size()*containersRow.size()*maxStackedContainers;
        System.out.println("el deposito tiene capacidad para " + " contenedores, actualmente teniendo " +
                containers + " lugares ocupados y " + (espacioTotal-containers) + " lugares libres" );
    }


    public ArrayList<Container> getContainersInDepot() {
        return containersInDepot;
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public Integer getMaxStackedContainers() {
        return maxStackedContainers;
    }

    public ArrayList<HashMap<Integer, ArrayList<Container>>> getContainersRow() {
        return containersRow;
    }

    public HashMap<Integer, ArrayList<Container>> getContainersColumn() {
        return containersColumn;
    }

    public Integer getContainers() {
        return containers;
    }

    public void addContainer(Container unContainer) {
        containersInDepot.add(unContainer);
    }

}
