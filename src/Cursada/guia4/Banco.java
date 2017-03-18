package Cursada.guia4;
import guia3.Account;

public class Banco {

    private Account[] cuentasDelBanco;

    public Banco(Account[] unasCuentasDelBanco){
        cuentasDelBanco = unasCuentasDelBanco;
    }


    public void transaction(int cbuEmisor, int cbuReceptor, int cantidad) {
        int indiceEmisor = indexOfCbu(cbuEmisor);
        int indiceReceptor = indexOfCbu(cbuReceptor);

        if (indiceEmisor != -1 && indiceReceptor != -1) { // Se comprueba que los cbu existen
            try {
                cuentasDelBanco[indiceEmisor].withdraw(cantidad);
            }catch(Exception e){}
            cuentasDelBanco[indiceReceptor].deposit(cantidad);
        }
    }

    public void withdrawFrom(int cbu, int amount)throws Exception{
        int indiceDeCuenta = indexOfCbu(cbu);
        if(indiceDeCuenta != -1) {
            cuentasDelBanco[indiceDeCuenta].withdraw(amount);
        }
    }

    public double getBalance(int cbu){
        if(indexOfCbu(cbu) != -1){
            return cuentasDelBanco[indexOfCbu(cbu)].getBalance();
        }
        return 0; // No se encontro la cuenta
    }

    private int indexOfCbu(int cbu) {
        for (int i = 0; i < cuentasDelBanco.length; i++) {
            if (cuentasDelBanco[i].getCbu() == cbu) {
                return i;
            }
        }
        return -1;
    }

}
