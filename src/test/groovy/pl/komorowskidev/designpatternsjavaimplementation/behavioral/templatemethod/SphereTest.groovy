package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod

import spock.lang.Specification

import static spock.util.matcher.HamcrestMatchers.closeTo

class SphereTest extends Specification {

    private Shape3D shape3D

    def "calculatingTest"(){
        setup:
        shape3D = new Sphere(radius)
        CalculatedShape3D calculatedShape3D = shape3D.getCalculatedShape3D()

        expect:
        name == calculatedShape3D.getName()
        volume closeTo(calculatedShape3D.getVolume(), 0.01)
        area closeTo(calculatedShape3D.getSurfaceArea(), 0.01)

        where:
        radius | name   | volume | area
           1   |"Sphere"|   4.19 |  12.57
           2   |"Sphere"|  33.51 |  50.27
           3   |"Sphere"| 113.1  | 113.1
           4   |"Sphere"| 268.08 | 201.06
    }

}
