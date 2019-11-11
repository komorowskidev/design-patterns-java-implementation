package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

public class BicycleBell extends BicycleDecorator {

    private static final String DESCRIPTION = "bell";

    private final int PRICE_IN_CENTS = 1190;

    public BicycleBell(Bicycle bicycle){
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
