package pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.commands;

import pl.komorowskidev.designpatternsjavaimplementation.behavioral.command.receivers.Gate;

public class GateCloseCommand implements Command {

    private Gate gate;

    public GateCloseCommand(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void execute() {
        gate.close();
    }
}
