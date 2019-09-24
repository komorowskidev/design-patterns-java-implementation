package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

import java.util.InputMismatchException;

public class FactoryProvider {

    public AbstractFactory getFactory(CountryEnum countryEnum) throws UknownCountryException {
        AbstractFactory factory;
        switch (countryEnum){
            case AUSTRALIA:
                factory = new AustralianFactory();
                break;
            case POLAND:
                factory = new PolishFactory();
                break;
            default:
                throw new UknownCountryException("no factory for " + countryEnum.toString());
        }
        return factory;
    }
}
