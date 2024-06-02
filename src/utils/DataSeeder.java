package utils;

import model.*;
import menu.*;
import java.util.ArrayList;

public class DataSeeder {

    private static DataSeeder instance = null;
    private ArrayList<Sprint> sprints;
    private ArrayList<Taak> taken;
    private ArrayList<Menu> menus;
    private ArrayList<Gebruiker> gebruikers;

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



    private void initialize() {
        Gebruiker ontwerper = new Ontwerper("Ontwerper");
        Gebruiker programmeur = new Programmeur("Programmeur");
        Gebruiker tester = new Tester("Tester");

        gebruikers.add(ontwerper);
        gebruikers.add(programmeur);
        gebruikers.add(tester);

        Menu menu = new Menu("TaskMate");

        menu.addMenukeuze(new MenukeuzeAddSprint("Maak een sprint aan"));
        menu.addMenukeuze(new MenukeuzeShowSprint("Toon sprints"));
        menu.addMenukeuze(new MenukeuzeAddTaak("Maak een taak aan"));
        menu.addMenukeuze(new MenukeuzeShowTaak("Toon taken"));
        menu.addMenukeuze(new MenukeuzeEditTaak("Bewerk een taak"));
        menu.addMenukeuze(new MenukeuzeShowPersoontaken("Toon type taken per type persoon"));
        menu.addMenukeuze(new MenukeuzeExit("Exit"));

        menus.add(menu);

    }

    public ArrayList<Gebruiker> getGebruikers() {
        return gebruikers;
    }

    private DataSeeder() {
        this.sprints = new ArrayList<>();
        this.taken = new ArrayList<>();
        this.menus = new ArrayList<>();
        this.gebruikers = new ArrayList<>();
        initialize();
    }

    public static DataSeeder getInstance() {
        if (instance == null) {
            instance = new DataSeeder();
        }
        return instance;
    }


}
