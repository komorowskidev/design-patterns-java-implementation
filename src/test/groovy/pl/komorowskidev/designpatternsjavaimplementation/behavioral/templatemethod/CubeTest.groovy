package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod

import spock.lang.Specification

class CubeTest extends Specification {

    private Shape3D shape3D

    def "calculatingTest"(){
        setup:
        shape3D = new Cube(edge)
        CalculatedShape3D calculatedShape3D = shape3D.getCalculatedShape3D()

        expect:
        name == calculatedShape3D.getName()
        volume == calculatedShape3D.getVolume()
        area == calculatedShape3D.getSurfaceArea()

        where:
        edge | name  | volume | area
         1   |"Cube" |    1   |   6
         2   |"Cube" |    8   |  24
         3   |"Cube" |   27   |  54
         4   |"Cube" |   64   |  96
    }

}
