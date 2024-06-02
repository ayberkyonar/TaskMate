package model;

import menu.Menu;

public abstract class Gebruiker {

    private String gebruikersnaam;

    private void setGebruikersnaam (String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getGebruikersnaam () {
        return this.gebruikersnaam;
    }

    public Gebruiker (String gebruikersnaam) {
        setGebruikersnaam (gebruikersnaam);
    }

    public boolean login (String gebruikersnaam) {
        return this.getGebruikersnaam ().equals (gebruikersnaam);
    }

    public abstract Menu getMenu ();
}
