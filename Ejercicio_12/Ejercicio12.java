package Ejercicio_12;
/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 12: Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que sume los puntos según el juego de la brisca.
 * El valor de las cartas se debe guardar en una estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). La secuencia
 * de cartas debe ser una estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor de las cartas es el siguiente: as → 11,
 * tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import Ejercicio_08.Carta;
import java.util.ArrayList;
import java.util.HashMap;
public class Ejercicio12 {
    public static void main (String[] args) {
        HashMap<String, Integer> puntuaje = new HashMap<>();
        puntuaje.put("as", 11);
        puntuaje.put("tres", 10);
        puntuaje.put("sota", 2);
        puntuaje.put("caballo", 3);
        puntuaje.put("rey", 4);

        ArrayList<Carta> baraja = new ArrayList<>();

        Carta aux = new Carta();
        baraja.add(aux);

        for (int i=1; i<5; i++) {
            do {
                aux = new Carta();
            } while (baraja.contains(aux));
            baraja.add(aux);
        }

        int puntos = 0;
        for (Carta c : baraja) {
            if (puntuaje.containsKey(c.getNumero())) {
                puntos += puntuaje.get(c.getNumero());
            }
            System.out.println(c);

        }
        System.out.printf("Tienes %d puntos !", puntos);

    }
}
