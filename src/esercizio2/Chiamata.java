package esercizio2;

public class Chiamata {
    private int minuti;
    private String numeroChiamato;

    public Chiamata(int minuti, String numeroChiamato) {
        this.minuti = minuti;
        this.numeroChiamato = numeroChiamato;
    }

    @Override
    public String toString() {
        return "Durata: " + minuti + " minuti, Numero chiamato: " + numeroChiamato;
    }
}
