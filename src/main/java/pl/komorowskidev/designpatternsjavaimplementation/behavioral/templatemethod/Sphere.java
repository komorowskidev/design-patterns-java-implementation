package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod;

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    protected double getVolume() {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }

    @Override
    protected double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
