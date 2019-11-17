package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command;

import pl.komorowskidev.designpatternsjavaimplementation.HowToUse;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands.*;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.DogsInvoker;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.GateRemoteController;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.invokers.HeatingSystemController;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Dogs;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Gate;
import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.HeatingSystem;

public class HowToUseCommand implements HowToUse {

    @Override
    public void use() {
        System.out.println("COMMAND");
        Dogs chihuahua = new Dogs();
        DogsInvoker dogsInvoker = new DogsInvoker(new DogsReleaseCommand(chihuahua));
        Gate mainGate = new Gate();
        GateRemoteController gateRemoteController = new GateRemoteController(
                new GateOpenCommand(mainGate),
                new GateCloseCommand(mainGate));
        HeatingSystem centralHeatingSystem = new HeatingSystem();
        HeatingSystemController heatingSystemController = new HeatingSystemController(
                new HeatingOffCommand(centralHeatingSystem),
                new HeatingEconomyTemperatureCommand(centralHeatingSystem),
                new HeatingComfortableTemperatureCommand(centralHeatingSystem));

        System.out.println("We are going to the cinema.");
        System.out.println("1. Setting heating to economy mode...");
        heatingSystemController.setSetEconomyTemperature();
        System.out.println("2. Closing gate");
        gateRemoteController.closeButton();
        System.out.println("3. Activating security system...");
        dogsInvoker.release();
    }
}
