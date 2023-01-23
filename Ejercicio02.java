/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 2: Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego calcule la suma, la media, el máximo y
 * el mínimo de esos números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
public class Ejercicio02 {
    public static void main (String[] args) {
        int max = 0;
        int min = 100;
        int suma = 0;
        int tam = (int) (10 + Math.random() * 11);
        ArrayList<Integer> numeros = new ArrayList<>(tam);
        for(int i = 0; i<tam; i++) {
            numeros.add((int)(Math.random()*101));
        }
        System.out.println("Lista generada: " + numeros);
        for(int n : numeros) {
            suma += n;
            if (n>max) {
                max = n;
            } else if (n<min) {
                min = n;
            }
        }

        System.out.printf("El número más pequeño es: %d\nEl número más grande es: %d\nLa suma total es: %d\nY la media es: %d", min, max, suma, suma/tam);
    }
}
