package Ejercicio_17;
public class Elemento {
    private String nombre;
    private double precio;
    private int cantidad;

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

    @Override
    public String toString() {
        return String.format("%s PVP: %.2f Unidades: %d Subtotal: %.2f", this.nombre, this.precio, this.cantidad, this.precio*this.cantidad);
    }

}
