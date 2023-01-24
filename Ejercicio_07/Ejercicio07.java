package Ejercicio_07;

import java.util.ArrayList;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 7: La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa un botón siguiendo la siguiente pauta: o bien coincide el valor
 * con la moneda anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la
 * posición – cara o cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias siguiendo la pauta correcta. Cada moneda generada debe ser
 * una instancia de la clase Moneda y la secuencia se debe ir almacenando en una lista.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio07 {
    public static void main (String[] args) {
        ArrayList<Moneda> monedas = new ArrayList<>(6);
        Moneda aux = new Moneda();
        monedas.add(aux);
        String cantidad = aux.getCantidad();
        String posicion = aux.getCantidad();
        for (int i=0; i<6; i++) {
            do {
                aux = new Moneda();
            } while (!(posicion.equals(aux.getPosicion())) && !(cantidad.equals(aux.getCantidad())));
            monedas.add(aux);
            cantidad = aux.getCantidad();
            posicion = aux.getPosicion();
        }
        for (Moneda m : monedas) {
            System.out.println(m);
        }
    }
}
