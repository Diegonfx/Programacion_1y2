package Cursada.guia2;

import guia1.BankAccount;

public class Bank {

    private BankAccount[] cuentas;

    public Bank(BankAccount[] unasCuentas) {
        cuentas = unasCuentas;
    }

    public void transaction(int cbuEmisor, int cbuReceptor, int cantidad) {
        int indiceEmisor = indexOfCbu(cbuEmisor);
        int indiceReceptor = indexOfCbu(cbuReceptor);

        if (indiceEmisor != -1 && indiceReceptor != -1) { // Se comprueba que los cbu existen
            cuentas[indiceEmisor].withdraw(cantidad);
            cuentas[indiceReceptor].deposit(cantidad);
        }
    }

    public float getBalance(int cbu){
        int indiceDeCuenta = indexOfCbu(cbu);
        return cuentas[indiceDeCuenta].getBalance();
    }

    /**
     * Devuelve el indice de la cuenta que tiene el cbu ingresado
     * Si no se encuentra devuelve -1
     * @param cbu
     * @return
     */
    private int indexOfCbu(int cbu) {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i].getCBU() == cbu) {
                return i;
            }
        }
        return -1;
    }


}