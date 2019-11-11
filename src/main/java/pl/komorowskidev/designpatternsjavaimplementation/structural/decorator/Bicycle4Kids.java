package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

public class Bicycle4Kids implements Bicycle{

    @Override
    public int getPriceInCents() {
        return 7000;
    }

    @Override
    public String getDescription() {
        return "Bicycle for kids";
    }
}
