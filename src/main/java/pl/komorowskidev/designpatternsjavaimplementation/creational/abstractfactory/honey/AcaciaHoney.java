package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey;

import lombok.ToString;

public class AcaciaHoney implements Honey {

    @Override
    public String getDescription() {
        return "Acacia honey";
    }

    @Override
    public int getJarCapacityInMililiters() {
        return 700;
    }

    @Override
    public double getPriceInUSD() {
        return 44.5;
    }
}
