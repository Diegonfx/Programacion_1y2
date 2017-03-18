package FinalDiciembre.Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class TheLaw {

    private ArrayList<Lawyer> lawyers;
    private ArrayList<Case> casesWorkingOn;
    private Cashier cashier;

    public TheLaw(ArrayList<Lawyer> lawyers, ArrayList<Case> casesWorkingOn, Cashier cashier) {
        this.lawyers = lawyers;
        this.casesWorkingOn = casesWorkingOn;
        this.cashier = cashier;
    }

    public ArrayList<Lawyer> getLawyers() {
        return lawyers;
    }
    public ArrayList<Case> getCasesWorkingOn() {
        return casesWorkingOn;
    }
    public Cashier getCashier() {
        return cashier;
    }

    public void askForAHearing(Case anyCase, Date anyDate, int hour , String place) {
        if (anyCase.isMediacion() || anyCase.isJudicial()) {
            Hearing theNextHearing = new Hearing(anyDate , hour , place)    ;
            anyCase.addHearing(theNextHearing);
        }
    }
    public void addLawyer(Lawyer anyLawyer) {lawyers.add(anyLawyer);}
    public void addCase(Case anyCase){casesWorkingOn.add(anyCase);}
    public ArrayList<Case> filterCases(CriterioDeFiltro<Case> cases) {
        ArrayList<Case> cumpleCriterio = new ArrayList<>();

        for (Case unCaso : casesWorkingOn){
            if(cases.aplicarFiltro(unCaso))
                cumpleCriterio.add(unCaso);

        }
        return cumpleCriterio;
    }
    public String generateReport(){
        Comparator<Case> criterioDeSort = new OrdenarCasosPorFechaDeIngreso();
        sortCasos(criterioDeSort);
        String report = "";
        for (Case unCaso : casesWorkingOn){
            report += "Caratula: "+ unCaso.getCaratula() + "\n";
            report += "Honorarios del caso: " + getCashier().getPricePerMonth(unCaso)+
                    "\n \n";
        }
        return report;
    }
    private void sortCasos(Comparator<Case> unCriterio){
        Collections.sort(casesWorkingOn, unCriterio);
    }


}
