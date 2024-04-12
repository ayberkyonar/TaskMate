package model;

import java.util.Date;

public class Klaar extends Taak {

    private Date eindDatumTijd;

    public Klaar(String naam, String beschrijving, Date eindDatumTijd) {
        super(naam, beschrijving);
        this.eindDatumTijd = eindDatumTijd;
    }

    public Klaar(String naam, String beschrijving, int taakPunten , Date eindDatumTijd) {
        super(naam, beschrijving, taakPunten);
        this.eindDatumTijd = eindDatumTijd;
    }

    public Date getEindDatumTijd() {
        return eindDatumTijd;
    }

    @Override
    public void showTaak() {
        System.out.println(getTitel());
        System.out.println(getBeschrijving());
        System.out.println(getTaakPunten());
        System.out.println("Datum afgerond" + getEindDatumTijd());
        System.out.println();
    }
}
