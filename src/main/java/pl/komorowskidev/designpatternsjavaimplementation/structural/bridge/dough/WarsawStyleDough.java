package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough;

import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.PizzaFlavor;

public class WarsawStyleDough extends Dough {

    public WarsawStyleDough(PizzaFlavor pizzaFlavor) {
        super("Warsaw style dough", pizzaFlavor);
    }

}
