package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough.CommonDough;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough.Dough;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough.DoughWithGoatCheese;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough.WarsawStyleDough;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.Hawaiian;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.Margherita;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.Pepperoni;
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.Prosciutto;

public class HowToUseBridge implements HowToUse {

    @Override
    public void use() {
        System.out.println("BRIDGE");
        System.out.println("We have 3 types of dough (3 classes) and 4 flavors of pizza (4 classes) and we can make 12 different pizzas (12 classes)");
        Dough commonDoughHawaii = new CommonDough(new Hawaiian());
        Dough warsawStyleDoughProsciutto = new WarsawStyleDough(new Prosciutto());
        Dough doughWithGoatCheeseMargherita = new DoughWithGoatCheese(new Margherita());
        Dough commonDoughPepperoni = new CommonDough(new Pepperoni());
        commonDoughHawaii.show();
        warsawStyleDoughProsciutto.show();
        doughWithGoatCheeseMargherita.show();
        commonDoughPepperoni.show();
        System.out.println("etc.");
    }
}
