package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory;

import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.AcaciaHoney;
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.Honey;

public class PolishHoneyFactory implements HoneyFactory {

    @Override
    public Honey getHoney(){
        return new AcaciaHoney();
    }
}
