package model;

import java.util.Date;

public abstract class Taak {

    private String naam;
    private String beschrijving;
    private String status;
    private Date datumTijd;
    private int taakPunten;

    Taak(String naam, String beschrijving, String status, Date datumTijd) {
        this.naam = naam;
        this.beschrijving = beschrijving;
        this.status = status;
        this.datumTijd = datumTijd;
    }

    Taak (String naam, String beschrijving, String status, Date datumTijd, int taakPunten) {
        this(naam, beschrijving, status, datumTijd);
        this.taakPunten = taakPunten;
    }

    public String getNaam() {
        return naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public String getStatus() {
        return status;
    }

    public Date getDatumTijd() {
        return datumTijd;
    }

    public int getTaakPunten() {
        return taakPunten;
    }

    abstract public void showTaak();
}
