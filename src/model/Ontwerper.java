package model;

import java.util.ArrayList;

public class Ontwerper extends Gebruiker {
    private ArrayList<Ontwerp> ontwerpTaken;

    public Ontwerper(String naam) {
        super(naam);
        this.ontwerpTaken = new ArrayList<>();
    }

    @Override
    public void addTaak(Taak taak) {
        if (taak instanceof Ontwerp) {
            this.ontwerpTaken.add((Ontwerp) taak);
        }
    }

    public ArrayList<Ontwerp> getOntwerpTaken() {
        return this.ontwerpTaken;
    }
}