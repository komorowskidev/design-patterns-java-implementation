package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory;

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.Candle;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.EagleCandle;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.AcaciaHoney;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.Honey;

public class PolishBeeProductsFactory implements BeeProductsFactory {

    @Override
    public Honey getHoney() {
        return new AcaciaHoney();
    }

    @Override
    public Candle getCandle() {
        return new EagleCandle();
    }
}
