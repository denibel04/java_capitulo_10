/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 6: Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre de usuario y una contraseña. Si el usuario
 * introduce los datos correctamente, el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan
 * las oportunidades el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben
 * estar almacenados en una estructura de la clase HashMap.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio06 {
    public static void main (String[] args) {
        // definición de valores
        String usuario;
        String clave;
        int intentos = 3;
        // crea el hashmap, meto dentro el usuario y la contraseña para acceder
        HashMap<String, String> acceso = new HashMap<>();
        acceso.put("usuario", "contraseña");

        // Pide los datos al usuario
        System.out.println("Introduzca usuario y contraseña para entrar al área restringida.\nTiene 3 intentos.");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Contraseña: ");
            clave = sc.nextLine();

            if(acceso.containsKey(usuario)) { // si el usuario es correcto (comprueba si esta en el hashmap)
                if (acceso.get(usuario).equals(clave)) { // get devuelve el valor de la key (devuelve la constraseña del usuario) / si ambos son correctos
                    System.out.print("Ha accedido al área restringida :)");
                    intentos = 0;
                } else { // si el usuario es correcto y la clave correcta
                    intentos--;
                    System.out.printf("Contraseña incorrecta.\nLe quedan %d intentos\n", intentos);
                }
            } else { // si ninguno es correcto
                intentos--;
                System.out.printf("Usuario incorrecto.\nLe quedan %d intentos\n", intentos);
            }
        } while (intentos>0);
        sc.close();
    }
}
