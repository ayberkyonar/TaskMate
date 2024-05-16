package menu;

import model.Ontwerp;
import model.Programmeer;
import model.Test;
import model.Sprint;
import model.Taak;
import utils.DataSeeder;

import java.util.Date;
import java.util.Scanner;

public class MenukeuzeAddTaak extends Menukeuze{

    public MenukeuzeAddTaak(String titel){
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit(){
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Voer de naam van de sprint in waarin de taak moet worden aangemaakt: ");
        String sprintNaam = scanner.nextLine();

        Sprint chosenSprint = DataSeeder.getInstance().getSprint(sprintNaam);
        if (chosenSprint == null) {
            System.out.println("Sprint '" + sprintNaam + "' bestaat niet. Maak eerst een sprint aan.");
            return;
        }

        System.out.println("Voer de naam van de nieuwe taak in: ");
        String taakNaam = scanner.nextLine();

        System.out.println("Voer de beschrijving van de nieuwe taak in: ");
        String taakBeschrijving = scanner.nextLine();
        System.out.println("Voer de aantal punten die je wilt geven aan de taak (je kan dit ook leeg laten): ");
        String taakPuntenInput = scanner.nextLine();

        System.out.println("Voer het type van de taak in (Ontwerp, Programmeer, Test): ");
        String taakType = scanner.nextLine();

        System.out.println("Voer de status van de taak in (Gepland, Bezig, Klaar): ");
        String taakStatus = scanner.nextLine();

        Taak nieuweTaak;
        switch (taakType.toLowerCase()) {
            case "ontwerp":
                System.out.println("Voer de ontwerptool in die wordt gebruikt: ");
                String ontwerpTool = scanner.nextLine();
                if (taakPuntenInput.isEmpty()) {
                    nieuweTaak = new Ontwerp(taakNaam, taakBeschrijving, taakStatus, new Date(), ontwerpTool);
                } else {
                    int taakPunten = Integer.parseInt(taakPuntenInput);
                    nieuweTaak = new Ontwerp(taakNaam, taakBeschrijving, taakStatus, new Date(), taakPunten, ontwerpTool);
                }
                break;
            case "programmeer":
                System.out.println("Voer de programmeertaal in die wordt gebruikt: ");
                String programmeerTaal = scanner.nextLine();
                System.out.println("Voer het aantal klassen in dat wordt gebruikt: ");
                int aantalKlassen = scanner.nextInt();
                scanner.nextLine();

                if (taakPuntenInput.isEmpty()) {
                    nieuweTaak = new Programmeer(taakNaam, taakBeschrijving, taakStatus, new Date(), programmeerTaal, aantalKlassen);
                } else {
                    int taakPunten = Integer.parseInt(taakPuntenInput);
                    nieuweTaak = new Programmeer(taakNaam, taakBeschrijving, taakStatus, new Date(), taakPunten, programmeerTaal, aantalKlassen);
                }
                break;
            case "test":
                System.out.println("Voer het aantal testcases in: ");
                int aantalTestCases = scanner.nextInt();
                scanner.nextLine();
                if (taakPuntenInput.isEmpty()) {
                    nieuweTaak = new Test(taakNaam, taakBeschrijving, taakStatus, new Date(), aantalTestCases);
                } else {
                    int taakPunten = Integer.parseInt(taakPuntenInput);
                    nieuweTaak = new Test(taakNaam, taakBeschrijving, taakStatus, new Date(), taakPunten, aantalTestCases);
                }
                break;
            default:
                System.out.println("Taak is niet aangemaakt, probeer het opnieuw.");
                return;
        }
        chosenSprint.addTaak(nieuweTaak);
        DataSeeder.getInstance().addTaak(nieuweTaak);
        //System.out.println("Nieuwe taak '" + taakNaam + "' is toegevoegd aan de sprint '" + chosenSprint.getNaam() + "'.");
        //System.out.println();
    }
}