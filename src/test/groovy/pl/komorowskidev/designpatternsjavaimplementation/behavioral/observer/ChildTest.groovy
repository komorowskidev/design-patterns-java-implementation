package pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observable.Child
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Father
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.observer.observer.Mother
import spock.lang.Specification

class ChildTest extends Specification{

    private Child child
    private Mother mother
    private Father father

    def setup(){
        child = new Child()
        mother = Spy(Mother, constructorArgs: [child]) as Mother
        father = Spy(Father, constructorArgs: [child]) as Father
    }

    def "should notify all observers when call notifyObservers"(){
        given:
        child.addObserver(mother)
        child.addObserver(father)
        child.setState("test state")

        when:
        child.notifyObservers()

        then:
        1 * mother.update()
        1 * father.update()
    }

    def "should not notify removed observers"(){
        given:
        child.addObserver(mother)
        child.addObserver(father)
        child.removeObserver(mother)
        child.setState("test state")

        when:
        child.notifyObservers()

        then:
        0 * mother.update()
        1 * father.update()
    }
}
