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
        ArrayList<Persoon> personen = DataSeeder.getInstance().getPersonen();
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

            System.out.println("Kies het type persoon (Ontwerper, Programmeur of Tester): ");
            String persoonType = scanner.nextLine();

            System.out.println();

            for (Persoon persoon : personen){
                ArrayList<Taak> taken = chosenSprint.getTaken();
                for (Taak taak : taken) {
                    if (persoonType.equalsIgnoreCase("Ontwerper") && taak instanceof Ontwerp && persoon.getTaken().contains(taak)) {
                        persoon.printNaam();
                        System.out.println("Ontwerptaken:");
                        taak.showTaak();
                        geldigeInvoer = true;
                    } else if (persoonType.equalsIgnoreCase("Programmeur") && taak instanceof Programmeer && persoon.getTaken().contains(taak)) {
                        persoon.printNaam();
                        System.out.println("Programmeertaken:");
                        taak.showTaak();
                        geldigeInvoer = true;
                    } else if (persoonType.equalsIgnoreCase("Tester") && taak instanceof Test && persoon.getTaken().contains(taak)) {
                        persoon.printNaam();
                        System.out.println("Testtaken:");
                        taak.showTaak();
                        geldigeInvoer = true;
                    }
                }
                System.out.println();
            }

            if (!geldigeInvoer) {
                System.out.println("Ongeldige invoer. Probeer het opnieuw.");
            }
        }
    }

}