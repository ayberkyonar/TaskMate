package utils;

import model.Taak;
import utils.Observer;

public class TaakMelder {

    public void registerObserver(Taak taak, Observer o) {
        taak.observers.add(o);
    }

    public void removeObserver(Taak taak, Observer o) {
        taak.observers.remove(o);
    }

    public void notifyObservers(Taak taak) {
        for (Observer observer : taak.observers) {
            observer.update(taak);
        }
    }
}
