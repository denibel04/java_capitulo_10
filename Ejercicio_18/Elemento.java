package Ejercicio_18;

import Ejercicio_09.Carta;

public class Elemento {
    private String nombre;
    private double precio;
    public int cantidad;

    public Elemento(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("%s PVP: %.2f Unidades: %d Subtotal: %.2f", this.nombre, this.precio, cantidad, this.precio*this.cantidad);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        Elemento e = (Elemento) o;
        // compara los atributos de ambos objetos
        return (this.nombre.equalsIgnoreCase(e.nombre));
    }
}
