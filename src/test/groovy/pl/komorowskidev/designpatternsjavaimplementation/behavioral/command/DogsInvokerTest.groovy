package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.DogsReleaseCommand
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.DogsInvoker
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Dogs
import spock.lang.Specification

class DogsInvokerTest extends Specification {

    private DogsInvoker dogsInvoker

    private Dogs dogsMock;

    def setup(){
        dogsMock = Mock(Dogs)
        dogsInvoker = new DogsInvoker(new DogsReleaseCommand(dogsMock))
    }

    def "call Dogs.release() method when release"(){
        when:
        dogsInvoker.release()
        then:
        1 * dogsMock.release()
    }

}
