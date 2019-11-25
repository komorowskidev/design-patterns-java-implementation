package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseTemplateMethod implements HowToUse {

    @Override
    public void use() {
        System.out.println("TEMPLATE METHOD");
        Shape3D cube = new Cube(4);
        System.out.println(cube.getCalculatedShape3D());
        Shape3D cone = new Cone(3, 8);
        System.out.println(cone.getCalculatedShape3D());
        Shape3D sphere = new Sphere(5);
        System.out.println(sphere.getCalculatedShape3D());
    }
}
