package guia4;

import guia3.Account;
import guia3.CheckingAccount;
import guia3.SavingsAccount;
import guia3.SpecialAccount;
import org.junit.Test;


public class BancoTest {

    @Test
    public void evaluatesGetBalance(){
        SavingsAccount cuenta1 = new SavingsAccount(001);
        cuenta1.deposit(200);
        CheckingAccount cuenta2 = new CheckingAccount(002, 50);
        cuenta2.deposit(150);
        SpecialAccount cuenta3 = new SpecialAccount(003);
        cuenta3.deposit(100);

        Account[] cuentas = {cuenta1,cuenta2,cuenta3};
        Banco unBanco = new Banco(cuentas);

        assertEquals(200, unBanco.getBalance(001), 0.1);
        assertEquals(100, unBanco.getBalance(003), 0.1);
        assertEquals(0, unBanco.getBalance(111), 0.1);
    }

    @Test
    public void evaluatesTransaction(){
        SavingsAccount cuenta1 = new SavingsAccount(001);
        cuenta1.deposit(200);
        CheckingAccount cuenta2 = new CheckingAccount(002, 50);
        cuenta2.deposit(150);
        SpecialAccount cuenta3 = new SpecialAccount(003);

        Account[] cuentas = {cuenta1,cuenta2,cuenta3};
        Banco unBanco = new Banco(cuentas);

        unBanco.transaction(001,003, 100);
        assertEquals(100, unBanco.getBalance(001), 0.1);
        assertEquals(100, unBanco.getBalance(003), 0.1);
    }

    @Test
    public void evaluatesWithdraw(){
        SavingsAccount cuenta1 = new SavingsAccount(001);
        cuenta1.deposit(200);
        CheckingAccount cuenta2 = new CheckingAccount(002, 50);
        cuenta2.deposit(150);

        Account[] cuentas = {cuenta1,cuenta2};
        Banco unBanco = new Banco(cuentas);
        try {
            unBanco.withdrawFrom(001, 220);
        }catch(Exception e){
            assert true;
        }

       try{
           unBanco.withdrawFrom(002,170);
       }catch (Exception e){}

        assertEquals(-20, unBanco.getBalance(002),0.1);
    }



}