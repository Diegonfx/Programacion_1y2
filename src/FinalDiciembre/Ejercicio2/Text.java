package FinalDiciembre.Ejercicio2;

/**
 * Created by DiegoMancini on 24/2/17.
 */
public class Text {

    /*

         APU:

        1) Una clase abstract puede tener variables de instancia, metodos de instancia ya desarrollados, y definir un constructor.
        Estas tres cosas no son posible en una interfaz. Por el otro lado, una clase de java puede implementar todos los interfaces que quiera, pero solo puede extender de una clase abstacta.

        2) Polimorfismo es el hecho en el cual dos o mas objetos responden a un mismo mensaje con metodos distintos .
        Es utilizado cuando objetos se subclasifican segun su comportamiento, como tambien en el uso de interfaces en el cual son obligados a responder a cierto comportamiento.

        3) Cuando uno programa bajo el paradigma orientado a objetos, busca reprentar la realidad apartir del desarrollo de clases,
        y luego creacion de objetos que representan entes de la realidad.
        Otra teoria para organizar conocimiento es construyendo de lo concreto, ideas se forman apartir de prototipos.
        Estas dos formas de organizar conocimiento caen bajo el paradigma orientado a objetos.
        En este paradigma to do debe ser un objeto, y los objetos interactuan entre si apartir de mensajes.

       4) Las diferencias que se pueden encontrar es que por un lado this siempre hace referencia al objeto receptor,
       mientras que super no tiene ninguna relacion con el objeto receptor y simplemente busca en la clase padre.
       La semejanza que se puede encontrar es que ambos se asocian al contexto donde se ejecuta el mensaje.

       5) El uso de null puede ser ineficiente ya que al usarlo hay que cuidarse de la posibilidad de un objeto null,
       el cual provoca el uso de reiterados ‘if’s o encontrarme con un NullPointerException.
       El uso de setters no es recomendable ya que el cambio de un estado puede implicar otros cambios en el objeto,
       y al usar setters estoy obviando los otros cambios que son importante para la cooherencia del objeto.

       ITU:
       1.	Diferencias entre clase abstracta e interfaz:
Una interfaz tiene como característica principal que todos sus métodos son abstractos (son métodos declarados, pero no tienen comportamiento). Esto conlleva a que cuando una clase implemente una interfaz, esta está obligada a tener todos los métodos de la interfaz dentro, dándole un comportamiento a cada una. En cambio, la clase abstracta no está obligada a tener todos sus métodos abstractos, entonces la subclase no está obligada a tenerlos dentro ni a darle un comportamiento.
Otra diferencia es que una clase puede implementar cuantas interfaces quiera, mientras que solo puede tener una superclase.
Una similitud entre ambas es que ambas pueden ser utilizadas para implementar polimorfismo.

2.	Polimorfismo (Que es y para qué sirve):
El polimorfismo describe un patrón en OOP en donde dos clases diferentes comparten uno o más mensajes con el mismo nombre, pero cada clase la utiliza con un comportamiento diferente.
Se utiliza para programar objetos con características comunes y que todos compartan esas características, mientas que cada una le da un uso diferente. (Ej.: un botón).

3.	¿Qué es lo que se busca al programar bajo OOP?:
Al programar bajo el paradigma de OOP, se busca acercarse a la realidad, ya que bajo este paradigma definimos a un ente de la realidad como un objeto, siendo su concepto la clase que lo crea. Cada variable de instancia sería una propiedad o una característica del ente, mientras que los métodos serían las funciones o los comportamientos de este.

4.	¿Cuáles son las diferencias y semejanzas entre this y super?:
La diferencia principal seria que this busca el método en la clase que genero al objeto, mientras que super busca el método en la superclase de la clase que genero al objeto.
Las semejanzas más importantes entre this y super serían: primero, aunque una busca en la clase y la otra lo busca en la superclase, ambas toman como contexto el objeto donde están parados (donde se ejecuta el mensaje). Segundo, es que ambas son consideradas pseudo-variables.

5.	¿Hay inconvenientes con el uso de null y de setters?:
Se considera como ineficiente el uso de null, ya que al utilizarlo no solo provoca el uso de reiterados if’s, sino que también lleva a tener que tener mucho cuidado a la hora de utilizar el objeto que tiene el null ya que podría llevar a un NullPointerException.
El uso de setters tampoco es recomendable, ya que el cambio de un estado dentro del objeto puede llevar a generar otros cambios no deseados dentro del objeto. El uso de setters lleva a la obviacion de cambios importantes dentro del objeto que son necesarios para la coherencia del mismo.

6.	Collections:
Una Collection es todo aquello que se puede recorrer (o “iterar”) y de lo que se puede saber el tamaño. Muchas otras clases extenderán Collection imponiendo más restricciones y dando más funcionalidades. Es de notar que el requisito de “que se sepa el tamaño” hace inconveniente utilizar estas clases con colecciones de objetos de las que no se sepa “a priori” la cantidad.
List: Un List, o simplemente lista, es una Collection. La diferencia que tiene una lista con una Collection es que la lista mantiene un orden arbitrario de los elementos y permite acceder a los elementos por orden. Podríamos decir que, en una lista, por lo general, el orden es dato. Es decir, el orden es información importante que la lista también nos está almacenando. ArrayList: La ventaja de ArrayList por sobre un array común es que es expansible, es decir que crece a medida que se le añaden elementos (mientras que el tamaño de un array es fijo desde su creación). Lo bueno es que el tiempo de acceso a un elemento en particular es ínfimo. Lo malo es que, si queremos eliminar un elemento del principio, o del medio, la clase debe mover todos los que le siguen a la posición anterior, para “tapar” el agujero que deja el elemento removido. Esto hace que sacar elementos del medio o del principio sea costoso.
Map: Un Map representa lo que en otros lenguajes se conoce como “diccionario” y que se suele asociar a la idea de “tabla hash” (aunque no se implemente necesariamente con esa técnica). Un Map es un conjunto de valores, con el detalle de que cada uno de estos valores tiene un objeto extra asociado. A los primeros se los llama “claves” o “keys”, ya que nos permiten acceder a los segundos.

7.	Diferencia entre Comparable y Comparator
La diferencia principal entre Comparable y Comparator es que Comparable es utilizado para implementar el orden natural, sin necesidad de especificar un Comparator, por ejemplo, los String son comparados alfabéticamente. Usamos Comparator cuando queramos crear otro tipo de orden que no sea el natural.
El contrato que implica implementar Comparable requiere de un parámetro extra, el objeto con el que comparar compareTo(obj1) de forma que la comparación se realizará del objeto en si (this) con el objeto pasado como parámetro. Comparator, sin embargo, obliga a implementar el método compare (obj1, obj2) de forma que los dos objetos a comparar son pasados como parámetros y el objeto que implementa el método compare simplemente sirve de apoyo a la comparación.

8.	Diferencias entre Iterable e Iterator:
Iterable indica que se trata de una colección o serie sobre la que se puede iterar. Obliga a disponer de un método que permita crear un objeto de tipo Iterator que permita recorrer la colección. Un Iterator es el objeto que permite recorrer la colección y que proporciona los métodos hasNext() y next(). Un Iterable sería lo que permite producir un Iterator, y un Iterator lo que permite recorrer una colección.



9.	Método LookUp:
Este método se activa cuando se envía un mensaje. Su función consiste en buscar el método en la clase que genero el objeto que envió el mensaje. En caso de no encontrar el método en la clase, pasa a buscarlo en la superclase, y si no lo encuentra ahí pasa a buscarlo en la superclase de la superclase, y así sucesivamente hasta que lo encuentre. Una vez encontrado el método lo ejecuta en el contexto del objeto emisor del mensaje.

10.	Generics:
Los métodos genéricos y las clases genéricas permiten programar distintos tipos de métodos o clases con solo una declaración de los mismos. También nos proveen de seguridad durante el tiempo de compilación, ya que permite evitar el uso de tipos(variables) erróneos en este tiempo. Generics nos permite, por ejemplo, crear una clase que utiliza un ArrayList de T (variable genérica), y luego cuando creamos el objeto podemos transformar esa T en cualquier otra variable que queramos.



     */

}
