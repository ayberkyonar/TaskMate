package model;

import java.util.Date;

public class Bezig extends Taak{

    public Bezig(String naam, String beschrijving) {
        super(naam, beschrijving);
    }

    public Bezig(String naam, String beschrijving, int taakPunten) {
        super(naam, beschrijving, taakPunten);
    }

    @Override
    public void showTaak() {
        System.out.println(getTitel());
        System.out.println(getBeschrijving());
        System.out.println(getTaakPunten());
        System.out.println();
    }
}
