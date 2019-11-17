package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Dogs;

public class DogsReleaseCommand implements Command {

    private Dogs dogs;

    public DogsReleaseCommand(Dogs dogs){
        this.dogs = dogs;
    }

    @Override
    public void execute() {
        dogs.release();
    }
}
