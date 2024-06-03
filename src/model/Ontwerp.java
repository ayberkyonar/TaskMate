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
        load();
        System.out.println();
    }

    @Override
    protected void printSpecifiekeInformatie() {
        System.out.println("Ontwerp tool: " + getOntwerpTool());
    }

    @Override
    public String getTaakType() {
        return "Ontwerp";
    }
}
