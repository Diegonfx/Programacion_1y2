package guia3;


import org.junit.Test;

public class BooleanTest {

    @Test
    public void evaluatesAnd(){
        Boolean aTrue1 = new Boolean(true);
        Boolean aTrue2 = new Boolean(true);

        assert aTrue1.and(aTrue2);
    }

    @Test
    public void evaluatesOr(){
        Boolean aTrue = new Boolean(true);
        Boolean aFalse = new Boolean(false);

        assert aTrue.or(aFalse);
    }

    @Test
    public void evaluatesNot(){
        Boolean aFalse = new Boolean(false);
        aFalse.not();
        assert aFalse.getValue();
    }




}
