/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 10: Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente traducción). Utiliza un objeto de la
 * clase HashMap para almacenar las parejas de palabras. El programa pedirá una palabra en español y dará la correspondiente traducción en inglés.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio10 {
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una palabra para traducirla al inglés: ");
        String palabra = sc.nextLine();
        if (diccionario.containsKey(palabra)) {
            System.out.printf("Traducción: %s", diccionario.get(palabra));
        } else {
            System.out.print("Esa palabra no se encuentra en el diccionario. Pruebe con otra.");
        }
        sc.close();
    }
}
