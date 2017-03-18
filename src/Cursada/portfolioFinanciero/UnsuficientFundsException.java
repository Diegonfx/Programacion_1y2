package Cursada.portfolioFinanciero;

/**
 * Created by agustin on 14/9/16.
 */
public class UnsuficientFundsException extends RuntimeException {
    public UnsuficientFundsException(){
        super();
    }

    public UnsuficientFundsException(String msg){
        super(msg);
    }

}
