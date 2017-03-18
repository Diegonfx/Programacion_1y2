package Parcial2.ejercicio1;

/**
 * Created by DiegoMancini on 30/11/16.
 */
public class Enun {

    public static void main(String[] args) {
        System.out.println("Se desea modelar el sistema de entregas de MecardoGroso (MG), una tienda e-commerce de múltiples tipos de artículos.\n" +
                "El sistema de entregas está compuesto por 3 tipos de vehículos:\n" +
                "1)\tCamiones, que transportan paquetes de más de 10 kg\n" +
                "2)\tFletes, que transportan paquetes de más de 1kg y hasta 10 kg.\n" +
                "3)\tMotos, que transportan paquetes de hasta 1 kg.\n" +
                "Por un tema de costos, los camiones no transportan paquetes de peso inferior a 10 kg y los fletes tampoco lo hacen para paquetes de peso inferior a 1kg. \n" +
                "\n" +
                "Los clientes hacen pedidos de artículos a MG via el código correspondiente de lo que desean. \n" +
                "Cuando hacen el pedido, MG genera la orden de entrega del mismo armando un paquete con el artículo. \n Los paquetes conocen el dni del cliente, el artículo y el código postal del cliente. El peso del paquete es de 300 gramos más el peso del artículo.\n" +
                "\n" +
                "A)\tAl comienzo del día, un operador de MG carga los vehículos con los pedidos realizados. Luego de terminar esta tarea, cada vehículo está cargado listo para entregar\n" +
                "B)\tComo sólo concoe el CP y el dni de cada paquete, el vehículo debe recorrer a todas las personas del área con CP igual al paquete hasta encontrar una que le muestre el dni correspondiente al pedido.\n" +
                "C)\tCuando la persona es el cliente que solicitó el pedido, puede aceptar o rechazarlo de acuerdo a si es el item que pidió o no de acuerdo a los códigos de los mismos. \n Si lo acepta, se queda con el paquete y el operador genera un comprobante de entrega. Si lo rechaza, el paquete vuelve al vehículo y el operador genera una orden de rechazo\n");
    }

}
