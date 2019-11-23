package pl.komorowskidev.designpatternsjavaimplementation.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

    private String title;

    private int ageRestriction;

}
