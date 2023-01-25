package Ejercicio_18;

import java.util.ArrayList;

public class Carrito {
    ArrayList<Elemento> carrito = new ArrayList<>();
    public void agrega(Elemento e) {
        for (Elemento e1 : carrito) {
            if (e1.equals(e)) {
                e1.setCantidad(e1.cantidad + e.cantidad);
                return;
            }
        }
        carrito.add(e);
    }

    public int numeroDeElementos() {
        return carrito.size();
    }

    public double importeTotal() {
        double suma = 0;
        for(Elemento e : carrito) {
            suma += e.getPrecio() * e.getCantidad();
        }
        return suma;
    }

    @Override
    public String toString() {
        String cadena = "Contenido del carrito\n=====================\n";
        for (Elemento e : carrito) {
            cadena += e + "\n";
        }
        return cadena;
    }


}
