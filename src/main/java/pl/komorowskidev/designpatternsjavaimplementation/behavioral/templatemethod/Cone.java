package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod;

public class Cone extends Shape3D {

    private double radius;

    private double height;

    public Cone(double radius, double height) {
        super("Cone");
        this.radius = radius;
        this.height = height;
    }

    @Override
    protected double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height / 3.0;
    }

    @Override
    protected double getSurfaceArea() {
        double r2 = Math.pow(radius, 2);
        return Math.PI * r2 + Math.PI * radius * Math.sqrt((r2 + Math.pow(height, 2)));
    }
}
