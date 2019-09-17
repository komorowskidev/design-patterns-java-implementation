package pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder

import spock.lang.Specification

import java.awt.Color

class FluentBuilderTest extends Specification {

    def "CarWithLombok should be valid object"(){
        given:
        String manufacturer = "Mazda"
        String model = "6"
        Color color = Color.BLUE
        String registrationNumber = "F1 FLUENT"

        when:
        CarWithLombok car = CarWithLombok.builder()
                .color(color)
                .manufacturer(manufacturer)
                .model(model)
                .registrationNumber(registrationNumber)
                .build()

        then:
        car.getManufacturer() == manufacturer
        car.getModel() == model
        car.getRegistrationNumber() == registrationNumber
        car.getColor() == color
    }

    def "Car should be valid object"(){
        given:
        String manufacturer = "Toyota"
        String model = "Corolla"
        Color color = Color.GREEN
        String registrationNumber = "F2 FLUENT"

        when:
        Car car = Car.builder()
                .color(color)
                .manufacturer(manufacturer)
                .model(model)
                .registrationNumber(registrationNumber)
                .build()

        then:
        car.getManufacturer() == manufacturer
        car.getModel() == model
        car.getRegistrationNumber() == registrationNumber
        car.getColor() == color
    }
}
