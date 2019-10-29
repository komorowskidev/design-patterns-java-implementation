package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory;

import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.EucalyptusHoney;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.Honey;

public class AustralianHoneyFactory implements HoneyFactory {

    @Override
    public Honey getHoney() {
        return new EucalyptusHoney();
    }
}
