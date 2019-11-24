package pl.komorowskidev.designpatternsjavaimplementation.structural.bridge

import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough.CommonDough
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.dough.Dough
import pl.komorowskidev.designpatternsjavaimplementation.structural.bridge.pizzaflavors.PizzaFlavor
import spock.lang.Specification

class CommonDoughTest extends Specification {

    private Dough dough

    private PizzaFlavor pizzaFlavorMock

    def setup(){
        pizzaFlavorMock = Mock(PizzaFlavor)
        dough = new CommonDough(pizzaFlavorMock)
    }

    def "should call getImage, getName, getIngedientList and getPrice when show()"(){
        given:
        pizzaFlavorMock.getIngredientList() >> new ArrayList<String>()
        when:
        dough.show()
        then:
        1 * pizzaFlavorMock.getImage()
        1 * pizzaFlavorMock.getName()
        1 * pizzaFlavorMock.getIngredientList()
        1 * pizzaFlavorMock.getPriceInEuroCents()
    }
}
