package Ejercicio_15;

public class Articulo {
    private String nombre;
    protected int cantidad;
    private double precio;
    private double subtotal;

    public Articulo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSubtotal() {
        return this.precio * this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return String.format("%-10s %7.2f %11d %11.2f", nombre, precio, cantidad, getSubtotal());
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        Articulo a = (Articulo) o;
        // compara los atributos de ambos objetos
        return a.nombre.equals(((Articulo) o).nombre);
    }
}
