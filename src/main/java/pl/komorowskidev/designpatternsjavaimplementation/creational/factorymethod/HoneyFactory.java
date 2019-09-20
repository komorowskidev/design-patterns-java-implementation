package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

public class HoneyFactory {

    public Honey getHoney(CountriesEnum country){
        Honey honey;
        switch(country){
            case POLAND:
                honey = new AcaciaHoney();
                break;
            case AUSTRALIA:
                honey = new EucalyptusHoney();
                break;
            default:
                honey = new WildflowerHoney();
                break;
        }
        return honey;
    }
}
