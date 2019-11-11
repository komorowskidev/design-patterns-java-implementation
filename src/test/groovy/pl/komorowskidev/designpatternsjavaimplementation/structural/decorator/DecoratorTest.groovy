package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator

import spock.lang.Specification

class DecoratorTest extends Specification {

    private Bicycle bicycle4KidsWithBellAndBasket

    private Bicycle bicycle4KidsWithBasketAndBell

    def setup(){
        bicycle4KidsWithBellAndBasket = new BicycleBasket(new BicycleBell(new Bicycle4Kids()))
        bicycle4KidsWithBasketAndBell = new BicycleBell(new BicycleBasket(new Bicycle4Kids()))
    }

    def "should return sum of prices"(){
        given:
        int expected = 9175
        when:
        int actual1 = bicycle4KidsWithBellAndBasket.getPriceInCents()
        int actual2 = bicycle4KidsWithBasketAndBell.getPriceInCents()
        then:
        actual1 == expected
        actual2 == expected
    }

    def "should return correct description"(){
        given:
        String expected1 = "Bicycle for kids & bell & basket"
        String expected2 = "Bicycle for kids & basket & bell"
        when:
        String actual1 = bicycle4KidsWithBellAndBasket.getDescription()
        String actual2 = bicycle4KidsWithBasketAndBell.getDescription()
        then:
        actual1.equals(expected1)
        actual2.equals(expected2)
    }
}
