package pl.komorowskidev.designpatternsjavaimplementation.structural.decorator

import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Bath
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Book
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Entertainment
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Facade
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Light
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Pajamas
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Supper
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Teeth
import pl.komorowskidev.designpatternsjavaimplementation.structural.facade.Toys
import spock.lang.Specification

class FacadeTest extends Specification {

    private Facade facade

    private Bath bathMock

    private Book bookMock

    private Entertainment entertainmentMock

    private Light lightMock

    private Pajamas pajamasMock

    private Supper supperMock

    private Teeth teethMock

    private Toys toysMock

    def setup(){
        facade = new Facade()
        bathMock = Mock(Bath)
        bookMock = Mock(Book)
        entertainmentMock = Mock(Entertainment)
        lightMock = Mock(Light)
        pajamasMock = Mock(Pajamas)
        supperMock = Mock(Supper)
        teethMock = Mock(Teeth)
        toysMock = Mock(Toys)
        facade.setBath(bathMock)
        facade.setBook(bookMock)
        facade.setEntertainment(entertainmentMock)
        facade.setLight(lightMock)
        facade.setPajamas(pajamasMock)
        facade.setSupper(supperMock)
        facade.setTeeth(teethMock)
        facade.setToys(toysMock)
    }

    def "should call every step when sleep()"(){
        when:
        facade.sleep()

        then:
        1 * supperMock.eat()
        1 * bathMock.take()
        1 * teethMock.brush()
        1 * pajamasMock.dress()
        1 * toysMock.clean()
        1 * entertainmentMock.watch()
        1 * bookMock.read()
        1 * lightMock.turnOff()
    }
}
