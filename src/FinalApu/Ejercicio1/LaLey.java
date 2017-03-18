package FinalApu.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by agustin on 16/12/16.
 */
public class LaLey {

    private ArrayList<Caso> casos;
    private ArrayList<Abogado> abogados;

    public LaLey(ArrayList<Caso> casos, ArrayList<Abogado> abogados) {
        this.casos = casos;
        this.abogados = abogados;
    }

    public void realizarAudiencia(Caso unCaso , Date fecha, int hora, String lugar){
        if(casos.contains(unCaso)){
            unCaso.realizarAudiencia(fecha,hora,lugar);
        }
        throw new RuntimeException("LaLey no tiene este caso");
    }

    public void agregarNuevoCaso(Caso unCaso){
        casos.add(unCaso);
    }

    public void addNewAbogado(Abogado unAbogado){
        abogados.add(unAbogado);
    }

    public ArrayList<Caso> filtrarCasos(CriterioDeFiltro<Caso> objeto){
        ArrayList<Caso> cumpleCriterio = new ArrayList<>();

        for (Caso unCaso : casos){
            if(objeto.aplicarFiltro(unCaso))
                cumpleCriterio.add(unCaso);

        }
        return cumpleCriterio;
    }

    public double honorariosAPagarDelMes(Abogado unAbogado){
        if(! abogados.contains(unAbogado)){
            throw new RuntimeException("Abogado no esta registado en LaLey");
        }
        ArrayList<Caso> casosEnElQueTrabaja = casosEnElQueParticipaElAbogado(unAbogado);
        double precioAPagar = 0;

        for (Caso unCaso : casosEnElQueTrabaja){
            if(unCaso.sigueAbierto()){
                precioAPagar += unCaso.precioPorMes() + ganaciaDeAudiencias(unCaso);
            }
            else if(unCaso.cerroEspteMes()){
                precioAPagar += 2000 + ganaciaDeAudiencias(unCaso);
            }
        }
        return precioAPagar;
    }

    public String generarReporteOrdenado(){
        Comparator<Caso> criterioDeSort = new OrdenarCasosPorFechaDeIngreso();
        sortCasos(criterioDeSort);
        String report = "";
        for (Caso unCaso : casos){
            report += "Caratula: "+ unCaso.getCaratula() + "\n";
            report += "Honorarios del caso: " + honorariosDelCasoHastaElMomento(unCaso) +
                    "\n \n";
        }
        return report;
    }

    public double honorariosDelCasoHastaElMomento(Caso unCaso){
        double total = unCaso.getAudiencias().size() * 150;
        if(! unCaso.sigueAbierto()){
            total += 2000;
        }
        total += unCaso.precioPorMes(); // No se como saber cuantos meses pasaron
        return total;
    }

    private double ganaciaDeAudiencias(Caso unCaso){
        double ganacia = 0;
        if (unCaso.puedeRealizarAudiencias()){
            for (Audiencia unaAudiencia : unCaso.getAudiencias()){
                if(unaAudiencia.audienciaSeRealizoEsteMes())
                    ganacia += 150;

            }
        }
        return ganacia;
    }

    public ArrayList<Caso> casosEnElQueParticipaElAbogado(Abogado unAbogado){
        ArrayList<Caso> listaDeCasos = new ArrayList<>();
        for (Caso unCaso : casos){
            if (unCaso.getAbogadoResponsable().equals(unAbogado))
                listaDeCasos.add(unCaso);
        }
        return listaDeCasos;
    }

    private void sortCasos(Comparator<Caso> unCriterio){
        Collections.sort(casos, unCriterio);
    }


}
