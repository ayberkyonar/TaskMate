package menu;

import static java.lang.System.exit;

public class MenukeuzeExit extends Menukeuze {

    public MenukeuzeExit(String titel) {
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit() {
        exit(0);
    }

}