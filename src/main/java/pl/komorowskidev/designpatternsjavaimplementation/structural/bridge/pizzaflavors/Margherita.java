package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Margherita implements PizzaFlavor {

    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public List<String> getIngredientList() {
        List<String> ingredientList = new ArrayList<>();
        ingredientList.add("mozzarella");
        ingredientList.add("herbal tomato sauce");
        return ingredientList;
    }

    @Override
    public int getPriceInEuroCents() {
        return 525;
    }
}
