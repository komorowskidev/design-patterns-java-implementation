package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle;

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.Candle;

public class EagleCandle implements Candle {

    @Override
    public String getDescription() {
        return "eagle-shaped candle";
    }

    @Override
    public int getWeightInGrams() {
        return 980;
    }

    @Override
    public double getPriceInUSD() {
        return 90.9;
    }
}
