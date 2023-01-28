package Ejercicio_14;
public class Articulo {
    private String nombre;
    private int cantidad;
    private double precio;
    private double subtotal;

    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double getSubtotal() {
        return this.precio * this.cantidad;
    }

    @Override
    public String toString() {
        return String.format("%-10s %7.2f %11d %11.2f", nombre, precio, cantidad, getSubtotal());
    }

}
