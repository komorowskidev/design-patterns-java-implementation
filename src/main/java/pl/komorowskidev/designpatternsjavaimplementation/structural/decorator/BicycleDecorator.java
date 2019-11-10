package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator;

public abstract class BicycleDecorator implements Bicycle {

    protected Bicycle bicycle;

    public BicycleDecorator(Bicycle bicycle){
        this.bicycle = bicycle;
    }

    protected String getExtendedDescription(String description){
        return bicycle.getDescription() + " & " + description;
    }

}
