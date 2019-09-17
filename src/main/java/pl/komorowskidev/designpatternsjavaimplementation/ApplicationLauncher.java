package pl.komorowskidev.designpatternsjavaimplementation;

import pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder.HowToUseFluentBuilder;
import pl.komorowskidev.designpatternsjavaimplementation.creational.singleton.HowToUseSingleton;

public class ApplicationLauncher {

    public static void main(String[] args) {
        System.out.println("Design patterns - java implementation");

        HowToUseSingleton howToUseSingleton = new HowToUseSingleton();
        howToUseSingleton.use();

        HowToUseFluentBuilder howToUseFluentBuilder = new HowToUseFluentBuilder();
        howToUseFluentBuilder.use();
    }
}
