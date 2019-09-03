package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

public class ThreadSafeSingleton {

    public static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
