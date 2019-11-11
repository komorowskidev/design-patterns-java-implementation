package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

public class BicycleBasket extends BicycleDecorator {

    private static final String DESCRIPTION = "basket";

    private final int PRICE_IN_CENTS = 985;

    public BicycleBasket(Bicycle bicycle){
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
