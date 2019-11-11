package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseDecorator implements HowToUse {

    private final String DECIMAL_SEPARATOR = ",";

    @Override
    public void use() {
        System.out.println("DECORATOR");
        Bicycle bicycle = new BicycleMirror(
                new BicycleLights(
                        new BicycleBasket(
                                new BicycleBell(
                                        new Bicycle4Kids()))));
        System.out.println(bicycle.getDescription());
        System.out.println("price: " + convertPrice(bicycle.getPriceInCents()));
    }

    private String convertPrice(int priceInCents) {
        String price = String.valueOf(priceInCents);
        int length = price.length();
        return "$" + price.substring(0, length - 2) + DECIMAL_SEPARATOR + price.substring(length - 2);
    }

}
