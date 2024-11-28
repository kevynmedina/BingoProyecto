public class Casilla implements Marcar {
    private int numero;
    private boolean marcada;
    private boolean esLibre;

    public Casilla(int numero, boolean esLibre) {
        this.numero = numero;
        this.esLibre = esLibre;
        this.marcada = false;
    }

    public void marcar() {
        this.marcada = true;
    }
    public boolean esMarcada() {
        return this.marcada;
    }

    public int getNumero() {
        return numero;
    }

    public boolean esLibre() {
        return esLibre;
    }

}
