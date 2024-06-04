package menu;

import model.Sprint;
import model.Taak;
import utils.DataSeeder;

import java.util.Scanner;

public class MenukeuzeEditTaak extends Menukeuze {
    public MenukeuzeEditTaak(String titel)
    {
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer de naam van de sprint in waarin de taak moet worden aangemaakt: ");
        String sprintNaam = scanner.nextLine();
        Sprint chosenSprint = DataSeeder.getInstance().getSprint(sprintNaam);
        if (chosenSprint == null) {
            System.out.println("Sprint '" + sprintNaam + "' bestaat niet. Maak eerst een sprint aan.");
            return;
        }

        System.out.println("Voer de naam van de taak in die u wilt bewerken: ");
        String taakNaam = scanner.nextLine();

        Taak chosenTaak = DataSeeder.getInstance().getTaak(taakNaam);
        if (chosenTaak == null) {
            System.out.println("Taak '" + taakNaam + "' bestaat niet. Probeer het opnieuw.");
            return;
        }

        while (true) {
            System.out.println("Voer de nieuwe status van de taak in (Gepland, Bezig, Klaar): ");
            String nieuweTaakStatus = scanner.nextLine();

            if (nieuweTaakStatus.equals("Gepland") || nieuweTaakStatus.equals("Bezig") || nieuweTaakStatus.equals("Klaar")) {
                chosenTaak.setStatus(nieuweTaakStatus);
                break;
            } else {
                System.out.println("Ongeldige status. Voer 'Gepland', 'Bezig' of 'Klaar' in.");
            }
        }
    }
}