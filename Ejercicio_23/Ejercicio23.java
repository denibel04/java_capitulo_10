package Ejercicio_23;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 23: En ajedrez, el valor de las piezas se mide en peones. Una dama vale 9 peones, una torre 5 peones, un alfil 3, un caballo 2 y un péon
 * vale, lógicamente, 1 peón. Realiza un programa que genere al azar las capturas que ha hecho un jugador durante una partida. El número de capturas
 * será un valor aleatorio entre 0 y 15. Hay que tener en cuenta que cada jugador tiene la posibilidad de capturar algunas de las siguientes piezas
 * (no más): 1 dama, 2 torres, 2 alfiles, 2 caballos y 8 peones. Al final debe aparecer la puntuación total.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main (String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Figura("Dama", 9, 1));
        figuras.add(new Figura("Torre", 5, 2));
        figuras.add(new Figura("Alfil", 3, 2));
        figuras.add(new Figura("Caballo", 2, 2));
        figuras.add(new Figura("Peón", 1, 8));

        int numCapturas = (int)(Math.random()*16);
        int total = 0;

        for (int i = 0; i<numCapturas;) {
            Figura aux = figuras.get((int)(Math.random()*figuras.size()));
            if (aux.numCapturable>0) {
                aux.captura();
                total += aux.valor;
                i++;
            }
        }
        System.out.println("Puntos totales: " + total);
    }
}
