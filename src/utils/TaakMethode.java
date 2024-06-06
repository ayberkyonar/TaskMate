package utils;

import model.Taak;

public class TaakMethode {

    public void load(Taak taak) {
        System.out.println("Naam: " + taak.getNaam());
        System.out.println("Beschrijving: " + taak.getBeschrijving());
        System.out.println("Status: " + taak.getStatus());
        System.out.println("Storypoints: " + taak.getTaakPunten());
        System.out.println("Datum aangemaakt: " + taak.getDatumTijd());
        System.out.println("Type taak: " + taak.getTaakType());
        taak.printSpecifiekeInformatie();
        System.out.println();
    }
}
