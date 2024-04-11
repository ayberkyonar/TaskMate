package menu;

import model.Sprint;
import utils.DataSeeder;
import java.util.Scanner;

public class MenukeuzeAddSprint extends Menukeuze{

    public MenukeuzeAddSprint(String titel){
        super(titel);
    }

    @Override
    public void voerMenukeuzeUit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer de naam van de nieuwe sprint in: ");
        String sprintNaam = scanner.nextLine();
        Sprint nieuweSprint = new Sprint(sprintNaam);
        DataSeeder.getInstance().addSprint(nieuweSprint);
        System.out.println("Nieuwe sprint '" + sprintNaam + "' is toegevoegd.");
        System.out.println();
    }
}