package pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod

import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory.AustralianHoneyFactory
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory.HoneyFactory
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.factory.PolishHoneyFactory
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.AcaciaHoney
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.EucalyptusHoney
import pl.komorowskidev.designpatternsjavaimplementation.creational.factorymethod.honey.Honey
import spock.lang.Specification

class FactoryMethodTest extends Specification {

    def "should be AcaciaHoney type when PolishHoneyFactory"(){
        given:
        HoneyFactory factory = new PolishHoneyFactory()

        when:
        Honey honey = factory.getHoney()

        then:
        honey instanceof AcaciaHoney
    }

    def "should be EucalyptusHoney type when AustralianHoneyFactory"(){
        given:
        HoneyFactory factory = new AustralianHoneyFactory()

        when:
        Honey honey = factory.getHoney()

        then:
        honey instanceof EucalyptusHoney
    }

}
