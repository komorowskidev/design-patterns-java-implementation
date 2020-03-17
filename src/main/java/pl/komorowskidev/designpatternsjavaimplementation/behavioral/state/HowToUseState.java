package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseState implements HowToUse {

    @Override
    public void use(){
        System.out.println("STATE");
        Water water = new Water();
        System.out.println("water: " + water.getWaterState());
        water.cooling();
        water.pressureIncrease();
        water.heating();
        water.pressureReduction();
        System.out.println("water: " + water.getWaterState());
    }
}
