package model;

import java.util.Date;

public class Test extends Taak {

    private int aantalTestCases;

    public Test(String naam, String beschrijving, String status , Date datumTijd, int aantalTestCases, TaakMethode taakMethode) {
        super(naam, beschrijving, status, datumTijd, taakMethode);
        this.aantalTestCases = aantalTestCases;
    }

    public Test(String naam, String beschrijving, String status , Date datumTijd, int taakPunten , int aantalTestCases, TaakMethode taakMethode) {
        super(naam, beschrijving, status, datumTijd , taakPunten, taakMethode);
        this.aantalTestCases = aantalTestCases;
    }

    public int getAantalTestCases() {
        return aantalTestCases;
    }

    @Override
    public void showTaak() {
        TaakMethode taakMethode = new TaakMethode();
        taakMethode.load(this);
    }

    @Override
    public void printSpecifiekeInformatie() {
        System.out.println("Aantal testcases: " + getAantalTestCases());
    }

    @Override
    public String getTaakType() {
        return "Test";
    }

}
