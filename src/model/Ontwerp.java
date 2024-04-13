package model;

import java.util.Date;

public class Ontwerp extends Taak{
    private String ontwerpTool;


    public Ontwerp(String naam, String beschrijving, String status , Date datumTijd, String ontwerpTool) {
        super(naam, beschrijving, status, datumTijd);
        this.ontwerpTool = ontwerpTool;
    }

    public Ontwerp(String naam, String beschrijving, String status , Date datumTijd, int taakPunten, String ontwerpTool) {
        super(naam, beschrijving, status, datumTijd , taakPunten);
        this.ontwerpTool = ontwerpTool;

    }

    public String getOntwerpTool() {
        return ontwerpTool;
    }

    @Override
    public void showTaak() {
        System.out.println("Ontwerptaak: " + getNaam());
        System.out.println("Beschrijving: " + getBeschrijving());
        System.out.println("Storypoints: " + getTaakPunten());
        System.out.println("Ontwerp tool: " + getOntwerpTool());
        System.out.println("Status: " + getStatus());
        System.out.println("Datum aangemaakt: " + getDatumTijd());
        System.out.println();
    }
}
