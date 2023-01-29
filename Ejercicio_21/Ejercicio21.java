package Ejercicio_21;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 21: La asociación “Amigos de los anfibios” nos ha encargado una aplicación educativa sobre estos animalitos. Crea un programa que pida al
 * usuario el tipo de anfibio y que, a continuación, nos muestre su hábitat y su alimentación. Si el tipo de anfibio introducido no existe, se debe
 * mostrar el mensaje “Ese tipo de anfibio no existe” La información se debe guardar en dos diccionarios (dos HashMap). Uno de ellos tendrá parejas
 * clave-valor del tipo (tipo de anfibio, hábitat) y otro (tipo de anfibio, alimentación).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main (String[] args) {

        HashMap<String, String> habitats = new HashMap<>();
        habitats.put("rana","En los trópicos y cerca de las zonas húmedas y acuáticas");
        habitats.put("salamandra","Ecosistemas húmedos");
        habitats.put("sapo","En cualquier sitio salvo el desierto y la Antártida");
        habitats.put("tritón","América y África");

        HashMap<String, String> alimentacion = new HashMap<>();
        alimentacion.put("rana", "Larvas e insectos");
        alimentacion.put("salamandra", "Pequeños crustáceos e insectos");
        alimentacion.put("sapo", "Insectos, lombrices y pequeños roedores");
        alimentacion.put("tritón", "Insectos");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el tipo de anfibio: ");
        String anfibio = sc.next();
        if (habitats.containsKey(anfibio) && alimentacion.containsKey(anfibio)) {
            System.out.printf("Hábitat: %s\nAlimentación: %s", habitats.get(anfibio), alimentacion.get(anfibio));
        } else {
            System.out.println("Ese tipo de anfibio no existe >:)");
        }
        sc.close();
    }
}
