package pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observable.Child;

public class Father implements Observer {

    private Child child;

    public Father(Child child){
        this.child = child;
    }

    @Override
    public void update() {
        System.out.println("Father: I see new state of my child: " + child.getState());
    }
}
