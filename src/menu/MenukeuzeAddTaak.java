package menu;

import model.*;
import utils.*;
import java.util.Date;
import java.util.Scanner;
public class MenukeuzeAddTaak extends Menukeuze{

    private Scanner scanner = new Scanner(System.in);

    public MenukeuzeAddTaak(String titel){
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit(){
        Security security = Security.getInstance();
        Gebruiker gebruiker = security.getActieveGebruiker();

        Sprint chosenSprint = getSprint();
        if (chosenSprint == null) {
            return;
        }

        Taak nieuweTaak = createTaak();
        if (nieuweTaak == null) {
            return;
        }

        chosenSprint.addTaak(nieuweTaak, gebruiker);
        DataSeeder.getInstance().addTaak(nieuweTaak);
    }

    private Sprint getSprint() {
        System.out.println();
        System.out.println("Voer de naam van de sprint in waarin de taak moet worden aangemaakt: ");
        String sprintNaam = scanner.nextLine();

        Sprint chosenSprint = DataSeeder.getInstance().getSprint(sprintNaam);
        if (chosenSprint == null) {
            System.out.println("Sprint '" + sprintNaam + "' bestaat niet. Maak eerst een sprint aan.");
        }
        return chosenSprint;
    }

    private Taak createTaak() {
        String taakNaam;
        do {
            System.out.println("Voer de naam van de nieuwe taak in: ");
            taakNaam = scanner.nextLine();

            if (DataSeeder.getInstance().getTaak(taakNaam) != null) {
                System.out.println("Een taak met deze naam bestaat al. Probeer het opnieuw met een andere naam.");
                taakNaam = null;
            }
        } while (taakNaam == null);

        System.out.println("Voer de beschrijving van de nieuwe taak in: ");
        String taakBeschrijving = scanner.nextLine();

        System.out.println("Voer de aantal punten die je wilt geven aan de taak (je kan dit ook leeg laten): ");
        String taakPuntenInput = scanner.nextLine();

        System.out.println("Voer het type van de taak in (Ontwerp, Programmeer, Test): ");
        String taakType = scanner.nextLine();

        System.out.println("Voer de status van de taak in (Gepland, Bezig, Klaar): ");
        String taakStatus = scanner.nextLine();

        switch (taakType.toLowerCase()) {
            case "ontwerp":
                return createOntwerpTaak(taakNaam, taakBeschrijving, taakStatus, taakPuntenInput);
            case "programmeer":
                return createProgrammeerTaak(taakNaam, taakBeschrijving, taakStatus, taakPuntenInput);
            case "test":
                return createTestTaak(taakNaam, taakBeschrijving, taakStatus, taakPuntenInput);
            default:
                System.out.println("Taak is niet aangemaakt, probeer het opnieuw.");
                return null;
        }
    }

    private Taak createOntwerpTaak(String taakNaam, String taakBeschrijving, String taakStatus, String taakPuntenInput) {
        System.out.println("Voer de ontwerptool in die wordt gebruikt: ");
        String ontwerpTool = scanner.nextLine();
        if (taakPuntenInput.isEmpty()) {
            return new Ontwerp(taakNaam, taakBeschrijving, taakStatus, new Date(), ontwerpTool);
        } else {
            int taakPunten = Integer.parseInt(taakPuntenInput);
            return new Ontwerp(taakNaam, taakBeschrijving, taakStatus, new Date(), taakPunten, ontwerpTool);
        }
    }

    private Taak createProgrammeerTaak(String taakNaam, String taakBeschrijving, String taakStatus, String taakPuntenInput) {
        System.out.println("Voer de programmeertaal in die wordt gebruikt: ");
        String programmeerTaal = scanner.nextLine();
        System.out.println("Voer het aantal klassen in dat wordt gebruikt: ");
        int aantalKlassen = scanner.nextInt();
        scanner.nextLine();

        if (taakPuntenInput.isEmpty()) {
            return new Programmeer(taakNaam, taakBeschrijving, taakStatus, new Date(), programmeerTaal, aantalKlassen);
        } else {
            int taakPunten = Integer.parseInt(taakPuntenInput);
            return new Programmeer(taakNaam, taakBeschrijving, taakStatus, new Date(), taakPunten, programmeerTaal, aantalKlassen);
        }
    }

    private Taak createTestTaak(String taakNaam, String taakBeschrijving, String taakStatus, String taakPuntenInput) {
        System.out.println("Voer het aantal testcases in: ");
        int aantalTestCases = scanner.nextInt();
        scanner.nextLine();
        if (taakPuntenInput.isEmpty()) {
            return new Test(taakNaam, taakBeschrijving, taakStatus, new Date(), aantalTestCases);
        } else {
            int taakPunten = Integer.parseInt(taakPuntenInput);
            return new Test(taakNaam, taakBeschrijving, taakStatus, new Date(), taakPunten, aantalTestCases);
        }
    }
}