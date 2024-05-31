package model;

<<<<<<< HEAD
import java.util.ArrayList;

public class Ontwerper extends Persoon {

    private ArrayList<Taak> taken = new ArrayList<>();

=======
public class Ontwerper extends Gebruiker {
>>>>>>> 8dfa92eb9186057ac302fb46c4e0e57c8a426a62
    public Ontwerper(String naam) {
        super(naam);
    }

    @Override
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    public void printNaam() {
        System.out.println("Ontwerper: " + getNaam());
    }
}