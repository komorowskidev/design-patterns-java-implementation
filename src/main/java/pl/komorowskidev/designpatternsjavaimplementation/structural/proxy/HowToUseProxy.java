package pl.komorowskidev.designpatternsjavaimplementation.structural.proxy;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;

public class HowToUseProxy implements HowToUse {

    @Override
    public void use() {
        System.out.println("PROXY");
        User user = new User("Hanna", 2);
        VideoRental videoRental = new VideoRentalProxy(new Notflox(), user);
        String title = "Peppa Pig";
        System.out.println("Movie request: " + title);
        try {
            Movie movie = videoRental.getMovie(title);
            System.out.println("you are watching: " + title);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
