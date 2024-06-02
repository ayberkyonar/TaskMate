package model;

import java.util.ArrayList;

public class Tester extends Gebruiker {
    private ArrayList<Test> testTaken;

    public Tester(String naam) {
        super(naam);
        this.testTaken = new ArrayList<>();
    }

    @Override
    public void addTaak(Taak taak) {
        if (taak instanceof Test) {
            this.testTaken.add((Test) taak);
        }
    }

    public ArrayList<Test> getTestTaken() {
        return this.testTaken;
    }
}