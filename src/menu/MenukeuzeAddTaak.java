package menu;

import model.Bezig;
import model.Gepland;
import model.Klaar;
import model.Sprint;
import model.Taak;
import utils.DataSeeder;

import java.util.ArrayList;
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

        System.out.println("Voer de status van de taak in (Gepland, Bezig of Klaar): ");
        String taakStatus = scanner.nextLine();

        Taak nieuweTaak;
        switch (taakStatus.toLowerCase()) {
            case "gepland":
                if (taakPuntenInput.isEmpty()) {
                    nieuweTaak = new Gepland(taakNaam, taakBeschrijving, new Date());
                } else {
                    int taakPunten = Integer.parseInt(taakPuntenInput);
                    nieuweTaak = new Gepland(taakNaam, taakBeschrijving, taakPunten, new Date());
                }
                break;
            case "bezig":
                if (taakPuntenInput.isEmpty()) {
                    nieuweTaak = new Bezig(taakNaam, taakBeschrijving);
                } else {
                    int taakPunten = Integer.parseInt(taakPuntenInput);
                    nieuweTaak = new Bezig(taakNaam, taakBeschrijving, taakPunten);
                }
                break;
            case "klaar":
                if (taakPuntenInput.isEmpty()) {
                    nieuweTaak = new Klaar(taakNaam, taakBeschrijving, new Date());
                } else {
                    int taakPunten = Integer.parseInt(taakPuntenInput);
                    nieuweTaak = new Klaar(taakNaam, taakBeschrijving, taakPunten, new Date());
                }
                break;
            default:
                System.out.println("Taak is niet aangemaakt, probeer het opnieuw.");
                return;
        }
        chosenSprint.addTaak(nieuweTaak);
        System.out.println("Nieuwe taak '" + taakNaam + "' is toegevoegd aan de sprint '" + chosenSprint.getNaam() + "'.");
        System.out.println();
    }
}