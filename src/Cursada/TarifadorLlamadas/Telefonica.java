package Cursada.TarifadorLlamadas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Telefonica {

    private ArrayList<Llamada> llamadasRealizadas;
    private Tarifador cashier;

    public Telefonica(){
        llamadasRealizadas = new ArrayList<>();
        cashier = new Tarifador();

    }

    public void agregarNuevaLlamada(NumeroTelefonico emisor, NumeroTelefonico receptor, Date fecha, int horaDeInicio, int duracionDeLlamada){
        Llamada nuevaLlamada = new Llamada(emisor,receptor,fecha,horaDeInicio,duracionDeLlamada);
        llamadasRealizadas.add(nuevaLlamada);
    }

    public ArrayList<Llamada> sort(Comparator<Llamada> unCriterio){

        ArrayList<Llamada> sortedList = llamadasRealizadas;

        for(int i = sortedList.size()-1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(unCriterio.compare(sortedList.get(j), sortedList.get(j+1)) < 0) {
                    Llamada temp = sortedList.get(j);
                    sortedList.set(j, sortedList.get(j + 1));
                    sortedList.set(j + 1, temp);
                }
            }
        }

        return sortedList;
    }

    public ArrayList<Llamada> getLlamadasEntreFechas(Date init, Date end){
        ArrayList<Llamada> listaDeLlamadas = new ArrayList<>();
        for (Llamada unaLlamada : llamadasRealizadas){
            if(unaLlamada.getFecha().after(init) &&
                    unaLlamada.getFecha().before(end)){
                listaDeLlamadas.add(unaLlamada);
            }
        }
        return listaDeLlamadas;
    }

    public double consumoRealizadoEntreFechas(Date init, Date end){
        ArrayList<Llamada> llamadasAptas = getLlamadasEntreFechas(init, end);
        double totalCost = 0;
        for (Llamada unaLlamada : llamadasAptas){
            totalCost += cashier.tarifarLlamada(unaLlamada);
        }
        return totalCost;

    }

    public ArrayList<Llamada> getLlamadasRealizadas(){
        return llamadasRealizadas;
    }



}
