package model;

import java.util.Date;

public class Programmeer extends Taak{

    private String programmeerTaal;
    private int aantalKlassen;


    public Programmeer(String naam, String beschrijving, String status , Date datumTijd, String programmeerTaal, int aantalKlassen, TaakMethode taakMethode) {
        super(naam, beschrijving, status, datumTijd, taakMethode);
        this.programmeerTaal = programmeerTaal;
        this.aantalKlassen = aantalKlassen;
    }

    public Programmeer(String naam, String beschrijving, String status , Date datumTijd, int taakPunten, String programmeerTaal, int aantalKlassen, TaakMethode taakMethode) {
        super(naam, beschrijving, status, datumTijd , taakPunten, taakMethode);
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
        TaakMethode taakMethode = new TaakMethode();
        taakMethode.load(this);
    }

    @Override
    public void printSpecifiekeInformatie() {
        System.out.println("Programmeertaal: " + getProgrammeerTaal());
        System.out.println("Aantal klassen: " + getAantalKlassen());
    }

    @Override
    public String getTaakType() {
        return "Programmeer";
    }
}
