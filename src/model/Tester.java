package model;

import menu.Menu;
import utils.DataSeeder;

public class Tester extends Gebruiker {

    public Tester(String gebruikersnaam) {
        super(gebruikersnaam);
    }

    @Override
    public Menu getMenu() {
        return DataSeeder.getInstance().getTesterMenu();
    }
}
