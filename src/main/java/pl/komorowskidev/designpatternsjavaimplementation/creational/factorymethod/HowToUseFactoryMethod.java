package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod;

public class HowToUseFactoryMethod {

    public void use(){
        System.out.println("Factory Method");
        HoneyFactory factory = new HoneyFactory();
        Honey honey1 = factory.getHoney(CountryEnum.POLAND);
        Honey honey2 = factory.getHoney(CountryEnum.AUSTRALIA);
        Honey honey3 = factory.getHoney(CountryEnum.OTHER);
        System.out.println(honey1.getDescription());
        System.out.println(honey2.getDescription());
        System.out.println(honey3.getDescription());
    }
}
