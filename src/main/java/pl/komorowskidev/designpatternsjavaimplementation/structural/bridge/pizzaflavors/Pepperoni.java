package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Pepperoni implements PizzaFlavor {

    @Override
    public String getName() {
        return "Pepperoni";
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public List<String> getIngredientList() {
        List<String> ingredientList = new ArrayList<>();
        ingredientList.add("pepperoni sausage");
        ingredientList.add("mozzarella");
        ingredientList.add("herbal tomato sauce");
        return ingredientList;
    }

    @Override
    public int getPriceInEuroCents() {
        return 675;
    }
}
