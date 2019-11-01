package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.waterheatingstrategy;

public class Boilers implements WaterHeatingStrategy {

    @Override
    public String getWaterHeatingDescription() {
        return "boiler";
    }
}
