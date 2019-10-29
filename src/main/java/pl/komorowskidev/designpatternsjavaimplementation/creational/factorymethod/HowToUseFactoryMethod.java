package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory.AustralianHoneyFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory.HoneyFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory.PolishHoneyFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.Honey;

public class HowToUseFactoryMethod {

    public void use(){
        System.out.println("FACTORY METHOD");
        HoneyFactory polishHoneyFactory = new PolishHoneyFactory();
        HoneyFactory australianHoneyFactory = new AustralianHoneyFactory();
        Honey honey1 = polishHoneyFactory.getHoney();
        Honey honey2 = australianHoneyFactory.getHoney();
        System.out.println(honey1.getDescription());
        System.out.println(honey2.getDescription());
    }
}
