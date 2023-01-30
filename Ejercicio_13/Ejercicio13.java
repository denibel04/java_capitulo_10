package Ejercicio_13;
/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 13: Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejoras:
 *  • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 *  • Comprueba la existencia del código en el alta, la baja y la modificación de artículos para evitar errores.
 *  • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta de varios artículos y emitir la factura correspondiente.
 *    Se debe preguntar por los códigos y las cantidades de cada artículo que se quiere comprar. Aplica un 21% de IVA.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int i;
        String nombre = null;
        String descripcion;
        double precioVenta;
        double precioCompra;
        int stock;
        boolean vacio;
        boolean existe = false;
        int pos = 0;
        Articulo aux = null;

        ArrayList<Articulo> articulos = new ArrayList<>(5);
        articulos.add(new Articulo("leche", "sale de la vaca", 0.5,1,10));

        HashMap<String, Integer> venta = new HashMap<>();

        do {
            System.out.print("Estás usando GESTISIMAL - GESTIón SIMplificada de Almacén\n" +
                    "1. Listado\n" +
                    "2. Alta\n" +
                    "3. Baja\n" +
                    "4. Modificación\n" +
                    "5. Entrada de mercancía\n" +
                    "6. Venta\n" +
                    "7. Salir\n" +
                    "Opción : ");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1: //listado
                    System.out.println("          -- L I S T A D O -- ");
                    for(Articulo a : articulos) {
                        if (a!=null) {
                            System.out.println(a);
                        }
                    }
                    break;

                case 2: // alta
                    System.out.print("Introduzca el nombre del articulo que quiere dar de alta: ");
                    nombre = sc.nextLine();
                    vacio = false;
                    existe = false;
                    for (Articulo a : articulos) {
                         if (a!=null && nombre.equalsIgnoreCase(a.getCodigo())) {
                            existe = true;
                        }
                    } if (existe) {
                        System.out.println("Ese articulo ya se encuentra en la base de datos");
                    } else {
                        System.out.print("Introduzca la descripción del articulo: ");
                        descripcion = sc.nextLine();
                        System.out.print("Introduzca el precio de compra: ");
                        precioCompra =  Double.parseDouble(sc.nextLine());
                        System.out.print("Introduzca el precio de venta: ");
                        precioVenta =  Double.parseDouble(sc.nextLine());
                        System.out.print("Introduzca el stock: ");
                        stock = Integer.parseInt(sc.nextLine());
                        articulos.add(new Articulo(nombre, descripcion, precioCompra, precioVenta, stock));
                    }
                    break;
                case 3: // baja
                    System.out.print("Introduzca el codigo del articulo que quiera dar de baja: ");
                    nombre = sc.nextLine();
                    existe = false;
                    for (Articulo a : articulos) {
                        if(a!=null && a.getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        String finalNombre = nombre;
                        articulos.removeIf(a -> (a.getCodigo().equalsIgnoreCase(finalNombre)));
                        System.out.println("El articulo se ha dado de baja con éxito");
                    }
                    break;
                case 4: //modificacion
                    System.out.print("Introduzca el codigo del articulo que quiera modificar: ");
                    nombre = sc.nextLine();
                    existe = false;
                    for (Articulo a : articulos) {
                        if(a!=null && a.getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                            aux = a;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        System.out.println("¿Qué quiere modificar?\n" +
                                "1. Código (nombre)\n" +
                                "2. Descripción\n" +
                                "3. Precio de compra\n" +
                                "4. Precio de venta\n" +
                                "5. Stock\n" +
                                "Opción : ");
                        int opcionMod = Integer.parseInt(sc.nextLine());
                        switch (opcionMod) {
                            case 1:
                                System.out.println("Introduzca el nuevo código: ");
                                nombre = sc.nextLine();
                                aux.setCodigo(nombre);
                                break;
                            case 2:
                                System.out.print("Introduzca la nueva descripción");
                                descripcion = sc.nextLine();
                                aux.setDescripcion(descripcion);
                                break;
                            case 3:
                                System.out.print("Introduzca el nuevo precio de compra: ");
                                precioCompra =  Double.parseDouble(sc.nextLine());
                                aux.setPrecioCompra(precioCompra);
                                break;
                            case 4:
                                System.out.print("Introduzca el nuevo precio de venta: ");
                                precioVenta =  Double.parseDouble(sc.nextLine());
                                aux.setPrecioVenta(precioVenta);
                                break;
                            case 5:
                                System.out.print("Introduzca el nuevo stock: ");
                                stock = Integer.parseInt(sc.nextLine());
                                if (stock<0) {
                                    System.out.println("No puede introducir un stock negativo");
                                } else {
                                    aux.setStock(stock);
                                }
                                break;
                        }
                    }
                    break;
                case 5: // entrada de mercancía
                    System.out.println("¿De qué artículo llega mercancía?");
                    nombre = sc.nextLine();
                    existe = false;
                    for (Articulo a : articulos) {
                        if(a!=null && a.getCodigo().equalsIgnoreCase(nombre)) {
                            existe = true;
                            aux = a;
                        }
                    }
                    if (!existe) {
                        System.out.println("Ese articulo no se encuentra en la base de datos");
                    } else {
                        System.out.print("¿Cuánta mercancía llega?");
                        int cant = Integer.parseInt(sc.nextLine());
                        aux.setStock(aux.getStock()+cant);
                    }
                    break;
                case 6: // Venta
                    System.out.println("Bienvenido a la sección de venta ! Escriba salir cuando termine la compra y se le mostrará la factura.");
                    do {
                        System.out.print("Introduzca el código del producto que quiera comprar: ");
                        nombre = sc.nextLine();
                        existe = false;
                        for (Articulo a : articulos) {
                            if(a!=null && a.getCodigo().equalsIgnoreCase(nombre)) {
                                existe = true;
                                aux = a;
                            }
                        }
                        if (!existe && !nombre.equalsIgnoreCase("salir")) {
                            System.out.println("Lo siento, no tenemos de este producto. Pruebe con otro.");
                        } else if (!nombre.equalsIgnoreCase("salir")){
                            System.out.print("¿Cuánto quiere comprar? ");
                            int cant = Integer.parseInt(sc.nextLine());
                            if (cant>aux.getStock()) {
                                System.out.println("Lo sentimos, no tenemos tanto stock.");
                            } else {
                                aux.setStock(aux.getStock()-cant);
                                aux.cantidad += cant;
                                venta.put(aux.getCodigo(), aux.cantidad);
                            }
                        }
                    } while (!nombre.equalsIgnoreCase("salir"));

                    System.out.println("\nProducto    Precio    Cantidad    Subtotal" +
                            "\n==========================================");

                    double total = 0;
                    for (Map.Entry v : venta.entrySet()) {
                        for (Articulo a : articulos) {
                            if (v.getKey().equals(a.getCodigo())) {
                                aux = a;
                            }
                        }
                        System.out.printf("%-10s %7.2f %11d %11.2f\n", aux.getCodigo(), aux.getPrecioVenta(), (int)v.getValue(), (double)(aux.getPrecioVenta()*(int)v.getValue()));
                        total += (double) (aux.getPrecioVenta()*(int)(v.getValue()));

                    }
                    double IVA = 0.21;
                        System.out.printf("==========================================\nIVA : %.2f\n", total*IVA);
                    System.out.printf("==========================================\n" +
                            "TOTAL : %.2f\n" +
                            "==========================================\n\n", total+(total*IVA));
                    break;
            }
        } while (opcion!=7);

        System.out.println("Gracias por usar GESTISIMAL! :D");

        sc.close();
    }
}
