package model;

import java.util.Date;

public class Programmeer extends Taak{

    private String programmeerTaal;
    private int aantalKlassen;


    public Programmeer(String naam, String beschrijving, String status , Date datumTijd, String programmeerTaal, int aantalKlassen) {
        super(naam, beschrijving, status, datumTijd);
        this.programmeerTaal = programmeerTaal;
        this.aantalKlassen = aantalKlassen;
    }

    public Programmeer(String naam, String beschrijving, String status , Date datumTijd, int taakPunten, String programmeerTaal, int aantalKlassen) {
        super(naam, beschrijving, status, datumTijd , taakPunten);
        this.programmeerTaal = programmeerTaal;
        this.aantalKlassen = aantalKlassen;

    }

    public String getProgrammeerTaal() {
        return programmeerTaal;
    }

    public int getAantalKlassen() {
        return aantalKlassen;
    }

    @Override
    public void showTaak() {
        System.out.println("Programmeertaak: " + getNaam());
        System.out.println("Beschrijving: " + getBeschrijving());
        System.out.println("Storypoints: " + getTaakPunten());
        System.out.println("Programmeertaal: " + getProgrammeerTaal());
        System.out.println("Aantal klassen: " + getAantalKlassen());
        System.out.println("Status: " + getStatus());
        System.out.println("Datum aangemaakt: " + getDatumTijd());
        System.out.println();
    }
}