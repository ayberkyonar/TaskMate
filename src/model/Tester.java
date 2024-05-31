package model;

import java.util.ArrayList;

public class Tester extends Persoon {
    private ArrayList<Taak> taken = new ArrayList<>();

    public Tester(String naam) {
        super(naam);
    }

    @Override
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    public void printNaam() {
        System.out.println("Tester: " + getNaam());
    }
}