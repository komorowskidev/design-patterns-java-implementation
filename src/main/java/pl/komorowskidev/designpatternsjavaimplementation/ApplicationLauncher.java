package pl.komorowskidev.designpatternsjavaimplementation;

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.HowToUseAbstractFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.HowToUseFactoryMethod;
import pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder.HowToUseFluentBuilder;
import pl.komorowskidev.designpatternsjavaimplementation.creational.singleton.HowToUseSingleton;

public class ApplicationLauncher {

    public static void main(String[] args) {
        System.out.println("Design patterns - java implementation");
        System.out.println("-----------------------");
        HowToUseSingleton howToUseSingleton = new HowToUseSingleton();
        howToUseSingleton.use();
        System.out.println("-----------------------");
        HowToUseFluentBuilder howToUseFluentBuilder = new HowToUseFluentBuilder();
        howToUseFluentBuilder.use();
        System.out.println("-----------------------");
        HowToUseFactoryMethod howToUseFactoryMethod = new HowToUseFactoryMethod();
        howToUseFactoryMethod.use();
        System.out.println("-----------------------");
        HowToUseAbstractFactory howToUseAbstractFactory = new HowToUseAbstractFactory();
        howToUseAbstractFactory.use();
        System.out.println("-----------------------");
    }
}
