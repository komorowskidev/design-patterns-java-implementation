package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.ventilationstrategy;

public class NaturalVentilation implements VentilationStrategy {

    @Override
    public String getVentilationDescription() {
        return "natural ventilation";
    }
}
