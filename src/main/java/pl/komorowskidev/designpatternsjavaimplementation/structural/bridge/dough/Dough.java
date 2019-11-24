package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough;

import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.PizzaFlavor;

import java.awt.*;
import java.util.List;


public abstract class Dough {

    protected String doughtDescription;

    protected PizzaFlavor pizzaFlavor;

    public Dough(String doughtDescription, PizzaFlavor pizzaFlavor){
        this.doughtDescription = doughtDescription;
        this.pizzaFlavor = pizzaFlavor;
    }

    public void show() {
        Image image = pizzaFlavor.getImage();
        System.out.println("You choose:");
        System.out.println("Pizza " + pizzaFlavor.getName() + " on " + doughtDescription);
        //show Image
        String ingredients = "uknown";
        List<String> ingredientList = pizzaFlavor.getIngredientList();
        if (ingredientList != null && !ingredientList.isEmpty()){
            ingredients = String.join(", ", ingredientList);
        }
        System.out.println("Pizza ingredients: " + ingredients);
        System.out.println("Price: " + convertCents2Euro(pizzaFlavor.getPriceInEuroCents()));
    }

    private String convertCents2Euro(int cents){
        int eur = cents / 100;
        return "EUR " + (cents / 100) + "." + String.format("%02d", cents % 100);
    }

}
