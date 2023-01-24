package Ejercicio_09;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 9: Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros.
 * Cuando coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
import java.util.Collections;
public class Ejercicio09 {
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

        Collections.sort(baraja);

        for (Carta c : baraja) {
            System.out.println(c);
        }
    }
}
