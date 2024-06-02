package model;

import java.util.ArrayList;

public class Gebruiker {
    private String naam;
    private ArrayList<Taak> taken;

    public Gebruiker(String naam) {
        this.naam = naam;
        this.taken = new ArrayList<>();
    }

    public void addTaak(Taak taak) {
        this.taken.add(taak);
    }

    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    public String getNaam() {
        return naam;
    }
}