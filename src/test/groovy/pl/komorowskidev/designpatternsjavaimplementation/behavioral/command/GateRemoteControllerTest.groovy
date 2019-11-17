package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.DogsReleaseCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.GateCloseCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.GateOpenCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.DogsInvoker
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.GateRemoteController
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Dogs
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Gate
import spock.lang.Specification

class GateRemoteControllerTest extends Specification {

    private GateRemoteController gateRemoteController

    private Gate gateMock;

    def setup(){
        gateMock = Mock(Gate)
        gateRemoteController = new GateRemoteController(
                new GateOpenCommand(gateMock),
                new GateCloseCommand(gateMock))
    }

    def "call Gate.open() method when openButton"(){
        when:
        gateRemoteController.openButton()
        then:
        1 * gateMock.open()
    }

    def "call Gate.close() method when closeButton"(){
        when:
        gateRemoteController.closeButton()
        then:
        1 * gateMock.close()
    }

}
