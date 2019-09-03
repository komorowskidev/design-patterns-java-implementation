package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

public class BestSingleton {

    private static BestSingleton instance = null;

    private BestSingleton(){
    }

    public static BestSingleton getInstance(){
        if(instance == null){
            synchronized (BestSingleton.class){
                if(instance == null){
                    instance = new BestSingleton();
                }
            }
        }
        return instance;
    }
}
