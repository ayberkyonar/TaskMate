package model;

import utils.DataSeeder;
import menu.Menu;

public class Ontwerper extends Gebruiker {

    private int ontwerpErvaring;
    private String ontwerpSpecialisatie;

    public Ontwerper(String gebruikersnaam, int ontwerpErvaring, String ontwerpSpecialisatie) {
        super(gebruikersnaam);
        this.ontwerpErvaring = ontwerpErvaring;
        this.ontwerpSpecialisatie = ontwerpSpecialisatie;
    }

    public int getOntwerpErvaring() {
        return this.ontwerpErvaring;
    }

    public String getOntwerpSpecialisatie() {
        return this.ontwerpSpecialisatie;
    }

    @Override
    public void bekijkProfiel(){
        System.out.println("Gebruikersnaam: " + getGebruikersnaam());
        System.out.println("Ontwerp ervaring: " + getOntwerpErvaring());
        System.out.println("Ontwerp specialisatie: " + getOntwerpSpecialisatie());
    }
}
