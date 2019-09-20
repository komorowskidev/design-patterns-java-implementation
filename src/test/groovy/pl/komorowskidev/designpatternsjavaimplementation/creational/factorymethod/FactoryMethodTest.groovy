package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod

import spock.lang.Specification

class FactoryMethodTest extends Specification {

    def "should be AcaciaHoney type when Poland"(){
        given:
        HoneyFactory factory = new HoneyFactory()

        when:
        Honey honey = factory.getHoney(CountriesEnum.POLAND)

        then:
        honey instanceof AcaciaHoney
    }

    def "should be EucalyptusHoney type when Australia"(){
        given:
        HoneyFactory factory = new HoneyFactory()

        when:
        Honey honey = factory.getHoney(CountriesEnum.AUSTRALIA)

        then:
        honey instanceof EucalyptusHoney
    }

    def "should be WildflowerHoney type when Other"(){
        given:
        HoneyFactory factory = new HoneyFactory()

        when:
        Honey honey = factory.getHoney(CountriesEnum.OTHER)

        then:
        honey instanceof WildflowerHoney
    }
}
