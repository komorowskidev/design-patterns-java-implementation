package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.heatingstrategy;

public class DirectHeating implements HeatingStrategy {

    @Override
    public String getHeatingDescription() {
        return "direct heating";
    }
}
