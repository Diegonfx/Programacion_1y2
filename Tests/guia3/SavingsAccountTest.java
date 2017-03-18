package guia3;

import org.junit.Test;

public class SavingsAccountTest {

    @Test
    public void evaluatesDepositCheck(){
        SavingsAccount cajaAhorro = new SavingsAccount(1212);
        Check ceque = new Check(100);
        try {
            cajaAhorro.depositCheck(ceque);
        }catch(Exception e){

        }
        assertEquals(100.0, cajaAhorro.getBalance(),0.1);
    }

    @Test
    public void getCbu(){
        SavingsAccount cajaAhorro = new SavingsAccount(1212);
        assertEquals(1212, cajaAhorro.getCbu());
    }


}