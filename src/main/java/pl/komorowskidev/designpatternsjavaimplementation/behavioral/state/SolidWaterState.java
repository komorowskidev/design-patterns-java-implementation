package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state;

public class SolidWaterState implements WaterState {

    private final String STATE_NAME = "solid state";

    private Water water;

    public SolidWaterState(Water water) {
        this.water = water;
    }

    @Override
    public void cooling() {
        System.out.println("cooling: solid -> solid");
    }

    @Override
    public void heating() {
        System.out.println("heating: solid -> liquid");
        water.changeState(new LiquidWaterState(water));
    }

    @Override
    public void pressureIncrease() {
        System.out.println("pressure increasing: solid -> solid");
    }

    @Override
    public void pressureReduction() {
        System.out.println("heating: solid -> liquid");
        water.changeState(new LiquidWaterState(water));
    }

    @Override
    public String getStateName() {
        return STATE_NAME;
    }
}
