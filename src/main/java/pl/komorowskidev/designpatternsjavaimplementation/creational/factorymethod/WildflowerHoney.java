package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

public class WildflowerHoney implements Honey {

    @Override
    public String getDescription() {
        return "Wild flower honey";
    }

    @Override
    public int getJarCapacity() {
        return 1000;
    }

    @Override
    public double getPrice() {
        return 49.9;
    }
}
