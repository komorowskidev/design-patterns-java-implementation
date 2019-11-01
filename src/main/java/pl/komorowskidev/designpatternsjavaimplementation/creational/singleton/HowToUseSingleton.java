package pl.komorowskidev.designpatternsjavaimplementation.creational.singleton;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseSingleton implements HowToUse {

    @Override
    public void use(){
        System.out.println("SINGLETON");
        BestSingleton bestSingleton1 = BestSingleton.getInstance();
        BestSingleton bestSingleton2 = BestSingleton.getInstance();
        System.out.println(bestSingleton1);
        System.out.println(bestSingleton2);
    }
}
