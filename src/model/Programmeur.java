package model;

import java.util.ArrayList;

public class Programmeur extends Gebruiker {
    private ArrayList<Programmeer> programmeerTaken;

    public Programmeur(String naam) {
        super(naam);
        this.programmeerTaken = new ArrayList<>();
    }

    @Override
    public void addTaak(Taak taak) {
        if (taak instanceof Programmeer) {
            this.programmeerTaken.add((Programmeer) taak);
        }
    }

    public ArrayList<Programmeer> getProgrammeerTaken() {
        return this.programmeerTaken;
    }
}