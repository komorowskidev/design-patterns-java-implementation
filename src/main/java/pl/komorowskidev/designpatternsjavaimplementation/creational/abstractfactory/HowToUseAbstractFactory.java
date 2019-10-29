package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.Candle;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory.AustralianBeeProductsFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory.BeeProductsFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory.PolishBeeProductsFactory;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.Honey;

public class HowToUseAbstractFactory {

    public void use(){
        System.out.println("ABSTRACT FACTORY");
        BeeProductsFactory polishBeeProductsFactory = new PolishBeeProductsFactory();
        BeeProductsFactory australianBeeProductsFactory = new AustralianBeeProductsFactory();
        Honey polishHoney = polishBeeProductsFactory.getHoney();
        Candle polishCandle = polishBeeProductsFactory.getCandle();
        Honey australianHoney = australianBeeProductsFactory.getHoney();
        Candle australianCandle = australianBeeProductsFactory.getCandle();
        System.out.println(polishHoney.getDescription());
        System.out.println(polishCandle.getDescription());
        System.out.println(australianHoney.getDescription());
        System.out.println(australianCandle.getDescription());
    }

}
