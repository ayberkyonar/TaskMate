package model;

<<<<<<< HEAD:src/model/Persoon.java
import java.util.ArrayList;

public class Persoon {

    private String naam;

    private ArrayList<Taak> taken = new ArrayList<>();

    public Persoon(String naam) {
=======
public abstract class Gebruiker {

    private String naam;

    public Gebruiker(String naam) {
>>>>>>> 8dfa92eb9186057ac302fb46c4e0e57c8a426a62:src/model/Gebruiker.java
        this.naam = naam;
    }
    public ArrayList<Taak> getTaken() {
        return this.taken;
    }
    public String getNaam() {
        return naam;
    }

    public void printNaam() {
    }
}
