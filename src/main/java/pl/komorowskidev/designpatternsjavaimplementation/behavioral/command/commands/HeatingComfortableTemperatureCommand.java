package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.HeatingSystem;

public class HeatingComfortableTemperatureCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingComfortableTemperatureCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.on();
        heatingSystem.setTemperature(23);
    }
}
