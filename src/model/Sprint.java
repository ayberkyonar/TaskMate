package model;

import java.util.ArrayList;

public class Sprint {

//    private ArrayList<Observer> observers = new ArrayList<>();

    private String naam;
    private ArrayList<Taak> taken = new ArrayList<>();

    public Sprint(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Taak> getTaken() {
        return this.taken;
    }

    @Override
    public String toString() {
        return naam;
    }

/*    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }*/

    public void addTaak(Taak taak) {
        taken.add(taak);
/*        TaakObserver taakObserver = new TaakObserver(this);
        registerObserver(taakObserver);
        notifyObservers();*/
    }
}
