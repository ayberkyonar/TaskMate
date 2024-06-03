package model;

import menu.Menu;
import utils.DataSeeder;

public abstract class Gebruiker implements Observer {

    private String gebruikersnaam;

    public Gebruiker (String gebruikersnaam) {
        setGebruikersnaam (gebruikersnaam);
    }

    public String getGebruikersnaam () {
        return this.gebruikersnaam;
    }

    private void setGebruikersnaam (String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public boolean login (String gebruikersnaam) {
        return this.getGebruikersnaam ().equals (gebruikersnaam);
    }

    @Override
    public void update(Taak taak) {
        System.out.println();
        System.out.println("Hallo " + getGebruikersnaam() + ", de status van de taak " + taak.getNaam() + " is veranderd naar: " + taak.getStatus());
        System.out.println();
    }

    abstract public void bekijkProfiel();

}
