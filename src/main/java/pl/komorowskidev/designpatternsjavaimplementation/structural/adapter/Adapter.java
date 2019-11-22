package pl.komorowskidev.designpatternsjavaimplementation.structural.adapter;

public class Adapter implements Target {

    private SomeLibraryPointOnMap someLibraryPointOnMap;

    public Adapter(SomeLibraryPointOnMap someLibraryPointOnMap){
        this.someLibraryPointOnMap = someLibraryPointOnMap;
    }

    @Override
    public void setLatitude(double latitude) {
        someLibraryPointOnMap.setLat(latitude);
    }

    @Override
    public void setLongitude(double longitude) {
        someLibraryPointOnMap.setLon(longitude);
    }

    @Override
    public void setAltitudeMetersAboveMeanSeaLevel(double altitudeMetersAboveMeanSeaLevel) {
        someLibraryPointOnMap.setAlt(altitudeMetersAboveMeanSeaLevel);
    }

    @Override
    public String getPoint() {
        return someLibraryPointOnMap.toString();
    }
}
