package model;

import java.util.Date;

public class Test extends Taak {

    private int aantalTestCases;


    public Test(String naam, String beschrijving, String status , Date datumTijd, int aantalTestCases) {
        super(naam, beschrijving, status, datumTijd);
        this.aantalTestCases = aantalTestCases;
    }

    public Test(String naam, String beschrijving, String status , Date datumTijd, int taakPunten , int aantalTestCases) {
        super(naam, beschrijving, status, datumTijd , taakPunten);
        this.aantalTestCases = aantalTestCases;

    }

    public int getAantalTestCases() {
        return aantalTestCases;
    }


    @Override
    public void showTaak() {
        System.out.println("Testtaak: " + getNaam());
        System.out.println("Beschrijving: " + getBeschrijving());
        System.out.println("Storypoints: " + getTaakPunten());
        System.out.println("Aantal testcases: " + getAantalTestCases());
        System.out.println("Status: " + getStatus());
        System.out.println("Datum aangemaakt: " + getDatumTijd());
        System.out.println();
    }
}
