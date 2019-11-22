package pl.komorowskidev.designpatternsjavaimplementation.structural.facade;

import lombok.Setter;

@Setter
public class Facade {

    private Bath bath;

    private Book book;

    private Entertainment entertainment;

    private Light light;

    private Pajamas pajamas;

    private Supper supper;

    private Teeth teeth;

    private Toys toys;

    public Facade(){
        bath = new Bath();
        book = new Book();
        entertainment = new Entertainment();
        light = new Light();
        pajamas = new Pajamas();
        supper = new Supper();
        teeth = new Teeth();
        toys = new Toys();
    }

    public void sleep(){
        supper.eat();
        bath.take();
        teeth.brush();
        pajamas.dress();
        toys.clean();
        entertainment.watch();
        book.read();
        light.turnOff();
        System.out.println("sleeping ...");
    }
}
