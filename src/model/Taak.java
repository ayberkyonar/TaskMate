package model;

import java.util.Date;

public abstract class Taak {

    private String titel;
    private String beschrijving;
    private Date datumTijd;

    Taak(String titel, Date datumTijd) {
        this.titel = titel;
        this.datumTijd = datumTijd;
    }

    Taak (String titel, String beschrijving, Date datumTijd) {
        this(titel, datumTijd);
        this.beschrijving = beschrijving;
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

    public Date getDatumTijd() {
        return datumTijd;
    }

    abstract public void showTaak();
}
