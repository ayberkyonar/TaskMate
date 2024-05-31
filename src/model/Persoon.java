package model;

import java.util.ArrayList;

public class Persoon {

    private String naam;

    private ArrayList<Taak> taken = new ArrayList<>();

    public Persoon(String naam) {
        this.naam = naam;
    }
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }
    public String getNaam() {
        return naam;
    }

    public void printNaam() {
    }
}
