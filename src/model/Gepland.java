package model;

import java.util.Date;

public class Gepland extends Taak{

    public Gepland(String naam, String beschrijving, Date datumTijd) {
        super(naam, beschrijving, datumTijd);
    }

    @Override
    public void showTaak() {
        System.out.println("To do: " + getTitel() + " - " + getBeschrijving() + " - " + getDatumTijd());
    }
}
