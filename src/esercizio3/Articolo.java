package esercizio3;

public class Articolo {
    private String codiceArticolo;
    public String descrizione;
    public double prezzo;
    private int quantità;

    public Articolo(String codiceArticolo, String descrizione, double prezzo) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        quantità = 0;
    }

    public void aggiungiQuantità(int aggiunta){
        quantità += aggiunta;
    }
public void rimuoviQuantità(){
    if(quantità>0){
        quantità--;
    } else {
        System.out.println(descrizione + " non è disponibile");
    }
}

public void stampaArticolo(){
    System.out.println("---------------------Articolo");
    System.out.println("Codice: " + codiceArticolo);
    System.out.println("Descrizione: " + descrizione);
    System.out.println("Prezzo: €" + prezzo);
    System.out.println("Quantità: " + quantità);
}

}
