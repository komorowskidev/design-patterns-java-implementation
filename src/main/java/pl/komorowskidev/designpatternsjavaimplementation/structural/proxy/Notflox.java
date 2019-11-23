package pl.komorowskidev.designpatternsjavaimplementation.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class Notflox implements VideoRental {

    private Map<String, Movie> movieMap;

    public Notflox(){
        movieMap = new HashMap<>();
        movieMap.put("peppa pig", new Movie("Peppa Pig", 3));
    }

    @Override
    public Movie getMovie(String title) {
        return movieMap.get(title.toLowerCase().trim());
    }

    @Override
    public int getAgeRestrictions(String title) {
        return getMovie(title).getAgeRestriction();
    }
}
