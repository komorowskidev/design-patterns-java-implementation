package pl.komorowskidev.designpatternsjavaimplementation.structural.proxy;

public class VideoRentalProxy implements VideoRental {

    private VideoRental videoRental;

    private User user;

    public VideoRentalProxy(VideoRental videoRental, User user){
        this.videoRental = videoRental;
        this.user = user;
    }

    @Override
    public Movie getMovie(String title) throws AgeException {
        if(user.getAge() < videoRental.getAgeRestrictions(title)){
            throw new AgeException("you are too young for this movie");
        }
        return videoRental.getMovie(title);
    }

    @Override
    public int getAgeRestrictions(String title) {
        return videoRental.getAgeRestrictions(title);
    }
}
