package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.Command;

public class HeatingSystemController {

    private Command heatingOffCommand;

    private Command heatingEconomyTemperatureCommand;

    private Command heatingComfortableTemperatureCommand;

    public HeatingSystemController(
            Command heatingOffCommand,
            Command heatingEconomyTemperatureCommand,
            Command heatingComfortableTemperatureCommand) {
        this.heatingOffCommand = heatingOffCommand;
        this.heatingEconomyTemperatureCommand = heatingEconomyTemperatureCommand;
        this.heatingComfortableTemperatureCommand = heatingComfortableTemperatureCommand;
    }

    public void off(){
        heatingOffCommand.execute();
    }

    public void setSetEconomyTemperature(){
        heatingEconomyTemperatureCommand.execute();
    }

    public void setSetComfortableTemperature(){
        heatingComfortableTemperatureCommand.execute();
    }
}
