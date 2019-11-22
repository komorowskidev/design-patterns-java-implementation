package pl.komorowskidev.designpatternsjavaimplementation.structural.adapter;

public interface Target {

    void setLatitude(double latitude);

    void setLongitude(double longitude);

    void setAltitudeMetersAboveMeanSeaLevel(double altitudeMetersAboveMeanSeaLevel);

    String getPoint();
}
