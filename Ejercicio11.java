/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 11: Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y comprobará si son correctas. Al final, el programa deberá mostrar cuántas respuestas
 * son válidas y cuántas erróneas.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[] args) {
        // inicializa el hashmap con sus valores
        HashMap<String, String> diccionario = new HashMap<>(20);
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("abeja", "bee");
        diccionario.put("pan", "bread");
        diccionario.put("ratón", "mouse");
        diccionario.put("miau", "meow");
        diccionario.put("tímido", "shy");
        diccionario.put("solitario", "lonely");
        diccionario.put("siesta", "nap");
        diccionario.put("teléfono", "phone");
        diccionario.put("ordenador", "computer");
        diccionario.put("flor", "flower");
        diccionario.put("nutria", "otter");
        diccionario.put("rosa", "pink");
        diccionario.put("azul", "blue");
        diccionario.put("caracol", "snail");
        diccionario.put("gatito", "kitten");
        diccionario.put("playa", "beach");
        diccionario.put("dormir", "sleep");
        diccionario.put("clase", "classroom");

        // Guarda las palabras en español en un array // keySet: Devuelve un conjunto (set) con todas las claves.
        String[] español = diccionario.keySet().toArray(new String[20]);

        // genera 5 números aleatorios sin que se repitan
        ArrayList<Integer> n = new ArrayList<Integer>(5);
        n.add((int)(Math.random()*22));
        for (int i = 0; i < 4; i++) {
            int numero;
            do {
                numero = (int)(Math.random()*22);
            } while (n.contains(numero));
            n.add(numero);
        }

        Scanner sc = new Scanner(System.in);
        int puntos = 0;
        System.out.println("-- Examen de inglés --\nReglas:\n - Debe introducir la traducción al inglés de la palabra que se muestra\n - Por cada respuesta correcta se suma 1 punto");
        for (int i = 0; i<5; i++) {
            String palabraEsp = español[n.get(i)];
            System.out.printf("%s : ", palabraEsp);
            String palabra = sc.nextLine();
            if (diccionario.get(palabraEsp).equals(palabra)) {
                System.out.println("Correcto ! :D");
                puntos++;
            } else {
                System.out.println("Incorrecto :(\nLa respuesta correcta sería " + diccionario.get(palabraEsp));
            }
        }
        System.out.printf("Ha optenido %d puntos !! ", puntos);
        sc.close();
    }
}
