package esercizio3;

public class Carrello {

    private Cliente cliente;
    private Articolo[] articoliNelCarrello;
    private double prezzoTot;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        articoliNelCarrello = new Articolo[0];
        prezzoTot = 0;
    }

    public void aggiungiAlCarrello(Articolo[] articoli){
        articoliNelCarrello = articoli;
        for (Articolo articolo :articoliNelCarrello){
            prezzoTot += articolo.prezzo;
            articolo.rimuoviQuantità();
        }
    }

    public void stampaCarrello(){
        System.out.println("----------------------Carrello");
        System.out.println("il carrelo di: " + cliente.nome + " " + cliente.cognome);
        System.out.println("Elenco articoli nel carrello:");
        for (int i = 0; i < articoliNelCarrello.length; i++) {
            Articolo articolo = articoliNelCarrello[i];
            System.out.println(articolo.descrizione);
        }
        System.out.println("prezzo totale: €" + Math.round(prezzoTot * 100.0) / 100.0);
    }

}
