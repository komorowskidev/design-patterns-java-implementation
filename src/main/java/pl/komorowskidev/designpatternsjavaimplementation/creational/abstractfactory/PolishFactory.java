package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

public class PolishFactory implements AbstractFactory {

    @Override
    public Honey getHoney() {
        return new AcaciaHoney();
    }

    @Override
    public Candle getCandle() {
        return new EagleCandle();
    }
}
