package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

public class BeehiveCandle implements Candle {

    @Override
    public String getDescription() {
        return "beehive-shaped candle";
    }

    @Override
    public int getWeightInGrams() {
        return 500;
    }

    @Override
    public double getPriceInUSD() {
        return 49.9;
    }
}
