package pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observable.Child;

public class Mother implements Observer {

    private Child child;

    public Mother(Child child){
        this.child = child;
    }

    @Override
    public void update() {
        System.out.println("Mother: I see new state of my child: " + child.getState());
    }
}
