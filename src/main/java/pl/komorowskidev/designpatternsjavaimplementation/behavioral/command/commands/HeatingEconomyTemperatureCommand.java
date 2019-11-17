package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.HeatingSystem;

public class HeatingEconomyTemperatureCommand implements Command {

    private HeatingSystem heatingSystem;

    public HeatingEconomyTemperatureCommand(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    @Override
    public void execute() {
        heatingSystem.on();
        heatingSystem.setTemperature(17);
    }
}
