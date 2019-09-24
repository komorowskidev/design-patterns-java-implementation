package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

public class ParcelMaker {

    private AbstractFactory factory;

    public ParcelMaker(AbstractFactory factory){
        this.factory = factory;
    }

    public String getParcelDescription(){
        Candle candle = factory.getCandle();
        Honey honey = factory.getHoney();
        return "This parcel contains " + honey.getDescription() + " and " + candle.getDescription();
    }
}
