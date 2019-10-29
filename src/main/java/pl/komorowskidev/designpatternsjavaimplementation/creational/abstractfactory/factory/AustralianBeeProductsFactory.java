package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory;

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.Candle;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.KangarooCandle;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.EucalyptusHoney;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.Honey;

public class AustralianBeeProductsFactory implements BeeProductsFactory {

    @Override
    public Honey getHoney() {
        return new EucalyptusHoney();
    }

    @Override
    public Candle getCandle() {
        return new KangarooCandle();
    }
}
