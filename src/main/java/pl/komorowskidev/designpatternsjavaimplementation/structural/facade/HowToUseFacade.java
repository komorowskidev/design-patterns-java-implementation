package pl.komorowskidev.designpatternsjavaimplementation.structural.facade;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseFacade implements HowToUse {

    @Override
    public void use() {
        System.out.println("FACADE");
        System.out.println("Go to sleep procedure:");
        System.out.println("1. eat supper");
        System.out.println("2. take a bath");
        System.out.println("3. brush your teeth");
        System.out.println("4. dress your pajamas");
        System.out.println("5. clean the toys");
        System.out.println("6. watch a cartoon or play on the computer");
        System.out.println("7. read a book");
        System.out.println("8. turn off the light");
        System.out.println("\nInstead of calling every step you can build a facade and call only sleep()");
        Facade facade = new Facade();
        facade.sleep();
    }
}
