/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 1: Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra esos nombres por pantalla. Utiliza para ello un bucle for
 * que recorra todo el ArrayList sin usar ningún índice.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
public class Ejercicio01 {
    public static void main (String[] args) {
        ArrayList<String> compañeros = new ArrayList<String>();
        compañeros.add("Jesús");
        compañeros.add("Nuria");
        compañeros.add("Adrian");
        compañeros.add("Marco");
        compañeros.add("Garfield");
        compañeros.add("Turkey");

        System.out.println("Los compañeros son: ");
        for(String nombre : compañeros) {
            System.out.printf("%s, ", nombre);
        }
    }
}
