package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod;

public class Cube extends Shape3D {

    private double edge;

    public Cube(double edge) {
        super("Cube");
        this.edge = edge;
    }

    @Override
    protected double getVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    protected double getSurfaceArea() {
        return 6 * Math.pow(edge, 2);
    }
}
