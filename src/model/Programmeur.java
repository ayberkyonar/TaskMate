package model;

<<<<<<< HEAD
import java.util.ArrayList;

public class Programmeur extends Persoon {

    private ArrayList<Taak> taken = new ArrayList<>();

=======
public class Programmeur extends Gebruiker {
>>>>>>> 8dfa92eb9186057ac302fb46c4e0e57c8a426a62
    public Programmeur(String naam) {
        super(naam);
    }

    @Override
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    public void printNaam() {
        System.out.println("Programmeur: " + getNaam());
    }
}