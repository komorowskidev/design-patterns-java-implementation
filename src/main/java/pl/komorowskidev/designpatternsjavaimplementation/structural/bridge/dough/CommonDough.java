package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough;

import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.PizzaFlavor;

import java.awt.*;

public class CommonDough extends Dough {

    public CommonDough(PizzaFlavor pizzaFlavor) {
        super("common dough", pizzaFlavor);
    }

}
