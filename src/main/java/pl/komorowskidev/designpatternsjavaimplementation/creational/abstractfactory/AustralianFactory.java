package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

public class AustralianFactory implements AbstractFactory {

    @Override
    public Honey getHoney() {
        return new EucalyptusHoney();
    }

    @Override
    public Candle getCandle() {
        return new KangarooCandle();
    }
}
