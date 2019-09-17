package pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder;

import lombok.ToString;

import java.awt.*;

@ToString
public class Car {

    private String manufacturer;

    private String model;

    private Color color;

    private String registrationNumber;

    private Car(){}

    public static Builder builder(){
        return new Car.Builder();
    }

    public static class Builder{

        private Car instance = new Car();

        public Builder(){}

        public Builder manufacturer(String manufacturer){
            instance.manufacturer = manufacturer;
            return this;
        }

        public Builder model(String model){
            instance.model = model;
            return this;
        }

        public Builder color(Color color){
            instance.color = color;
            return this;
        }

        public Builder registrationNumber(String registrationNumber){
            instance.registrationNumber = registrationNumber;
            return this;
        }

        public Car build(){
            return instance;
        }
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public Color getColor(){
        return color;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

}
