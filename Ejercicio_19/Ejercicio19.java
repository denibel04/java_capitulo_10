package Ejercicio_19;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 19: Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se proporciona a continuación. El programa preguntará una
 * palabra y dará una lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si se introduce la palabra “caliente”, el programa dará
 * como resultado: ardiente, candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de “caliente”? Muy fácil, en el diccionario debe existir
 * la entrada (“caliente”, “hot”), por tanto solo tendrá que buscar las palabras en español que también signifiquen “hot”; esta información estará en las
 * entradas (“ardiente”, “hot”) y (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene sinónimos, debe mostrar el mensaje
 * “No conozco sinónimos de esa palabra”. Si una palabra no está en el diccionario se mostrará el mensaje “No conozco esa palabra”. El usuario sale del
 * programa escribiendo la palabra “salir”.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main (String[] args) {

        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("caliente", "hot");
        diccionario.put("ardiente", "hot");
        diccionario.put("abrasador", "hot");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("agujetas", "stiff");
        diccionario.put("hierro", "iron");
        diccionario.put("grande", "big");

        Scanner sc = new Scanner(System.in);
        String palabra;
        do {
            boolean tieneSinonimos = false;
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            palabra = sc.next();
            if (palabra.equals("salir")) {
            } else if (diccionario.containsKey(palabra)) {
                for (Map.Entry a : diccionario.entrySet()) {
                    if (diccionario.get(palabra).equals(a.getValue())) {
                        if (palabra.equals(a.getKey())) {
                        } else {
                            System.out.println(a.getKey() + " ");
                            tieneSinonimos = true;
                        }
                    }
                }
                if (!tieneSinonimos) {
                    System.out.println("No conozco sinónimos de esa palabra");
                }
            } else {
                System.out.println("No conozco esa palabra :(");
            }
        } while (!palabra.equals("salir"));
        sc.close();
    }
}
