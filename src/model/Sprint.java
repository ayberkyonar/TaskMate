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

    public void addTaak(Taak taak) {
        taken.add(taak);
    }

}
