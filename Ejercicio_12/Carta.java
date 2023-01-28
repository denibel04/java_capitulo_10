package Ejercicio_12;
public class Carta {
    private static String numeros[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private static String[] palos = {"bastos", "copas", "espadas", "oros"};
    private String numero;
    private String palo;

    public Carta() {
        this.numero = numeros[(int)(Math.random()*3)];
        this.palo = palos[(int)(Math.random()*4)];
    }

    public String getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", numero, palo);
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) return false;
        Carta c = (Carta) o;
        // compara los atributos de ambos objetos
        return (this.numero.equalsIgnoreCase(c.numero)) && (this.palo.equalsIgnoreCase(c.palo));
    }
}
