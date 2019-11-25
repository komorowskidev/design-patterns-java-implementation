package pl.komorowskidev.designpatternsjavaimplementation.behavioral.templatemethod;

public abstract class Shape3D {

    private String shapeName;

    public Shape3D(String shapeName){
        this.shapeName = shapeName;
    }

    public final CalculatedShape3D getCalculatedShape3D(){
        System.out.println("shape: " + shapeName);
        System.out.println("calculating volume...");
        double volume = getVolume();
        System.out.println("calculating surface area...");
        double surfaceArea = getSurfaceArea();
        return new CalculatedShape3D(shapeName, volume, surfaceArea);
    }

    protected abstract double getVolume();

    protected abstract double getSurfaceArea();
}
