package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

public class AcaciaHoney implements Honey {

    @Override
    public String getDescription() {
        return "Acacia honey";
    }

    @Override
    public int getJarCapacity() {
        return 700;
    }

    @Override
    public double getPrice() {
        return 44.5;
    }
}
