package model;

import utils.Observer;
import utils.TaakMelder;
import utils.TaakMethode;

import java.util.ArrayList;
import java.util.Date;

public abstract class Taak {

    private String naam;
    private String beschrijving;
    private String status;
    private Date datumTijd;
    private int taakPunten;
    public ArrayList<Observer> observers = new ArrayList<>();

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

    public void setStatus(String nieuweTaakStatus) {
        this.status = nieuweTaakStatus;
        TaakMelder taakMelder = new TaakMelder();
        taakMelder.notifyObservers(this);
    }

    public void showTaak() {
        TaakMethode taakMethode = new TaakMethode();
        taakMethode.load(this);
    }

    abstract public String getTaakType();

    abstract public void printSpecifiekeInformatie();

}
