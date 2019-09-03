package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

public class HowToUse {

    public void use(){
        BestSingleton bestSingleton1 = BestSingleton.getInstance();
        BestSingleton bestSingleton2 = BestSingleton.getInstance();
        // bestSingleton1 and bestSingleton2 are the same object
    }
}
