package RecuperatorioParcial1.Ejercicio1;

/**
 * Created by DiegoMancini on 30/11/16.
 */
public class Enun {

    public static void main(String[] args) {

        System.out.println("El famoso juego PACMAN esta conformado por el PACMAN, pildoras pequeñas y grandes , frutas y fantasmas. \n" +
                "Cuando comienza el juego, el jugador posee 3 vidas y un score de 0 puntos. \n" +
                "El juego esta conformado por un tablero con casilleros donde cada casillero puede contener 1 pildora, \n" +
                "1 fantasma , 1 fruta o nada. las interacciones de PACMAN con cada casillero determinan si suma puntos, pierde vidas, o nada. \n" +
                "\n" +
                "*** REGLAS: \n" +
                "   * 50 puntos cuando consume pildoras pequeñas\n" +
                "   * 100 puntos cuando consume pildoras grandes \n" +
                "   * 150 puntos cuando consume una fruta \n" +
                "   * 200 puntos cuando se come un fantasma en estado ''comible'' \n" +
                "   * Pierde una vida cuando el PACMAN es comido por un fantasma \n" +
                "   * Cuando el PACMAN consume una pildora grande, los fantasmas pueden ser comidos por el lapso de 30 casilleros. De ser comidos \n" +
                "     vuelven a la jaula donde esperan para salir. Los 6 fantasmas comienzan el juego en la jaula y salen cada 10 casilleros \n" +
                "\n" +
                "*** RESOLVERS: \n" +
                "   a) Movimientos de PACMAN: comienza en la celda que el juego decida y debe poder moverse hacia arriba, abajo, derecha o izquierda. \n" +
                "      Lo mismo con los fantasmas. Si no hay celda en la direccion a moverse, no puede hacer el movimiento. \n" +
                "   b) Mostrar puntuacion final del juego. \n" +
                "   c) Estado de los fantasmas cuando PACMAN come las pildoras grandes, tanto el cambio de estado de los fantasmas como la interaccion PACMAN - fantasmas.");

    }

}
