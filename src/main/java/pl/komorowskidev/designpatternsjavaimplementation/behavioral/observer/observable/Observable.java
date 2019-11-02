package pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observable;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
