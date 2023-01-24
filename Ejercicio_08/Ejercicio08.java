package Ejercicio_08;
import java.util.ArrayList;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 8: Realiza un programa que escoja al azar 10 cartas de la baraja española (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList
 * para almacenarlas y asegúrate de que no se repite ninguna.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio08 {
    public static void main (String[] args) {
        ArrayList<Carta> baraja = new ArrayList<>();

        Carta aux = new Carta();
        baraja.add(aux);

        for (int i=1; i<10; i++) {
            do {
                aux = new Carta();
            } while (baraja.contains(aux));
            baraja.add(aux);
        }

        for (Carta c : baraja) {
            System.out.println(c);
        }
    }
}
