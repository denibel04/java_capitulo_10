package Ejercicio_14;/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 14: Un supermercado de productos ecológicos nos ha pedido hacer un programa para vender su mercancía. En esta primera versión del
 * programa se tendrá en cuenta los productos que se indican en la tabla junto con su precio. Los productos se venden en bote, brick, etc. Cuando
 * se realiza la compra, hay que indicar el producto y el número de unidades que se compran, por ejemplo “guisantes” si se quiere comprar un bote
 * de guisantes y la cantidad, por ejemplo “3” si se quieren comprar 3 botes. La compra se termina con la palabra “fin. Suponemos que el usuario
 * no va a intentar comprar un producto que no existe. Utiliza un diccionario para almacenar los nombres y precios de los productos y una o varias
 * listas para almacenar la compra que realiza el usuario.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Ejercicio14 {
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
            producto = sc.next();
            if (!producto.equals("fin")) {
                System.out.print("Cantidad: ");
                cantidad = sc.nextInt();
                Articulo aux = new Articulo(producto, cantidad, articulos.get(producto));
                lista.add(aux);
            }
        } while (!producto.equals("fin"));
        sc.close();

        System.out.println("Producto    Precio    Cantidad    Subtotal" +
                "\n==========================================");

        double total = 0;
        for (Articulo a : lista) {
            System.out.println(a);
            total += a.getSubtotal();
        }
        System.out.printf("==========================================\n" +
                "TOTAL : %.2f", total);
    }
}
