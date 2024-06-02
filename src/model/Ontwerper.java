package model;

import utils.DataSeeder;
import menu.Menu;

public class Ontwerper extends Gebruiker {

public Ontwerper(String gebruikersnaam) {
        super(gebruikersnaam);
    }

    @Override
    public Menu getMenu() {
        return DataSeeder.getInstance ().getOntwerperMenu ();
    }
}
