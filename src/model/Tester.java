package model;

import menu.Menu;
import utils.DataSeeder;

public class Tester extends Gebruiker {
    private int aantalTestCases;

    public Tester(String gebruikersnaam, int aantalTestCases) {
        super(gebruikersnaam);
        this.aantalTestCases = aantalTestCases;
    }

    public int getAantalTestCases() {
        return this.aantalTestCases;
    }

    @Override
    public void bekijkProfiel(){
        System.out.println("Gebruikersnaam: " + getGebruikersnaam());
        System.out.println("Aantal testcases: " + getAantalTestCases());
    }
}
