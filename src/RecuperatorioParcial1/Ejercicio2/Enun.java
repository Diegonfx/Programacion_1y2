package RecuperatorioParcial1.Ejercicio2;

/**
 * Created by DiegoMancini on 30/11/16.
 */
public class Enun {

    public static void main(String[] args) {
        System.out.println("Se cuenta con la necesidad de modelar un deposito de contenedores en un puerto." +
                "\n Para ello se pide modelar una clase ContainerDepot que se inicialize con su tamaño en X e Y , " +
                "\n que representan la cantidad de pilas de containers con las que cuentan, " +
                "\n y un valor de cantidad maxima de containers apilados permitidos (maximumStackedContainers." +
                "\n\n Se cuenta con el modelo ya realizado para los containers: " +
                "\n\n public class Container{ +" +
                "\n         private ArrayList<Article> articles" +
                "\n         private double maxWeightSupported;" +
                "\n\n       Article contiene:"  +
                "\n         private String description;" +
                "\n         private String clientCode;" +
                "\n         private double weight; " +
                "\n\n       //Constructor y getters //" +
                "\n }" +
                "\n\n Se pide: " +
                "\n 1) Modelar el ContainerDepot para que tenga los sig mensajes:" +
                "\n ContainerDepot depot = new ContainerDepot(5 , 10 , 3) // 5 filas, 10 posiciones , 3 niveles apilamiento max" +
                "\n depot.put(1 , 2 , containerA)" +
                "\n depot.contains(containerA) // return true o false" +
                "\n depot.remove(containerA)" +
                "\n 2) Implementar 'depot.log()' que muestra por consola el estado del depot." +
                "\n 3) Implementar 'depot.move(containerA , 2 , 3)' que debe pemmitir mover un container que ya este en el deposito, " +
                "\n    actualizando la posicion de los que estuviesen arriba de el previamente.  ");
    }

}
