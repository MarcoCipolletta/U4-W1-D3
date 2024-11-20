import esercizio1.Rettangolo;
import esercizio2.Chiamata;
import esercizio2.Sim;
import esercizio3.Articolo;
import esercizio3.Carrello;
import esercizio3.Cliente;

public class Main {
    public static void main(String[] args) {

        //Esercizio1
        Rettangolo rettangolo= new Rettangolo(2,3);

        Rettangolo rettangolo1 = new Rettangolo(2.1,1.7);
        Rettangolo rettangolo2 = new Rettangolo(7.3,4.2);
        System.out.println("***************** Rettangolo semplice");
        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();

        System.out.println("***************** Due rettangoli");
        Rettangolo.stampaDueRettangoli(rettangolo1,rettangolo2);


        //Esercizio2
        Chiamata[] arrChiamate =  {
                new Chiamata(3,"+393296675839"),
                new Chiamata(1,"+393276894726"),
                new Chiamata(23,"+393458765930"),
                new Chiamata(5,"+393457768594"),
                new Chiamata(7,"+393392839585"),
        };

        Sim sim = new Sim("+393847754980");
        sim.addCall(arrChiamate);
        sim.ricarica(12);
        sim.stampaDatiSim();

        //Esercizio3

        Articolo articolo1 = new Articolo("coc", "Coca-cola", 2.4);
        articolo1.aggiungiQuantità(23);
        Articolo articolo2 = new Articolo("fanta", "Fanta", 2.2);
        articolo2.aggiungiQuantità(15);

        Articolo articolo3 = new Articolo("peps", "Pepsi", 2.3);
        articolo3.aggiungiQuantità(20);

        Articolo articolo4 = new Articolo("spri", "Sprite", 1.9);
        articolo4.aggiungiQuantità(18);

        Articolo articolo5 = new Articolo("troc", "Trocadero", 2.1);
        articolo5.aggiungiQuantità(12);

        Articolo articolo6 = new Articolo("aqup", "Acqua Panna", 1.2);
        articolo6.aggiungiQuantità(30);

        Articolo articolo7 = new Articolo("agua", "Acqua Frizzante", 1.3);
        articolo7.aggiungiQuantità(25);

        Articolo articolo8 = new Articolo("ener", "Energy Drink", 3.5);
        articolo8.aggiungiQuantità(10);

        Articolo articolo9 = new Articolo("thè", "Thè al Limone", 1.5);
        articolo9.aggiungiQuantità(22);

        Articolo articolo10 = new Articolo("thp", "Thè alla Pesca", 1.5);
        articolo10.aggiungiQuantità(19);

        Articolo articolo11 = new Articolo("grap", "Grapefruit Soda", 2.0);
        articolo11.aggiungiQuantità(17);

        articolo1.stampaArticolo();

        Articolo[] articoliDaAggiungereNelCarrelloMarco = {articolo1,articolo2,articolo3,articolo4,articolo5,articolo6};
        Articolo[] articoliDaAggiungereNelCarrelloLuigi = {articolo7,articolo8,articolo9,articolo10,articolo11,articolo1};

        Cliente marco = new Cliente("ab21","Marco","Cipolletta","ma@li.it");
        marco.stampaCliente();
        Cliente luigi = new Cliente("bg5h","Luigi","Servi","li@li.it");
        luigi.stampaCliente();
        System.out.println("----------Articolo1--------------");
        articolo1.stampaArticolo();

        Carrello carrelloMarco = new Carrello(marco);
        carrelloMarco.aggiungiAlCarrello(articoliDaAggiungereNelCarrelloMarco);

        carrelloMarco.stampaCarrello();
        System.out.println("----------Articolo1--------------");
        articolo1.stampaArticolo();

        Carrello carrelloLuigi = new Carrello(luigi);
        carrelloLuigi.aggiungiAlCarrello(articoliDaAggiungereNelCarrelloLuigi);
        carrelloLuigi.stampaCarrello();
        System.out.println("----------Articolo1--------------");
        articolo1.stampaArticolo();



    }
}