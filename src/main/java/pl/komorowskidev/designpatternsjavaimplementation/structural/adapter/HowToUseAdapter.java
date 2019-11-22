package pl.komorowskidev.designpatternsjavaimplementation.structural.adapter;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseAdapter implements HowToUse {

    @Override
    public void use() {
        System.out.println("ADAPTER");
        Target adapter = new Adapter(new SomeLibraryPointOnMap());
        System.out.println("setting data...");
        adapter.setLatitude(51.939903);
        adapter.setLongitude(15.506585);
        adapter.setAltitudeMetersAboveMeanSeaLevel(139);
        System.out.println("getting result:");
        System.out.println(adapter.getPoint());
    }
}
