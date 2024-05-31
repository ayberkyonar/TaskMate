package model;

import java.util.ArrayList;

public class Ontwerper extends Persoon {

    private ArrayList<Taak> taken = new ArrayList<>();

    public Ontwerper(String naam) {
        super(naam);
    }

    @Override
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    public void printNaam() {
        System.out.println("Ontwerper: " + getNaam());
    }
}