package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory;

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.Candle;
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.Honey;

public interface BeeProductsFactory {

    Honey getHoney();

    Candle getCandle();

}
