package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.heatingstrategy;

public class CentralHeating implements HeatingStrategy {

    @Override
    public String getHeatingDescription() {
        return "central heating";
    }
}
