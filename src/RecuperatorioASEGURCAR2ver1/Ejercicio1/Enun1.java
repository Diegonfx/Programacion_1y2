package RecuperatorioASEGURCAR2ver1.Ejercicio1;

/**
 * Created by DiegoMancini on 17/2/17.
 */
public class Enun1 {

    public static void main(String[] args) {
        System.out.println("En el contexto de una empresa aseguradora de vehículos denominada AsegurCar se desea modelar el sistema de asignación de descuentos y bonificaciones a sus clientes.\n" +
                "La empresa cuenta con clientes que pueden tener más de un vehículo asegurado.\n" +
                "Los vehículos tienen contratos de pólizas de seguro dentro de un rango de tiempo, siempre habiendo solo un contrato vigente en un momento dado, y al presente sistema a modelar solamente le interesa los vigentes. \n El precio mensual de las pólizas es de 1% del valor de mercado del vehículo para Contra Terceros (CT) y del 2% Contra Todo Riesgo (CR).\n" +
                "Ej: si el vehículo vale $100.000: CT sale $1000 x mes y CR sale $2000 x mes (siempre antes de aplicar beneficios y descuentos).\n" +
                "\n Por cada póliza se cuenta con:\n" +
                "1. Calificación del estado de deterioro del vehículo (de 0 a 100), por parte de AsegurCar. 0\n" +
                "equivale a un 0KM y 100 a destrucción total. El rango es un porcentaje de deterioro.\n" +
                "2. El cliente elige el tiempo de contratación (6 meses, 1 año, 2 años o indeterminado).\n" +
                "3. El cliente elige el Tipo de Seguro (Contra Terceros, Contra todo Riesgo).\n" +
                "\n Además se conoce el año de fabricación del vehículo.\n" +
                "Se realizan periódicamente controles sobre el vehículo, cada 6 meses, si se falta al control se pierden los beneficios. En cada control se vuelve a calificar el deterioro y a reevaluar los beneficios.\n" +
                "Se cuenta con los siguientes beneficios a otorgar:\n" +
                "1. Si el cliente elige contratar por 2 o más años y el deterioro es menor al 20% se bonifican\n" +
                "los primeros 2 meses del contrato (solo una vez, no en cada control). Este beneficio se evalúa para cada vehículo del cliente, es decir, si un cliente tiene 3 vehículos y 2 aplican a este beneficio, \n se le descuentan 2 meses de cada póliza de esos vehículos.\n" +
                "2. Si el tipo de seguro es contra todo riesgo para todos los vehículos de un cliente, y el cliente posee más de 1 vehículo, se le descuenta 10% por mes.\n" +
                "\n Se pide:\n" +
                "1. Modelar el otorgamiento de beneficios y descuentos.\n" +
                "2. Incorporar los controles periódicos.\n" +
                "3. Adicionar al sistema la posibilidad de que emita un detalle de lo que se debe facturar a\n" +
                "cada cliente.");
    }

}
