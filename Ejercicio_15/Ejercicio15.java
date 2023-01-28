package Ejercicio_15;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 15: Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si algún producto se repite en diferentes líneas, se deben
 *  agrupar en una sola. Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en el extracto se debe mostrar que se han pedido 4
 * botes de tomate. Después de teclear “fin”, el programa pide un código de descuento. Si el usuario introduce el código “ECODTO”, se aplica un 10% de
 * descuento en la compra.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Double> articulos = new HashMap<>();
        articulos.put("avena", 2.21);
        articulos.put("garbanzos", 2.39);
        articulos.put("tomate", 1.59);
        articulos.put("jengibre", 3.13);
        articulos.put("quinoa", 4.50);
        articulos.put("guisantes", 1.60);

        String producto;
        int cantidad;
        ArrayList<Articulo> lista = new ArrayList<>();

        do {
            System.out.print("Producto: ");
            producto = sc.nextLine();
            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());
                Articulo aux = new Articulo(producto, cantidad, articulos.get(producto));
                boolean encontrado = false;
                for (Articulo a : lista) {
                    if (a.getNombre().equals(aux.getNombre())) {
                        a.setCantidad(a.cantidad + aux.cantidad);
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    lista.add(aux);
                }
            }
        } while (!producto.equals("fin"));


        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String codigoDescuento = sc.nextLine();
        sc.close();

        System.out.println("\nProducto    Precio    Cantidad    Subtotal" +
                "\n==========================================");

        double total = 0;
        for (Articulo a : lista) {
            System.out.println(a);
            total += a.getSubtotal();
        }
        double descuento = 0;
        if (codigoDescuento.equals("ECODTO")) {
            descuento = total*10/100;
            System.out.printf("==========================================\nDescuento : %.2f\n", descuento);
        }
        System.out.printf("==========================================\n" +
                "TOTAL : %.2f", total-descuento);
    }
}
