package model;

import menu.Menu;
import utils.DataSeeder;

public class Programmeur extends Gebruiker{

    private String programmeerNiveau;

    public Programmeur(String gebruikersnaam, String programmeerNiveau) {
        super(gebruikersnaam);
        this.programmeerNiveau = programmeerNiveau;
    }

    public String getProgrammeerNiveau() {
        return this.programmeerNiveau;
    }

    @Override
    public void bekijkProfiel(){
        System.out.println("Gebruikersnaam: " + getGebruikersnaam());
        System.out.println("Programmeerniveau: " + getProgrammeerNiveau());

    }
}
