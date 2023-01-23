/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 4: Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar palabras en lugar de números.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>(10);
        for (int i = 0; i<10; i++) {
            System.out.print("Introduzca una palabra: ");
            palabras.add(sc.next());
        }
        System.out.print("La lista original es: " + palabras);
        Collections.sort(palabras);
        System.out.println("\nLista ordenada alfabéticamente : " + palabras);
        sc.close();
    }
}
