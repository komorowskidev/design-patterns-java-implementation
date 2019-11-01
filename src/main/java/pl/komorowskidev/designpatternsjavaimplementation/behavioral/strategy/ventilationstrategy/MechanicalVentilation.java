package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.ventilationstrategy;

public class MechanicalVentilation implements VentilationStrategy {

    @Override
    public String getVentilationDescription() {
        return "mechanical ventilation";
    }
}
