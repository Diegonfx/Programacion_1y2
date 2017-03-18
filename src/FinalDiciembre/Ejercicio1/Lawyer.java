package FinalDiciembre.Ejercicio1;

import java.util.ArrayList;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class Lawyer {

    private String name;
    private int dni;
    private double bankAccount;
    private ArrayList<Case> cases;

    public Lawyer(String name, int dni, double bankAccount) {
        this.name = name;
        this.dni = dni;
        this.bankAccount = bankAccount;
        cases = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void addMoneyToBankAccount(double money) {
        bankAccount += money;
    }

    public ArrayList<Case> getCases() {
        return cases;
    }

    public void addCase(Case aCase) {
        cases.add(aCase);
    }
}
