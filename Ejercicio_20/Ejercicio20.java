package Ejercicio_20;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 20: Amplía el programa anterior de tal forma que sea capaz de aprender palabras y sinónimos. Cuando una palabra no tiene sinónimos, es decir,
 * cuando aparece la palabra en español con su traducción y esa traducción no la tiene ninguna otra palabra española, se le preguntará al usuario si
 * quiere añadir uno (un sinónimo) y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede dar la circunstancia de que el
 * usuario introduzca una palabra en español que no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y se dará la posibilidad
 * al usuario de añadir la entrada correspondiente en el diccionario pidiendo, claro está, la palabra en inglés.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Ejercicio20 {
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
                        if (!palabra.equals(a.getKey())) {
                            System.out.println(a.getKey() + " ");
                            tieneSinonimos = true;
                        }
                    }
                }
                if (!tieneSinonimos) {
                    System.out.print("No conozco sinónimos de esa palabra, ¿quiere agregar alguno? (s/n): ");
                    String respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.print("Introduzca el sinonimo: ");
                        String sinonimo = sc.next();
                        diccionario.put(sinonimo, diccionario.get(palabra));
                        System.out.println("Gracias por enseñarme nuevos sinónimos ! :D");
                    } else {System.out.println("ok");}
                }
            } else {
                System.out.print("No conozco esa palabra :( ¿quiere añadirla al diccionario? (s/n): ");
                String respuesta = sc.next();
                if (respuesta.equalsIgnoreCase("s")) {
                    System.out.print("Introduzca la traducción al inglés: ");
                    String ingles = sc.next();
                    diccionario.put(palabra, ingles);
                    System.out.println("Gracias por enseñarme nuevas palabras ! :D");
                } else {System.out.println("ok");}
            }
        } while (!palabra.equals("salir"));
        sc.close();
    }
}
