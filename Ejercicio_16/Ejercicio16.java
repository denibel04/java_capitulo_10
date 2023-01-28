package Ejercicio_16;
/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 16: Realiza un programa que sepa decir la capital de un país (en caso de conocer la respuesta) y que, además, sea capaz de aprender nuevas
 * capitales. En principio, el programa solo conoce las capitales de España, Portugal y Francia. Estos datos deberán estar almacenados en un diccionario.
 * Los datos sobre capitales que vaya aprendiendo el programa se deben almacenar en el mismo diccionario. El usuario sale del programa escribiendo la
 * palabra “salir”.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("Rumanía", "Bucarest");
        diccionario.put("Japón", "Tokio");
        diccionario.put("España", "Madrid");

        Scanner sc = new Scanner(System.in);
        String pais;
        do {
            System.out.print("Introduce el nombre de un país y te diré su capital :3 : ");
            pais = sc.nextLine();
            if (pais.equals("salir")) {
            }
            else if(diccionario.containsKey(pais) ) {
                System.out.printf("La capital es %s\n", diccionario.get(pais));
            } else {
                System.out.print("Ese país no me lo sé :( ¿Cuál es su capital? : ");
                String capital = sc.nextLine();
                System.out.println("Gracias por enseñarme nuevas capitales!");
                diccionario.put(pais, capital);
            }
        } while (!pais.equalsIgnoreCase("salir"));

        sc.close();
    }
}
