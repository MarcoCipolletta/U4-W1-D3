package esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    private double perimetro() {

        return (altezza + base) * 2;
    }

    private double area() {
        return altezza * base;
    }

    public void stampaRettangolo() {
        System.out.println("Il perimetro del rettangolo è: " + perimetro() + "; Mentre l'area è: " + area() + ".");
    }

    public static void stampaDueRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("Il perimetro del rettangolo1 è: " + rettangolo1.perimetro() + "; Mentre l'area è: " + rettangolo1.area() + ".");
        System.out.println("Il perimetro del rettangolo2 è: " + rettangolo2.perimetro() + "; Mentre l'area è: " + rettangolo2.area() + ".");

        double sommaPerimetro = rettangolo1.perimetro() + rettangolo2.perimetro();
        double sommaarea = rettangolo1.area() + rettangolo2.area();
        System.out.println("La somma del perimetro dei due rettangoli è:" + sommaPerimetro);
        System.out.println("La somma dell' area dei due rettangoli è:" + sommaarea);
    }

}
