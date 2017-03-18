package Programacion1COMPLETO.Parcial;

/**
 * Created by DiegoMancini on 15/12/16.
 */
public class Ejercicio5 {

        public static void main(String[] args){

            int inkLevel=100; //Representa cantidad caracteres\
            Marker m= new Marker ("black" , inkLevel);
            System.out.println(m.isOpen()); //false
            m.open();
            System.out.println(m.isOpen()); //true
            m.write("Hola mundo"); //imprima y resta la tinta
            System.out.println(m.getInkLevel()); //90
    }

}
