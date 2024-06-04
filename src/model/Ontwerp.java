package model;

import java.util.Date;
import model.TaakMethode;

public class Ontwerp extends Taak{
    private String ontwerpTool;

    public Ontwerp(String naam, String beschrijving, String status , Date datumTijd, String ontwerpTool, TaakMethode taakMethode) {
        super(naam, beschrijving, status, datumTijd, taakMethode);
        this.ontwerpTool = ontwerpTool;
    }

    public Ontwerp(String naam, String beschrijving, String status , Date datumTijd, int taakPunten, String ontwerpTool, TaakMethode taakMethode) {
        super(naam, beschrijving, status, datumTijd , taakPunten, taakMethode);
        this.ontwerpTool = ontwerpTool;

    }

    public String getOntwerpTool() {
        return ontwerpTool;
    }

    @Override
    public void showTaak() {
        TaakMethode taakMethode = new TaakMethode();
        taakMethode.load(this);
    }

    @Override
    public void printSpecifiekeInformatie() {
        System.out.println("Ontwerp tool: " + getOntwerpTool());
    }

    @Override
    public String getTaakType() {
        return "Ontwerp";
    }
}
