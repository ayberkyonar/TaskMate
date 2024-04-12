package model;

import java.util.Date;

public abstract class Taak {

    private String titel;
    private String beschrijving;
    private int taakPunten;

    Taak(String titel, String beschrijving) {
        this.titel = titel;
        this.beschrijving = beschrijving;
    }

    Taak (String titel, String beschrijving, int taakPunten) {
        this(titel, beschrijving);
        this.taakPunten = taakPunten;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel (){
        this.titel = titel;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving (){
        this.beschrijving = beschrijving;
    }

    public void setTaakPunten() {
        this.taakPunten = taakPunten;
    }

    public int getTaakPunten() {
        return taakPunten;
    }

    abstract public void showTaak();
}
