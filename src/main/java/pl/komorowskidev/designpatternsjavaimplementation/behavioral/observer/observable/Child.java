package pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observable;

import lombok.Getter;
import lombok.Setter;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Observer;

import java.util.LinkedList;
import java.util.List;

public class Child implements Observable {

    private List<Observer> observers = new LinkedList<>();

    @Setter
    @Getter
    private String state = "";

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update();
        }
    }

}
