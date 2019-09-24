package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

public class KangarooCandle implements Candle {

    @Override
    public String getDescription() {
        return "kangaroo-shaped candle";
    }

    @Override
    public int getWeightInGrams() {
        return 1120;
    }

    @Override
    public double getPriceInUSD() {
        return 85.0;
    }
}
