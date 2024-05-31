package model;

import java.util.ArrayList;

public class Programmeur extends Persoon {

    private ArrayList<Taak> taken = new ArrayList<>();

    public Programmeur(String naam) {
        super(naam);
    }

    @Override
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    public void printNaam() {
        System.out.println("Programmeur: " + getNaam());
    }
}