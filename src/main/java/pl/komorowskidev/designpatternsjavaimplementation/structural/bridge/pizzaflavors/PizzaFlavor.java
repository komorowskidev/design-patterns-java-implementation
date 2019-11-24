package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors;


import java.awt.*;
import java.util.List;

public interface PizzaFlavor {

    String getName();
    Image getImage();
    List<String> getIngredientList();
    int getPriceInEuroCents();

}
