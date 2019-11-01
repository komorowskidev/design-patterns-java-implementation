package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.heatingstrategy.HeatingStrategy;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.ventilationstrategy.VentilationStrategy;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.waterheatingstrategy.WaterHeatingStrategy;

public class HouseProject {

    private HeatingStrategy heatingStrategy;
    private VentilationStrategy ventilationStrategy;
    private WaterHeatingStrategy waterHeatingStrategy;

    public HouseProject(
            HeatingStrategy heatingStrategy,
            VentilationStrategy ventilationStrategy,
            WaterHeatingStrategy waterHeatingStrategy){
        this.heatingStrategy = heatingStrategy;
        this.ventilationStrategy = ventilationStrategy;
        this.waterHeatingStrategy = waterHeatingStrategy;
    }

    public String getHeatingDescription(){
        return heatingStrategy.getHeatingDescription();
    }

    public String getVentilationDescription(){
        return ventilationStrategy.getVentilationDescription();
    }

    public String getWaterHeatingDescription(){
        return waterHeatingStrategy.getWaterHeatingDescription();
    }
}
