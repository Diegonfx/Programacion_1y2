package FinalDiciembre.Ejercicio1;

/**
 * Created by DiegoMancini on 22/2/17.
 */

public class Enun1 {

    public static void main(String[] args) {
        System.out.println("En el estudio de abogados LALEY se manejan todo tipo de casos. Los casos estan en alguna de estas \n" +
                "tres instancias: Extra judicial, mediacion o Juicio. \n" +
                "Cada caso conoce al abogado responsable del mismo, a las personas involucradas, el codigo del mismo, y la caratula. \n" +
                "Solo en las mediaciones y juicios ademas, hay reuniones programadas de asistencia obligatoria \n" +
                "que se llaman audiencias. TIenen una fecha, hora y lugar de asistencia. \n" +
                "Puntos: \n" +
                "a) Los casos se cierran en algun momento y luego de eso, un extra judicial puede pasar a mediacion y una mediacion a juicio. \n" +
                "Se pide representar este comportamiento para los casos cerrados. \n" +
                "b) Al final de cada mes, LALEY paga honorarios a sus abogados de acuerdo a los casos que lleva adelante. Por cada caso extra judicial, paga $1000 , \n" +
                "por cada mediacion paga $2000 , y por cada juicio paga $5000. Ademas, por cada audiencia se paga un plus de $150 y por cada caso cerrado del mes, \n" +
                "un extra de $2000. Modelar esta liquidacion de honorarios. \n" +
                "c) Se pide armar un reporte que sea una lista ordenada por fecha de ingreso del caso de: Caratula, honorarios hasta el momento. \n" +
                "d) Se desea permitir el filtrado de los casos de acuerdo a cualquier criterio.");
    }

    /*

    COMENTARIOS:

    Ej1 - Un caso siempre es un caso y puede estar en una instancia a la vez, es mas factible modelar la instancia como un estado del caso.
          Muchas responsabilidades asignadas a la clase LaLey. Podria haber un liquidador, tarifadores, relaciones de conocimiento bidireccionales
          (por ej un abogado conocer sus casos activos). Siempre con el fin de tener código más mantenible e independiente.
          Faltaron modelar objetos como el tipo de codigo al que pertenece el caso.

     */

}
