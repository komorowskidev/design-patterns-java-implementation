package pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder;

import java.awt.*;

public class HowToUseFluentBuilder {

    public void use(){
        System.out.println("FLUENT BUILDER");
        Car car = Car.builder()
                .manufacturer("Ford")
                .model("Focus")
                .color(Color.RED)
                .registrationNumber("F0 BUILD")
                .build();

        CarWithLombok carWithLombok = CarWithLombok.builder()
                .manufacturer("Ford")
                .model("Focus")
                .color(Color.RED)
                .registrationNumber("F0 BUILD")
                .build();

        System.out.println(car);
        System.out.println(carWithLombok);
    }
}
