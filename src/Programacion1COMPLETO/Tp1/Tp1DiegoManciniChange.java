package Programacion1COMPLETO.Tp1;

/**
 * Created by DiegoMancini on 8/6/16.
 */
public class Tp1DiegoManciniChange {
    public static void main(String[] args) {
        double a = Scanner.getDouble("Inserte el valor del producto = ");
        double b = Scanner.getDouble("Inserte el valor de dinero dado = ");
        if ((b < 0) || (a < 0)) {
            System.out.println("Inserte un valor valido");
            double a1 = Scanner.getDouble("Inserte el valor del producto = ");
            double b1 = Scanner.getDouble("Inserte el valor del dinero dado = ");
        } else {
            double vueltoPesos = (b-a);
            int vueltoPesos1 = (int) vueltoPesos;
            double vueltoCents = ((vueltoPesos - vueltoPesos1) * 100);
            int vueltoCents1 = (int) vueltoCents;
            System.out.println("Su vuelto es: ");
            System.out.println("------------->");
            System.out.println("Pesos: " + vueltoPesos1);
            System.out.println("Cents: " + vueltoCents1);
        }
    }
}
