package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

public class BicycleMirror extends BicycleDecorator {

    private static final String DESCRIPTION = "mirror";

    private final int PRICE_IN_CENTS = 1590;

    public BicycleMirror(Bicycle bicycle){
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
