package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

public class HowToUseSingleton {

    public void use(){
        System.out.println("Singleton");
        BestSingleton bestSingleton1 = BestSingleton.getInstance();
        BestSingleton bestSingleton2 = BestSingleton.getInstance();
        System.out.println(bestSingleton1);
        System.out.println(bestSingleton2);
    }
}
