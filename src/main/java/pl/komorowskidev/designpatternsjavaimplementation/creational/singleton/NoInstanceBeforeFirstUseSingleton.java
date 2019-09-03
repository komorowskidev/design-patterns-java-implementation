package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

public class NoInstanceBeforeFirstUseSingleton {

    private static NoInstanceBeforeFirstUseSingleton instance = null;

    private NoInstanceBeforeFirstUseSingleton(){
    }

    public static NoInstanceBeforeFirstUseSingleton getInstance(){
        if(instance == null){
            instance = new NoInstanceBeforeFirstUseSingleton();
        }
        return instance;
    }
}
