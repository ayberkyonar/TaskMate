package model;

import java.util.ArrayList;

public class Sprint {

    private String naam;
    private ArrayList<Taak> taken = new ArrayList<>();

    public Sprint(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    @Override
    public String toString() {
        return naam;
    }

    public void addTaak(Taak taak, Gebruiker observer) {
        taken.add(taak);
        taak.registerObserver(observer);
    }

}