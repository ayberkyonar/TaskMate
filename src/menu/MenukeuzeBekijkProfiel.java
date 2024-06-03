package menu;

import model.Gebruiker;
import utils.DataSeeder;
import utils.Security;

public class MenukeuzeBekijkProfiel extends Menukeuze {

    public MenukeuzeBekijkProfiel(String naam) {
        super(naam);
    }

    @Override
    public void voerMenukeuzeUit() {
        Security security = Security.getInstance();
        Gebruiker gebruiker = security.getActieveGebruiker();

        if (gebruiker != null) {
            gebruiker.bekijkProfiel();
        } else {
            System.out.println("Er is geen gebruiker ingelogd.");
        }
    }
}