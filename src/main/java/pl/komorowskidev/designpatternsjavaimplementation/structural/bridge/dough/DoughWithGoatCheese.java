package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough;

import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.PizzaFlavor;

public class DoughWithGoatCheese extends Dough {

    public DoughWithGoatCheese(PizzaFlavor pizzaFlavor) {
        super("dough with goat cheese", pizzaFlavor);
    }

}
