package guia2;

import guia1.BankAccount;
import org.junit.Test;


public class BankTest {

    @Test
    public void evaluatesTransaction(){
        BankAccount[] cuentas = new BankAccount[4];
        cuentas[0] = new BankAccount(0001);
        cuentas[0].deposit(100);

        cuentas[1] = new BankAccount(0002);
        cuentas[1].deposit(200);

        cuentas[2] = new BankAccount(0003);
        cuentas[2].deposit(50);

        cuentas[3] = new BankAccount(0004);
        cuentas[3].deposit(200);

        Bank banco = new Bank(cuentas);
        banco.transaction(0001, 0004, 20);

        assertEquals(80, banco.getBalance(0001),0);
        assertEquals(220, banco.getBalance(0004),0);
    }
}
