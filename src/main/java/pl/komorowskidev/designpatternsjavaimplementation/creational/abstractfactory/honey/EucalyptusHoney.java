package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey;

import lombok.ToString;

public class EucalyptusHoney implements Honey {

    @Override
    public String getDescription() {
        return "Eucalyptus honey";
    }

    @Override
    public int getJarCapacityInMililiters() {
        return 5000;
    }

    @Override
    public double getPriceInUSD() {
        return 79.9;
    }
}
