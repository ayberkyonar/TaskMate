package model;

import java.util.ArrayList;

public class Sprint {
    private String naam;
    private ArrayList<Taak> taken = new ArrayList<>();

    public Sprint(String naam) {
        this.naam = naam;
    }

    public void toonSprint() {
        System.out.println("Sprint: " + naam);
    }

    public void showTaakStatus() {
        for (Taak taak : taken) {
            taak.showTaak();
        }
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
