package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state;

public class VaporWaterState implements WaterState {

    private final String STATE_NAME = "vapor state";

    private Water water;

    public VaporWaterState(Water water){
        this.water = water;
    }

    @Override
    public void cooling() {
        System.out.println("cooling: vapor -> liquid");
        water.changeState(new LiquidWaterState(water));
    }

    @Override
    public void heating() {
        System.out.println("heating: vapor -> vapor");
    }

    @Override
    public void pressureIncrease() {
        System.out.println("pressure reduction: vapor -> liquid");
        water.changeState(new LiquidWaterState(water));
    }

    @Override
    public void pressureReduction() {
        System.out.println("pressure increasing: vapor -> vapor");
    }

    @Override
    public String getStateName() {
        return STATE_NAME;
    }
}
