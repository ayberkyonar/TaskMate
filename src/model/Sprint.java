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

    public void addTaak(Taak taak) {
        taken.add(taak);
    }

    public void addTaakToGebruiker(Taak taak, Gebruiker gebruiker) {
        if ((taak instanceof Ontwerp && gebruiker instanceof Ontwerper) ||
                (taak instanceof Programmeer && gebruiker instanceof Programmeur) ||
                (taak instanceof Test && gebruiker instanceof Tester)) {
            gebruiker.addTaak(taak);
        }
    }
}