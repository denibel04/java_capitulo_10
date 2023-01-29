package Ejercicio_22;

/*
 * Capítulo 10 - colecciones y diccionarios
 * Ejercicio 22: Amplía el ejercicio 13 del capítulo anterior que implementaba cuentas corrientes de un banco de tal forma que cada cuenta lleve un
 * registro de todos los movimientos realizados: ingresos, cargos y transferencias (tanto enviadas como recibidas).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio22 {
    public static void main (String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        cuenta1.ingreso(2000);
        cuenta1.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta1, 100);
        cuenta1.transferencia(cuenta3, 250);
        cuenta3.transferencia(cuenta1, 22);
        cuenta1.movimientos();
    }
}
