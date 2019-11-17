package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.HeatingSystem;

public class HeatingOffCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingOffCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.off();
    }
}
