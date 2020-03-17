package pl.komorowskidev.designpatternsjavaimplementation.structural.composite


import spock.lang.Specification

class CompositeTest extends Specification {

    private Composite headquarter;

    def setup(){
        headquarter = new Composite("Headquarter", 100)
        Composite region1 = new Composite("Region1", 1000)
        Leaf branch1 = new Leaf("Branch1", 2000)
        Leaf branch2 = new Leaf("Branch2", 10)
        headquarter.addDepartment(region1)
        region1.addDepartment(branch1)
        region1.addDepartment(branch2)
        Composite region2 = new Composite("Region2", 10000)
        Leaf branch3 = new Leaf("Branch3", 5)
        region2.addDepartment(branch3)
        headquarter.addDepartment(region2)
    }

    def "should return sum of its children and itself"(){
        given:
        int expected = 13115

        when:
        int actual = headquarter.getProfit()

        then:
        actual == expected
    }

    def "should return names of its children and itself"(){
        given:
        String expected = "Headquarter:\n  Region1:\n    Branch1\n    Branch2\n  Region2:\n    Branch3"

        when:
        String actual = headquarter.getName()

        then:
        actual == expected
    }

}
