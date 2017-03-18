package guia3;

import org.junit.Test;

public class CheckTest {

    @Test
    public void evaluatesUsedCheck(){
        SavingsAccount cajaAhorro = new SavingsAccount(1001);
        Check ceque = new Check(100);
        try {
            cajaAhorro.depositCheck(ceque);
        }catch(Exception e){
        }

        SavingsAccount cuenta2 = new SavingsAccount(1002);
        try{
            cuenta2.depositCheck(ceque);
        }catch(Exception e){
            assert true;
        }
    }

    @Test
    public void evaluatesIsValid(){
        SavingsAccount cajaAhorro = new SavingsAccount(1001);
        Check ceque = new Check(100);
        try {
            cajaAhorro.depositCheck(ceque);
        }catch (Exception e){}

        assert !ceque.isValid();
    }

}