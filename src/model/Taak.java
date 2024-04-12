package model;

public abstract class Taak {

    private String naam;
    private String beschrijving;
    private int taakPunten;

    Taak(String naam, String beschrijving) {
        this.naam = naam;
        this.beschrijving = beschrijving;
    }

    Taak (String naam, String beschrijving, int taakPunten) {
        this(naam, beschrijving);
        this.taakPunten = taakPunten;
    }

    public String getNaam() {
        return naam;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public int getTaakPunten() {
        return taakPunten;
    }

    abstract public void showTaak();
}
