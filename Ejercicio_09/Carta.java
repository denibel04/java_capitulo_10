package Ejercicio_09;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
    private static String numeros[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] palos = {"bastos", "copas", "espadas", "oros"};
    private Integer numero;
    private String palo;

    public Carta() {
        this.numero = (int)(Math.random()*3);
        this.palo = palos[(int)(Math.random()*4)];
    }

    public Integer getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", numeros[numero], palo);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        Carta c = (Carta) o;
        // compara los atributos de ambos objetos
        return (this.numero == c.numero) && (this.palo.equalsIgnoreCase(c.palo));
    }

    @Override
    public int compareTo(Carta c) {
        if (palo.equals(c.getPalo())) {
            return numero.compareTo(c.getNumero());
        } else {
            return palo.compareTo(c.getPalo());
        }
    }
}
