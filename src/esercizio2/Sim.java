package esercizio2;

public class Sim {
    private String phoneNumber;
    private int credit;
    private Chiamata[] callList;

    public Sim(String number) {
        this.phoneNumber = number;
        credit = 0;
        callList = new Chiamata[0];
    }

    public void addCall(Chiamata[] listaChiamate){
        callList = listaChiamate;
    }

    public void ricarica(int importo){
        credit += importo;
    }

    public void stampaDatiSim(){
        System.out.println("Numero di telefono: " + phoneNumber);
        System.out.println("Credito disponibile: €" + credit);
        System.out.println("Ultime chiamate:");
        for (int i = 0; i < callList.length; i++) {
            Chiamata chiamata = callList[i];
            System.out.println(chiamata);
        }
    }


}
