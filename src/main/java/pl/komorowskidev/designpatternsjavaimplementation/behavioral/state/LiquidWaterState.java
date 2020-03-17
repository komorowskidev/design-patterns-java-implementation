package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state;

public class LiquidWaterState implements WaterState {

    private final String STATE_NAME = "liquid state";

    private Water water;

    public LiquidWaterState(Water water){
        this.water = water;
    }

    @Override
    public void cooling() {
        System.out.println("cooling: liquid -> solid");
        water.changeState(new SolidWaterState(water));
    }

    @Override
    public void heating() {
        System.out.println("heating: liquid -> vapor");
        water.changeState(new VaporWaterState(water));
    }

    @Override
    public void pressureIncrease() {
        System.out.println("pressure increasing: liquid -> solid");
        water.changeState(new SolidWaterState(water));
    }

    @Override
    public void pressureReduction() {
        System.out.println("pressure reduction: liquid -> vapor");
        water.changeState(new VaporWaterState(water));
    }

    @Override
    public String getStateName() {
        return STATE_NAME;
    }
}
