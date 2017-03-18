package guia3;

import org.junit.Test;


public class CheckingAccountTest {
    @Test
    public void depositCheck(){
        CheckingAccount cuentaCorriente = new CheckingAccount(1212, 100);
        Check ceque = new Check(100);
        try {
            cuentaCorriente.depositCheck(ceque);
        }catch(Exception e){

        }
        assertEquals(100.0, cuentaCorriente.getBalance(),0.1);
    }

    @Test
    public void issueCheck() {
        CheckingAccount cuentaCorriente = new CheckingAccount(1212, 100);
        cuentaCorriente.deposit(200);
        try {
            Check ceque = cuentaCorriente.issueCheck(150);
            assertEquals(150, ceque.getValue());
        }catch(Exception e){}
    }



}