package Ejercicio_22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CuentaCorriente {
    ArrayList<String> movimiento = new ArrayList<>();
    private double saldo;
    private String numCuenta;

    public CuentaCorriente() {
        this.generaNumero();
        this.saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.generaNumero();
        this.saldo = saldo;
    }

    private void generaNumero() {
        numCuenta = "";
        for (int i = 0; i < 10; i++) {
            numCuenta += (int) (Math.random() * 10);
        }
    }

    public void ingreso(int ingreso) {
        this.saldo += ingreso;
        movimiento.add(String.format("Ingreso de %d  Saldo: %.2f", ingreso, this.saldo));
    }

    public void cargo(int cargo) {
        this.saldo -= cargo;
        movimiento.add(String.format("Cargo de %d  Saldo: %.2f", cargo, this.saldo));
    }

    public void transferencia(CuentaCorriente b, int dinero) {
        this.saldo -= dinero;
        b.saldo += dinero;
        b.movimiento.add(String.format("Transferencia recibida de %d de la cuenta %s  Saldo: %.2f", dinero, b.numCuenta, this.saldo));
        movimiento.add(String.format("Transferencia emitida de %d a la cuenta %s  Saldo: %.2f", dinero, b.numCuenta, this.saldo));
    }

    @Override
    public String toString() {
        return "Número de cta: " + numCuenta + " Saldo: " + String.format("%.2f", saldo) + " €";
    }

    public void movimientos() {
        System.out.println("Movimientos de la cuenta " + this.numCuenta + "\n-----------------------------------");
        for (String m : movimiento) {
            System.out.println(m);
        }

    }
}

