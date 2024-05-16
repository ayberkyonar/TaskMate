package utils;

import model.*;
import menu.*;
import java.util.ArrayList;

public class DataSeeder {

    private static DataSeeder instance = null;
    private ArrayList<Sprint> sprints;
    private ArrayList<Taak> taken;
    private ArrayList<Menu> menus;

    public Menu getMenu() {
        return menus.get(0);
    }

    public void addSprint(Sprint sprint) {
        this.sprints.add(sprint);
    }

    public ArrayList<Sprint> getSprints() {
        return this.sprints;
    }

    public Sprint getSprint(String sprintNaam) {
        for (Sprint sprint : this.sprints) {
            if (sprint.getNaam().equals(sprintNaam)) {
                return sprint;
            }
        }
        return null;
    }

    public void addTaak(Taak taak) {
        this.taken.add(taak);
    }

    public Taak getTaak(String taakNaam) {
        for (Taak taak : this.taken) {
            if (taak.getNaam().equals(taakNaam)) {
                return taak;
            }
        }
        return null;
    }

    private void initialize () {
        Menu menu = new Menu("TaskMate");

        menu.addMenukeuze(new MenukeuzeAddSprint("Maak een sprint aan"));
        menu.addMenukeuze(new MenukeuzeShowSprint("Toon sprints"));
        menu.addMenukeuze(new MenukeuzeAddTaak("Maak een taak aan"));
        menu.addMenukeuze(new MenukeuzeShowTaak("Toon taken"));
        menu.addMenukeuze(new MenukeuzeEditTaak("Bewerk een taak"));
        menu.addMenukeuze(new MenukeuzeExit("Exit"));

        menus.add(menu);
    }

    private DataSeeder() {
        this.sprints = new ArrayList<>();
        this.taken = new ArrayList<>();
        this.menus = new ArrayList<>();
        initialize();
    }

    public static DataSeeder getInstance() {
        if (instance == null) {
            instance = new DataSeeder();
        }
        return instance;
    }

}
