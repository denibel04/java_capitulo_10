package Ejercicio_23;
public class Figura {
    private String figura;
    protected int valor;
    protected int numCapturable;

    public Figura(String figura, int valor, int numCapturable) {
        this.figura = figura;
        this.valor = valor;
        this.numCapturable = numCapturable;
    }

    public void captura() {
        System.out.printf("%s (%d peones)\n", this.figura, this.valor);
        numCapturable--;
    }

}
