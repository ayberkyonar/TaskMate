package model;

import java.util.Date;

public class Klaar extends Taak {

    private Date eindDatumTijd;

    public Klaar(String naam, String beschrijving, Date datumTijd, Date eindDatumTijd) {
        super(naam, beschrijving, datumTijd);
        this.eindDatumTijd = eindDatumTijd;
    }

    @Override
    public void showTaak() {
        System.out.println("Done: " + getTitel() + " - " + getBeschrijving() + " - " + getDatumTijd() + " - " + eindDatumTijd);
    }
}
