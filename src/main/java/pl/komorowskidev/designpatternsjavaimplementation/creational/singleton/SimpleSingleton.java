package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

public class SimpleSingleton {

    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton(){
    }

    public static SimpleSingleton getInstance(){
        return instance;
    }
}
