package menu;

import model.Sprint;
import utils.DataSeeder;

import java.util.ArrayList;
import java.util.Scanner;

public class MenukeuzeShowSprint extends Menukeuze {

    public MenukeuzeShowSprint(String titel){
        super(titel);
    }


    @Override
    public void voerMenukeuzeUit(){
        ArrayList<Sprint> sprints = DataSeeder.getInstance().getSprints();
        System.out.println();
        System.out.println("Sprints:");
        for (Sprint sprint : sprints){
            System.out.println(sprint.getNaam());
            System.out.println();
        }

    }

}
