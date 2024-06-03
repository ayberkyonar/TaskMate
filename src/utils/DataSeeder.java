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

    public Menu getMenu () {
        Security security = Security.getInstance ();

        if (!security.isIngelogd ()) {
            return menus.get (0);
        } else {
            return menus.get (1);
        }
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

    public Gebruiker getGebruiker (String gebruikersnaam) {

        for (Gebruiker gebruiker : gebruikers) {

            if (gebruiker.login (gebruikersnaam)) {
                return gebruiker;
            }
        }

        return null;
    }


    private void initialize() {
        gebruikers.add(new Ontwerper("Ontwerper", 5, "UX Design"));
        gebruikers.add(new Programmeur("Programmeur", "Junior"));
        gebruikers.add(new Tester("Tester", 7));

        MenukeuzeLogin inloggen = new MenukeuzeLogin ("Log in");
        MenukeuzeLogout uitloggen = new MenukeuzeLogout ("Log uit");
        MenukeuzeAddSprint addSprint = new MenukeuzeAddSprint ("Maak een sprint aan");
        MenukeuzeShowSprint showSprint = new MenukeuzeShowSprint ("Toon sprints");
        MenukeuzeAddTaak addTaak = new MenukeuzeAddTaak ("Maak een taak aan");
        MenukeuzeShowTaak showTaak = new MenukeuzeShowTaak ("Toon taken");
        MenukeuzeEditTaak editTaak = new MenukeuzeEditTaak ("Bewerk een taak");
        MenukeuzeBekijkProfiel bekijkProfiel = new MenukeuzeBekijkProfiel ("Bekijk profiel");
        MenukeuzeExit exit = new MenukeuzeExit ("Exit");


        Menu menu = new Menu("Gebruiker");
        menu.addMenukeuze(inloggen);
        menu.addMenukeuze(exit);

        Menu ingelogdMenu = new Menu("TaskMate");
        ingelogdMenu.addMenukeuze(addSprint);
        ingelogdMenu.addMenukeuze(showSprint);
        ingelogdMenu.addMenukeuze(addTaak);
        ingelogdMenu.addMenukeuze(showTaak);
        ingelogdMenu.addMenukeuze(editTaak);
        ingelogdMenu.addMenukeuze(bekijkProfiel);
        ingelogdMenu.addMenukeuze(uitloggen);
        ingelogdMenu.addMenukeuze(exit);

        menus.add(menu);
        menus.add(ingelogdMenu);

    }



}
