package menu;

import model.*;
import utils.DataSeeder;

import java.util.ArrayList;
import java.util.Scanner;

public class MenukeuzeShowTaak extends Menukeuze {

    public MenukeuzeShowTaak(String titel){
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de naam van de sprint in waarin je de taken wilt zien: ");
        String sprintNaam = scanner.nextLine();
        Sprint chosenSprint = DataSeeder.getInstance().getSprint(sprintNaam);
        if (chosenSprint == null) {
            System.out.println("Sprint '" + sprintNaam + "' bestaat niet. Maak eerst een sprint aan.");
            return;
        }

        ArrayList<Taak> taken = chosenSprint.getTaken();

        System.out.println("To do:");
        for (Taak taak : taken) {
            if (taak instanceof Gepland) {
                System.out.println(taak.getTitel());
            }
        }

        System.out.println("In progress:");
        for (Taak taak : taken) {
            if (taak instanceof Bezig) {
                System.out.println(taak.getTitel());
            }
        }

        System.out.println("Done:");
        for (Taak taak : taken) {
            if (taak instanceof Klaar) {
                System.out.println(taak.getTitel());
            }
        }
        System.out.println();
    }
}