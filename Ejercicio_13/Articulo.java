package Ejercicio_13;
public class Articulo {
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    protected int cantidad = 0;

    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return this.precioVenta * this.cantidad;
    }

    @Override
    public String toString() {
        String cadena = "------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nDescripción: " + this.descripcion;
        cadena += "\nPrecio de compra: " + this.precioCompra;
        cadena += "\nPrecio de venta: " + this.precioVenta;
        cadena += "\nStock: " + this.stock + " unidades";
        cadena += "\n------------------------------------------";
        return cadena;

    }


}
