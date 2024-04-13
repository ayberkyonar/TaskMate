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
        System.out.println();
        System.out.println("Voer de naam van de sprint in waarin je de taken wilt zien: ");
        String sprintNaam = scanner.nextLine();
        Sprint chosenSprint = DataSeeder.getInstance().getSprint(sprintNaam);
        if (chosenSprint == null) {
            System.out.println("Sprint '" + sprintNaam + "' bestaat niet.");
            return;
        }

        ArrayList<Taak> taken = chosenSprint.getTaken();

        System.out.println();
        System.out.println("Ontwerptaken:");
        System.out.println();
        for (Taak taak : taken) {
            if (taak instanceof Ontwerp) {
                taak.showTaak();
            }
        }
        System.out.println();
        System.out.println("Programmeertaken:");
        System.out.println();
        for (Taak taak : taken) {
            if (taak instanceof Programmeer) {
                taak.showTaak();
            }
        }
        System.out.println();
        System.out.println("Testtaken:");
        System.out.println();
        for (Taak taak : taken) {
            if (taak instanceof Test) {
                taak.showTaak();
            }
        }
        System.out.println();
    }
}