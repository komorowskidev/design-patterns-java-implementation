package pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy


import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.heatingstrategy.HeatingStrategy
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.HouseProject
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.ventilationstrategy.VentilationStrategy
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.strategy.waterheatingstrategy.WaterHeatingStrategy
import spock.lang.Specification

class HouseProjectTest extends Specification {

    private HouseProject houseProject
    private HeatingStrategy heatingStrategyMock = Mock()
    private VentilationStrategy ventilationStrategyMock = Mock()
    private WaterHeatingStrategy waterHeatingStrategyMock = Mock()

    def setup(){
        houseProject = new HouseProject(heatingStrategyMock, ventilationStrategyMock, waterHeatingStrategyMock)
    }

    def "should call description method of Heating class when getHeatingDescription"(){
        when:
        houseProject.getHeatingDescription();

        then:
        1 * heatingStrategyMock.getHeatingDescription()
    }

    def "should call description method of Ventilation class when getVentilationDescription"(){
        when:
        houseProject.ventilationDescription;

        then:
        1 * ventilationStrategyMock.getVentilationDescription()
    }

    def "should call description method of WaterHeating class when getWaterHeatingDescription"(){
        when:
        houseProject.getWaterHeatingDescription()

        then:
        1 * waterHeatingStrategyMock.getWaterHeatingDescription()
    }
}
