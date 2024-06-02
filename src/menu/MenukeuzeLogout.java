package menu;

import utils.Security;

public class MenukeuzeLogout extends Menukeuze {

    public MenukeuzeLogout (String titel) {
        super (titel);
    }

    @Override
    public void voerMenukeuzeUit () {
        Security.getInstance ().logout ();
    }
}