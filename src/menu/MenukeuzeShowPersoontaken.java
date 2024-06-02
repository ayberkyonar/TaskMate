package menu;

import model.*;
import utils.DataSeeder;

import java.util.ArrayList;
import java.util.Scanner;

public class MenukeuzeShowPersoontaken extends Menukeuze {

    public MenukeuzeShowPersoontaken(String titel){
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit(){
        ArrayList<Gebruiker> gebruikers = DataSeeder.getInstance().getGebruikers();
        Scanner scanner = new Scanner(System.in);
        boolean geldigeInvoer = false;

        while (!geldigeInvoer) {
            System.out.println();
            System.out.println("Voer de naam van de sprint in waarin je de taken wilt zien: ");
            String sprintNaam = scanner.nextLine();
            Sprint chosenSprint = DataSeeder.getInstance().getSprint(sprintNaam);
            if (chosenSprint == null) {
                System.out.println("Sprint '" + sprintNaam + "' bestaat niet.");
                continue;
            }

            System.out.println("Kies het type gebruiker (Ontwerper, Programmeur of Tester): ");
            String gebruikerType = scanner.nextLine();
            System.out.println();

            for (Gebruiker gebruiker : gebruikers){
                if (gebruikerType.equalsIgnoreCase("Ontwerper") && gebruiker instanceof Ontwerper) {
                    System.out.println("Ontwerptaken van " + gebruiker.getNaam() + ":");
                    for (Ontwerp taak : ((Ontwerper) gebruiker).getOntwerpTaken()) {
                        taak.showTaak();
                    }
                    geldigeInvoer = true;
                } else if (gebruikerType.equalsIgnoreCase("Programmeur") && gebruiker instanceof Programmeur) {
                    System.out.println("Programmeertaken van " + gebruiker.getNaam() + ":");
                    for (Programmeer taak : ((Programmeur) gebruiker).getProgrammeerTaken()) {
                        taak.showTaak();
                    }
                    geldigeInvoer = true;
                } else if (gebruikerType.equalsIgnoreCase("Tester") && gebruiker instanceof Tester) {
                    System.out.println("Testtaken van " + gebruiker.getNaam() + ":");
                    for (Test taak : ((Tester) gebruiker).getTestTaken()) {
                        taak.showTaak();
                    }
                    geldigeInvoer = true;
                }
                System.out.println();
            }

            if (!geldigeInvoer) {
                System.out.println("Ongeldige invoer. Probeer het opnieuw.");
            }
        }
    }

}