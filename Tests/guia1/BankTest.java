package guia1;

import org.junit.Assert;
import org.junit.Test;

public class BankTest {
    @Test
    public void evaluatesCBU(){
        BankAccount cuenta = new BankAccount(1233455);
        Assert.assertEquals(1233455, cuenta.getCBU());
    }

    @Test
    public void evaluatesDeposit(){
        BankAccount cuenta = new BankAccount(1233455);
        Assert.assertEquals(0, cuenta.getBalance(),0);
        cuenta.deposit(100);
        Assert.assertEquals(100.0, cuenta.getBalance(),0);
    }

    @Test
    public void evaluatesWithdraw(){
        BankAccount cuenta = new BankAccount(1233455);
        cuenta.deposit(100);
        cuenta.withdraw(20);
        Assert.assertEquals(80, cuenta.getBalance(),0);
    }

    @Test
    public void evaluatesEquals(){
        BankAccount cuenta1 = new BankAccount(1233455);
        cuenta1.deposit(100);
        BankAccount cuenta2 = new BankAccount(1233455);
        cuenta2.deposit(100);
        assert cuenta1.equals(cuenta2);
    }
}
