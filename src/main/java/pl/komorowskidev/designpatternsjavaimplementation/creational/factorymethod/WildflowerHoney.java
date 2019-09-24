package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

public class WildflowerHoney implements Honey {

    @Override
    public String getDescription() {
        return "Wild flower honey";
    }

    @Override
    public int getJarCapacityInMililiters() {
        return 1000;
    }

    @Override
    public double getPriceInUSD() {
        return 49.9;
    }
}
