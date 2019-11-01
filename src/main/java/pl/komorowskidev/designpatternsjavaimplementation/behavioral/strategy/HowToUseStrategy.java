package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.heatingstrategy.DirectHeating;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.ventilationstrategy.MechanicalVentilation;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.waterheatingstrategy.Boilers;

public class HowToUseStrategy implements HowToUse {

    @Override
    public void use(){
        System.out.println("STRATEGY");
        HouseProject myHouse = new HouseProject(
                new DirectHeating(),
                new MechanicalVentilation(),
                new Boilers());
        System.out.println("My house:");
        System.out.println("heating: " + myHouse.getHeatingDescription());
        System.out.println("ventilation: " + myHouse.getVentilationDescription());
        System.out.println("water heating: " + myHouse.getWaterHeatingDescription());
    }
}
