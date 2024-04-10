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

    public void showTaakStatus() {

    }

    public void addTaak(Taak taak) {
        taken.add(taak);
    }

    public void editTaak(Taak taak) {

    }

    public void deleteTaak(Taak taak) {
        taken.remove(taak);
    }

}
