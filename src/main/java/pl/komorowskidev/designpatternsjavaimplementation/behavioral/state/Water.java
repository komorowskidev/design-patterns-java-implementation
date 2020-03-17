package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state;

public class Water {

    private WaterState waterState;

    public Water(){
        waterState = new LiquidWaterState(this);
    }

    public void changeState(WaterState waterState){
        this.waterState = waterState;
    }

    public void cooling(){
        waterState.cooling();
    }

    public void heating() {
        waterState.heating();
    }

    public void pressureIncrease() {
        waterState.pressureIncrease();
    }

    public void pressureReduction() {
        waterState.pressureReduction();
    }

    public String getWaterState(){
        return waterState.getStateName();
    }
}
