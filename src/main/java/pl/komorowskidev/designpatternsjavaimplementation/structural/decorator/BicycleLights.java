package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

public class BicycleLights extends BicycleDecorator {

    private static final String DESCRIPTION = "lights";

    private final int PRICE_IN_CENTS = 1495;

    public BicycleLights(Bicycle bicycle){
        super(bicycle);
    }

    @Override
    public int getPriceInCents(){
        return bicycle.getPriceInCents() + PRICE_IN_CENTS;
    }

    @Override
    public String getDescription(){
        return getExtendedDescription(DESCRIPTION);
    }
}
