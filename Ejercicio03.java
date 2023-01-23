/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 3: Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en un objeto de la clase ArrayList.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Ejercicio03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(10);
        for (int i = 0; i<10; i++) {
            System.out.print("Introduzca un número: ");
            numeros.add(sc.nextInt());
        }
        System.out.print("La lista original es: " + numeros);
        sc.close();
        Collections.sort(numeros);
        System.out.println("\nLista ordenada de menor a mayor: " + numeros);
        ArrayList<Integer> aux = new ArrayList<>(10);
        for(int n : numeros) {
            aux.add(0, n);
        }
        System.out.println("Lista ordenada de mayor a menor: " + aux);
    }
}
