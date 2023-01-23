package Ejercicio_05;
/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 5: Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez una lista para almacenar la información sobre los discos en
 * lugar de un array convencional. Comprobarás que el código se simplifica notablemente.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio05 {
    public static void main (String[] args) {
        ArrayList<Disco> album = new ArrayList<Disco>();
        int opcion;
        String titulo;
        String codigo;
        String autor;
        String genero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // listado
                    int opcionListado;
                    System.out.println("\nLISTADO\n=======");
                    System.out.println("1. Completo");
                    System.out.println("2. Por autor");
                    System.out.println("3. Por género");
                    System.out.println("4. En un rango de duración");
                    System.out.println("5. Menú principal");
                    System.out.print("Introduzca una opción: ");
                    opcionListado = sc.nextInt();
                        switch (opcionListado) {
                            case 1: // completo
                                for(Disco d : album) {
                                    System.out.println(d);
                                }
                                break;
                            case 2: // por autor
                                System.out.print("Introduzca el nombre del autor: ");
                                autor = sc.next();
                                for(Disco d : album) {
                                    if (d.getAutor().equalsIgnoreCase(autor)) {
                                        System.out.println(d);
                                    }
                                }
                                break;
                            case 3: // por genero
                                System.out.print("Introduzca el género: ");
                                genero = sc.next();
                                for(Disco d : album) {
                                    if (d.getGenero().equalsIgnoreCase(genero)) {
                                        System.out.println(d);
                                    }
                                }
                                break;
                            case 4: // rango de duración
                                System.out.print("Para definir el rango en minutos introduzca el valor minimo: ");
                                int min = sc.nextInt();
                                System.out.print("Y el valor máximo: ");
                                int max = sc.nextInt();
                                for(Disco d : album) {
                                    if (d.getDuracion()>=min && d.getDuracion()<=max) {
                                        System.out.println(d);
                                    }
                                }
                                break;
                        }
                    break;
                case 2: // nuevo disco
                    System.out.println("\nNUEVO DISCO\n===========");
                    System.out.println("Por favor, introduzca los datos del disco.");
                    System.out.print("Código: ");
                    codigo = sc.next();
                    while (album.contains(new Disco(codigo,"", "", "", 0))) {
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        codigo = sc.next();
                    }
                    System.out.print("Autor: ");
                    autor = sc.next();
                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Género: ");
                    genero = sc.nextLine();
                    System.out.print("Duración: ");
                    int duracion = sc.nextInt();
                    album.add(new Disco(codigo, autor, titulo, genero, duracion));
                    break;
                case 3: // modificar disco
                    System.out.println("\nMODIFICAR\n===========");
                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigo = sc.nextLine();
                    while (!album.contains(new Disco(codigo,"", "", "", 0))) {
                        System.out.print("Ese código no existe, introduzca otro: ");
                        codigo = sc.nextLine();
                    }
                    int i = album.indexOf(new Disco(codigo,"", "", "", 0));
                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
                    System.out.println("Código: " + album.get(i).getCodigo());
                    System.out.print("Nuevo código: ");
                    codigo = sc.nextLine();
                    if (!codigo.equals("")) {
                        album.get(i).setCodigo(codigo);
                    }
                    System.out.println("Autor: " + album.get(i).getAutor());
                    System.out.print("Nuevo autor: ");
                    autor = sc.nextLine();
                    if (!autor.equals("")) {
                        album.get(i).setAutor(autor);
                    }
                    System.out.println("Título: " + album.get(i).getTitulo());
                    System.out.print("Nuevo título: ");
                     titulo = sc.nextLine();
                    if (!titulo.equals("")) {
                        album.get(i).setTitulo(titulo);
                    }
                    System.out.println("Género: " + album.get(i).getGenero());
                    System.out.print("Nuevo género: ");
                    genero = sc.nextLine();
                    if (!genero.equals("")) {
                        album.get(i).setGenero(genero);
                    }
                    System.out.println("Duración: " + album.get(i).getDuracion());
                    System.out.print("Nueva duración: ");
                    duracion = sc.nextInt();
                    album.get(i).setDuracion(duracion);
                    break;
                case 4:
                    System.out.println("\nBORRAR\n======");
                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigo = sc.nextLine();
                    if (!album.contains(new Disco(codigo,"", "", "", 0))) {
                        System.out.println("Lo siento, el código introducido no existe.");
                    } else {
                        album.remove(album.indexOf(new Disco(codigo, "", "", "", 0)));
                        System.out.println("Album borrado.");
                    }
                    break;
            }
        } while (opcion!=5);
        sc.close();
    }
}
