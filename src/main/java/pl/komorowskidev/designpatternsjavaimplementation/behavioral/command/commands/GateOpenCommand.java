package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Gate;

public class GateOpenCommand implements Command {

    private Gate gate;

    public GateOpenCommand(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void execute() {
        gate.open();
    }
}
