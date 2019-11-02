package pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observable.Child;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Father;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Mother;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Observer;

public class HowToUseObserver implements HowToUse {

    @Override
    public void use() {
        System.out.println("OBSERVER");
        Child child = new Child();
        Observer mother = new Mother(child);
        Observer father = new Father(child);
        child.addObserver(mother);
        child.addObserver(father);
        child.setState("he got sick");
        child.notifyObservers();
    }
}
