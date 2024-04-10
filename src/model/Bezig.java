package model;

import java.util.Date;

public class Bezig extends Taak{

    public Bezig(String naam, String beschrijving, Date datumTijd) {
        super(naam, beschrijving, datumTijd);
    }

    @Override
    public void showTaak() {
        System.out.println("In progress: " + getTitel() + " - " + getBeschrijving() + " - " + getDatumTijd());
    }
}
