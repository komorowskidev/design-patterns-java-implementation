package pl.komorowskidev.designpatternsjavaimplementation;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.HowToUseCommand;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.HowToUseObserver;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.HowToUseStrategy;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.HowToUseAbstractFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.HowToUseFactoryMethod;
import pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder.HowToUseFluentBuilder;
import pl.komorowskidev.designpatternsjavaimplementation.creational.singleton.HowToUseSingleton;
import pl.komorowskidev.designpatternsjavaimplementation.structural.adapter.HowToUseAdapter;
import pl.komorowskidev.designpatternsjavaimplementation.structural.decorator.HowToUseDecorator;

public class ApplicationLauncher {

    public static void main(String[] args) {
        System.out.println("Design patterns - java implementation");
        System.out.println("-----------------------");
        HowToUse howToUseSingleton = new HowToUseSingleton();
        howToUseSingleton.use();
        System.out.println("-----------------------");
        HowToUse howToUseFluentBuilder = new HowToUseFluentBuilder();
        howToUseFluentBuilder.use();
        System.out.println("-----------------------");
        HowToUse howToUseFactoryMethod = new HowToUseFactoryMethod();
        howToUseFactoryMethod.use();
        System.out.println("-----------------------");
        HowToUse howToUseAbstractFactory = new HowToUseAbstractFactory();
        howToUseAbstractFactory.use();
        System.out.println("-----------------------");
        HowToUse howToUseStrategy = new HowToUseStrategy();
        howToUseStrategy.use();
        System.out.println("-----------------------");
        HowToUse howToUseObserver = new HowToUseObserver();
        howToUseObserver.use();
        System.out.println("-----------------------");
        HowToUse howToUseDecorator = new HowToUseDecorator();
        howToUseDecorator.use();
        System.out.println("-----------------------");
        HowToUse howToUseCommand = new HowToUseCommand();
        howToUseCommand.use();
        System.out.println("-----------------------");
        HowToUse howToUseAdapter = new HowToUseAdapter();
        howToUseAdapter.use();
    }
}
