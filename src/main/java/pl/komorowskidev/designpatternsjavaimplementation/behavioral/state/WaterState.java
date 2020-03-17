package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state;

public interface WaterState {

    void cooling();

    void heating();

    void pressureIncrease();

    void pressureReduction();

    String getStateName();

}
