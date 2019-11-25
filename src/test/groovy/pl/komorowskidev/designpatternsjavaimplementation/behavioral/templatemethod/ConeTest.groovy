package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod

import spock.lang.Specification

import static spock.util.matcher.HamcrestMatchers.closeTo

class ConeTest extends Specification {

    private Shape3D shape3D

    def "calculatingTest"(){
        setup:
        shape3D = new Cone(radius, height)
        CalculatedShape3D calculatedShape3D = shape3D.getCalculatedShape3D()

        expect:
        name == calculatedShape3D.getName()
        volume closeTo(calculatedShape3D.getVolume(), 0.01)
        area closeTo(calculatedShape3D.getSurfaceArea(), 0.01)

        where:
        radius | height | name | volume | area
           1   |    4   |"Cone"|   4.19 |  16.09
           2   |    3   |"Cone"|  12.57 |  35.22
           3   |    2   |"Cone"|  18.85 |  62.26
           4   |    1   |"Cone"|  16.76 | 102.08
    }

}
