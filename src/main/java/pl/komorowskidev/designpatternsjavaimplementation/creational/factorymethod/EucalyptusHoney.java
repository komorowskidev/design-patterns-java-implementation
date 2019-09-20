package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

public class EucalyptusHoney implements Honey {

    @Override
    public String getDescription() {
        return "Eucalyptus honey";
    }

    @Override
    public int getJarCapacity() {
        return 5000;
    }

    @Override
    public double getPrice() {
        return 79.9;
    }
}
