package model;

public class Bezig extends Taak{

    public Bezig(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public Bezig(String naam, String beschrijving, int taakPunten) {
        super(naam, beschrijving, taakPunten);
    }

    @Override
    public void showTaak() {
        System.out.println("Taak: " + getTitel());
        System.out.println("Beschrijving: " + getBeschrijving());
        System.out.println("Storypoints: " + getTaakPunten());
        System.out.println();
    }
}
