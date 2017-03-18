package RecuperatorioASEGURCAR2ver1.Ejercicio1;

import Programacion1COMPLETO.Tp1.Scanner;

/**
 * Created by DiegoMancini on 23/2/17.
 */
public class AnalizadorDeDeterioro {

    public void analyzeVehicle(Vehiculo aVehicle) {
        String output = Scanner.getString("Analyze the car regarding variables");
        System.out.println("VEHICLE PRICE: " + aVehicle.getValor());
        System.out.println("VEHICLE YEAR: " + aVehicle.getAño());
        System.out.println("VEHICLE PREVIOUS STATUS: " + aVehicle.getEstado());
        int score = Scanner.getInt("Insert car status");
        aVehicle.setEstado(score);
    }

}
