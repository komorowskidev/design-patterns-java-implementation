package pl.komorowskidev.designpatternsjavaimplementation.behavioral.state


import spock.lang.Specification

class StateTest extends Specification {

    private Water water

    def setup(){
        water = new Water()
    }

    def "should change state to vapor when heating"(){
        when:
        water.heating()

        then:
        water.getWaterState() == "vapor state"
    }

    def "should change state to solid when cooling"(){
        when:
        water.cooling()

        then:
        water.getWaterState() == "solid state"
    }

    def "should change state to solid when pressure increase"(){
        when:
        water.pressureIncrease()

        then:
        water.getWaterState() == "solid state"
    }

    def "should change state to vapor when pressure reduction"(){
        when:
        water.pressureReduction()

        then:
        water.getWaterState() == "vapor state"
    }

}
