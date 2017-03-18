package FinalDiciembre.Ejercicio1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Case {

    private Lawyer lawyer;
    private ArrayList<PersonsInvolved> personsInvolved;
    private String caratula;
    private int caseCode;
    private boolean caseIsClosed;
    private ArrayList<Hearing> hearings;
    private TypeOfCase aType;
    private Date initialDate;
    private Date finishingDate;


    public Case(Lawyer lawyer, ArrayList<PersonsInvolved> personsInvolved, String caratula, int caseCode, ArrayList<Hearing> hearings) {
        this.lawyer = lawyer;
        this.personsInvolved = personsInvolved;
        this.caratula = caratula;
        this.caseCode = caseCode;
        this.hearings = hearings;
        caseIsClosed = false;
        aType = new ExtraJudicial();
        initialDate = new Date();
    }

    public Lawyer getLawyer() {
        return lawyer;
    }
    public ArrayList<PersonsInvolved> getPersonsInvolved() {
        return personsInvolved;
    }
    public String getCaratula() {
        return caratula;
    }
    public int getCaseCode() {
        return caseCode;
    }
    public boolean isCaseIsClosed() {
        return caseIsClosed;
    }
    public ArrayList<Hearing> getHearings() {
        return hearings;
    }
    public TypeOfCase getaType() {
        return aType;
    }
    public void addHearing(Hearing aHearing) {hearings.add(aHearing);}
    public boolean closedThisMonth(){
        if(caseIsClosed){
            return !oneMonthHasPassed(finishingDate);
        }
        return false;
    }
    public Date getInitialDate() {
        return initialDate;
    }
    public Date getFinishingDate() {
        return finishingDate;
    }

    public void setaType(TypeOfCase aType) {
        this.aType = aType;
    }
    public boolean isExtraJudicial() {
        return aType.isExtraJudicial();
    }
    public boolean isMediacion() {
        return aType.isMediacion();
    }
    public boolean isJudicial() {
        return aType.isJudicial();
    }
    public void goMediacion() {
        aType.goMediacion(this);
    }
    public void goJuicio(Case aCase) {
        aType.goJuicio(this);
    }
    public void openCase(){caseIsClosed = false;}
    public void closeCase(){caseIsClosed = true; finishingDate = new Date();}

    private boolean oneMonthHasPassed(Date aDate){
        Calendar cal = Calendar.getInstance();
        cal.setTime(aDate);
        cal.add(Calendar.MONTH, 1);
        Date oneMonthLater = cal.getTime();

        Date currentDate = new Date(); // current date
        return currentDate.after(oneMonthLater);
    }

}
