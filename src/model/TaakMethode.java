package model;

import java.util.ArrayList;

public class TaakMethode {

    public void load(Taak taken) {
        System.out.println("Naam: " + taken.getNaam());
        System.out.println("Beschrijving " + taken.getBeschrijving());
        System.out.println("Status: " + taken.getStatus());
        System.out.println("Storypoints: " + taken.getTaakPunten());
        System.out.println("Datum aangemaakt: " + taken.getDatumTijd());
        System.out.println("Type taak: " + taken.getTaakType());
        taken.printSpecifiekeInformatie();
        System.out.println();
    }
}
