package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.HeatingComfortableTemperatureCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.HeatingEconomyTemperatureCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.HeatingOffCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.HeatingSystemController
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.HeatingSystem
import spock.lang.Specification

class HeatingSystemControllerTest extends Specification {

    private HeatingSystemController controller

    private HeatingSystem heatingSystemMock;

    def setup(){
        heatingSystemMock = Mock(HeatingSystem)
        controller = new HeatingSystemController(
                new HeatingOffCommand(heatingSystemMock),
                new HeatingEconomyTemperatureCommand(heatingSystemMock),
                new HeatingComfortableTemperatureCommand(heatingSystemMock))
    }

    def "call HeatingSystem off method when off"(){
        when:
        controller.off()
        then:
        1 * heatingSystemMock.off()
    }

    def "set HeatingSystem on and set to 17 degrees when setEconomyTemperatury"(){
        when:
        controller.setSetEconomyTemperature()
        then:
        1 * heatingSystemMock.on()
        1 * heatingSystemMock.setTemperature(17)
    }

    def "set HeatingSystem on and set to 23 degrees when setComfortableTemperatury"(){
        when:
        controller.setSetComfortableTemperature()
        then:
        1 * heatingSystemMock.on()
        1 * heatingSystemMock.setTemperature(23)
    }
}
