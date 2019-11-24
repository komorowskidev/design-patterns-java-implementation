package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Hawaiian implements PizzaFlavor {

    @Override
    public String getName() {
        return "Hawaiian";
    }

    @Override
    public Image getImage() {
        return null;
    }

    @Override
    public List<String> getIngredientList() {
        List<String> ingredientList = new ArrayList<>();
        ingredientList.add("ham");
        ingredientList.add("mozzarella");
        ingredientList.add("pineapple");
        ingredientList.add("herbal tomato sauce");
        return ingredientList;
    }

    @Override
    public int getPriceInEuroCents() {
        return 675;
    }
}
