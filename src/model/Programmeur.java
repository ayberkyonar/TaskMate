package model;

import menu.Menu;
import utils.DataSeeder;

public class Programmeur extends Gebruiker{

    public Programmeur(String gebruikersnaam) {
        super(gebruikersnaam);
    }

    @Override
    public Menu getMenu() {
        return DataSeeder.getInstance().getProgrammeurMenu();
    }
}
