package menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private String titel;
    private ArrayList<Menukeuze> menukeuzes;

    private void setTitel(String titel) {
        this.titel = titel;
    }

    public Menu(String titel) {
        setTitel(titel);
        menukeuzes = new ArrayList<>();
    }

    public void addMenukeuze(Menukeuze menukeuze) {
        menukeuzes.add(menukeuze);
    }

    public void showMenu() {
        boolean input = false;

        while (!input) {
            System.out.println(titel);
            int counter = 1;
            for (int i = 0; i < menukeuzes.size(); i++) {
                System.out.println((counter++) + ". " + menukeuzes.get(i).getTitel());
            }

            try {
                System.out.println("Maak een keuze: ");
                Scanner scanner = new Scanner(System.in);

                int keuze = scanner.nextInt();
                if (keuze > 0 && keuze <= menukeuzes.size()) {
                    menukeuzes.get(keuze - 1).voerMenukeuzeUit();
                } else {
                    System.out.println("Ongeldige keuze");
                }
                input = true;
            } catch (Exception e) {
                System.out.println("Ongeldige invoer");
            }

        }

    }


}
