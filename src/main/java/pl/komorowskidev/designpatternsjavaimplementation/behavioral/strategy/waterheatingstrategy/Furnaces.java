package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.waterheatingstrategy;

public class Furnaces implements WaterHeatingStrategy {

    @Override
    public String getWaterHeatingDescription() {
        return "furnace";
    }
}
