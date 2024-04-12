package model;

import java.util.Date;

public class Gepland extends Taak{

    private Date datumTijd;

    public Gepland(String naam, String beschrijving, Date datumTijd) {
        super(naam, beschrijving);
        this.datumTijd = datumTijd;
    }

    public Gepland(String naam, String beschrijving, int taakPunten , Date datumTijd) {
        super(naam, beschrijving, taakPunten);
        this.datumTijd = datumTijd;
    }

    public Date getDatumTijd() {
        return datumTijd;
    }

    @Override
    public void showTaak() {
        System.out.println("Taak: " + getNaam());
        System.out.println("Beschrijving: " + getBeschrijving());
        System.out.println("Storypoints: " + getTaakPunten());
        System.out.println("Datum gepland: " + getDatumTijd());
        System.out.println();
    }
}
