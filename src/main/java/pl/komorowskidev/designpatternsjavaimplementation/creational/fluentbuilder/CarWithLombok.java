package pl.komorowskidev.designpatternsjavaimplementation.creational.fluentbuilder;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.awt.*;

@ToString
@Builder
@Getter
public class CarWithLombok {

    private String manufacturer;

    private String model;

    private Color color;

    private String registrationNumber;

}
