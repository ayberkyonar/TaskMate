package menu;

import model.*;
import utils.DataSeeder;
import utils.Security;

public class MenukeuzeLogin extends Menukeuze {

    public MenukeuzeLogin(String titel) {
        super (titel);
    }

    @Override
    public void voerMenukeuzeUit () {
        Security.getInstance ().login ();
    }
}