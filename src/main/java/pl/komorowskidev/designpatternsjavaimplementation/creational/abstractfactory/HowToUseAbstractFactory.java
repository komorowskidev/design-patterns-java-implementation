package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory;

public class HowToUseAbstractFactory {

    public void use(){
        System.out.println("Abstract Factory");
        FactoryProvider factoryProvider = new FactoryProvider();

        ParcelMaker polishParcelMaker = null;
        try {
            polishParcelMaker = new ParcelMaker(factoryProvider.getFactory(CountryEnum.POLAND));
            System.out.println("POLAND: " + polishParcelMaker.getParcelDescription());
        } catch (UknownCountryException e) {
            System.out.println(e.getMessage());
        }

        ParcelMaker australianParcelMaker = null;
        try {
            australianParcelMaker = new ParcelMaker(factoryProvider.getFactory(CountryEnum.AUSTRALIA));
            System.out.println("AUSTRALIA: " + australianParcelMaker.getParcelDescription());
        } catch (UknownCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
