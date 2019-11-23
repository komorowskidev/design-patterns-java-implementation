package pl.komorowskidev.designpatternsjavaimplementation.structural.proxy;

public interface VideoRental {

    Movie getMovie(String title) throws AgeException;

    int getAgeRestrictions(String title);
}
