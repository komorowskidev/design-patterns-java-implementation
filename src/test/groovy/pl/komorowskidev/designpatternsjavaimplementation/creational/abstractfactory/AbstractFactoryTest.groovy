package pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory

import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.Candle
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.EagleCandle
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.candle.KangarooCandle
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory.AustralianBeeProductsFactory
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory.BeeProductsFactory
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.factory.PolishBeeProductsFactory
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.AcaciaHoney
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.EucalyptusHoney
import pl.komorowskidev.designpatternsjavaimplementation.creational.abstractfactory.honey.Honey
import spock.lang.Specification

class AbstractFactoryTest extends Specification{

    def "should be AcaciaHoney and EagleCandle when PolishBeeProductsFactory"(){
        given:
        BeeProductsFactory factory = new PolishBeeProductsFactory()

        when:
        Honey honey = factory.getHoney()
        Candle candle = factory.getCandle()

        then:
        honey instanceof AcaciaHoney
        candle instanceof EagleCandle

    }

    def "should be EucaliptusHoney and KangarooCandle when AustralianBeeProductsFactory"(){
        given:
        BeeProductsFactory factory = new AustralianBeeProductsFactory()

        when:
        Honey honey = factory.getHoney()
        Candle candle = factory.getCandle()

        then:
        honey instanceof EucalyptusHoney
        candle instanceof KangarooCandle
    }
}
