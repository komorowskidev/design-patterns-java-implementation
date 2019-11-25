package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CalculatedShape3D {

    private String name;

    private double volume;

    private double surfaceArea;

}
