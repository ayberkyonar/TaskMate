package utils;

import utils.Observer;

public interface TaakMelder {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
